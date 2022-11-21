import java.util.*;

public class ThreeSumZero {

    public static void main(String[] args){
        //
        int[] arr = new int[] {-1,0,1,2,-1,-4};
       // Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        threeSumZero(arr);

    }

    public static void threeSumZero(int[] arr){

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            int curr_sum = 0-arr[i];
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=0; j<arr.length; j++){

                if(j !=i) {

                    if (map.containsKey(curr_sum - arr[j])) {

                        res.add(Arrays.asList(arr[i], arr[j], curr_sum - arr[j]));
                    } else
                        map.put(arr[j], j);
                }
            }

            res.stream().forEach(System.out::println);

        }

    }
}
