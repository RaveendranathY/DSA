import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int[] candidates = new int[]{2};
        combinationSum(candidates,1).forEach(System.out::println);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();

        func(candidates,res,0,0,target,new ArrayList<>());
        return res;

    }

    private static void func(int[] candidates, List<List<Integer>> res, int i, int sum, int target,
                             List<Integer> curr) {

        //base case
        if(sum > target)
            return;
        if(i == candidates.length)
            return;

        if(sum == target){
            res.add(new ArrayList<>(curr));
            return;
        }

        //include
        curr.add(candidates[i]);
        func(candidates,res,i,sum+candidates[i],target,curr);

        //exclude
        curr.remove(curr.size()-1);
        func(candidates,res,i+1,sum,target,curr);

    }
}
