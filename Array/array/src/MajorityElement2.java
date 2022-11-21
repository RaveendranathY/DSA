import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElement2 {

    public static void main(String[] args){

        int[] nums = new int[]{3,2,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){

            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }

        List<Integer> res = map.entrySet().stream().
                filter(x->x.getValue()> nums.length/3).
                map(x->x.getKey()).collect(Collectors.toList());

        System.out.println(res);

    }
}
