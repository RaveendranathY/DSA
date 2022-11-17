import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String[] args) {
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        combinationSum2(candidates,8).forEach(System.out::println);
    }

    public  static List<List<Integer>> combinationSum2(int[] candidates, int target){
        
        List<List<Integer>> res = new ArrayList<>();
        func(candidates,res,0,0,target,new ArrayList<>());
        return res;
    }

    private static void func(int[] candidates, List<List<Integer>> res, int i, int sum,
                             int target,List<Integer> curr) {

        //base case
        if(sum == target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i== candidates.length){
            return;
        }

        //Include
        curr.add(candidates[i]);
        func(candidates,res,i+1,sum+candidates[i],target,curr);

        //Exclude
         while(i < candidates.length-1 && candidates[i] == candidates[i+1])
             i++;
        curr.remove(curr.size()-1);
        func(candidates,res,i+1,sum,target,curr);


    }
}
