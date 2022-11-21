import java.util.*;

public class MergeTwoIntervals {

    public static void main(String[] args){

        int[][] input = new int[][]{{1,3},{2,6},{8,10},{15,18}};

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<input.length;i++){

            if(res.isEmpty() || res.get(res.size()-1).get(1)<input[i][0]){

                res.add(Arrays.asList(new Integer[]{input[i][0],input[i][1]}));
            }else{
                res.get(res.size()-1).set(1,input[i][1]);
            }
        }

      //  res.forEach(x-> System.out.println(x));

        int[][] final_res = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            final_res[i][0] = res.get(i).get(0);
            final_res[i][1] = res.get(i).get(1);
        }

        Arrays.stream(final_res).forEach(x-> System.out.println(Arrays.toString(x)));
    }

    public static boolean isMerge(int[] arr1,int[] arr2){

        if(arr1[0] <= arr2[0] && arr2[0] <= arr1[1])
             return true;

        return false;
    }
}
