import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfAArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};

        permute(nums).forEach(System.out::println);
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        func(nums,0,res);
        return res;
    }

    private static void func(int[] nums, int index,List<List<Integer>> res) {

        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            Arrays.stream(nums).forEach(list::add);
            res.add(list);
            return;
        }

        for(int i=index; i<nums.length; i++){

            swap(nums,index,i);
            func(nums,index+1,res);
            swap(nums,i,index);

        }


    }

    private static void swap(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
