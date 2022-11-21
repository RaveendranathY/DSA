import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static void main(String[] args){

        int[] arr = new int[]{1000000000,1000000000,1000000000,1000000000};

        fourSum(arr,-294967296).forEach(System.out::println);
        //threeSum(arr,0,0).forEach(System.out::println);

    }

    public static List<List<Integer>> fourSum(int[] nums, int target){

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int i=0;

        while(i < nums.length-3){

            int curr_target = target - nums[i];
            List<List<Integer>> curr_res = threeSum(nums,i+1,curr_target);
            if(!curr_res.isEmpty()){

               for(List<Integer> list : curr_res){
                   List<Integer> list1 = new ArrayList<>();
                   list1.add(nums[i]);
                   list1.addAll(list);
                   res.add(list1);
               }
            }

            while(i< nums.length-4 && nums[i] == nums[i+1]) i++;
            i++;

        }
        return res;
    }
    public static List<List<Integer>> threeSum(int[] nums,int start,int target){

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int i=start;
        while(i< nums.length-2){

            int curr_sum = target- nums[i];

            int low = i+1;
            int high = nums.length-1;

            while(low < high){

                if(nums[low] + nums[high] == curr_sum){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low+1])low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                }
                else if(nums[low] + nums[high] < curr_sum)
                    low++;
                else
                    high--;

            }
            while(i< nums.length-3 && nums[i] == nums[i+1])i++;

            i++;

        }

        return res;
    }
}
