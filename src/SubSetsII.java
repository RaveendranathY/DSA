import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubSetsII {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2};

        subsetsWithDup(nums).forEach(System.out::println);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums){

        List<List<Integer>> res = new ArrayList<>();

        func(nums,res,0,new ArrayList<Integer>());

        //helper(nums,0,res,new ArrayList<>());
        return res;
     }

    private static void func(int[] nums, List<List<Integer>> res, int i, List<Integer> curr_List) {
        // base case

        if(i== nums.length){
            res.add(new ArrayList<>(curr_List));
            return;
        }

        curr_List.add(nums[i]);
        func(nums,res,i+1,curr_List);


        curr_List.remove(curr_List.size()-1);
        func(nums,res,i+1,curr_List);

    }

    public static void helper(int[] nums, int index, List<List<Integer>> ans, List<Integer> subset)
    {

        if(index==nums.length)
        {
            ans.add(new ArrayList(subset));
            return;
        }

        //include
        subset.add(nums[index]);
        helper(nums,index+1,ans,subset);

     /*   //exclude
        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }*/
        subset.remove(subset.size()-1);
        helper(nums,index+1,ans,subset);
    }

}
