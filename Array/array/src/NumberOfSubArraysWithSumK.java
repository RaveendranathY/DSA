import java.util.HashMap;

public class NumberOfSubArraysWithSumK {

    public static void main(String[] args){

        int[] arr = new int[]{10 , 2, -2, -20, 10};

        System.out.println(findSubArraySum(arr, 5,-10));


    }


    public static int findSubArraySum(int [] Arr, int N, int k){


        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap();

        for(int i=0; i<N;i++){

            sum = sum + Arr[i];

            if(sum == k)
                count ++;

            if(map.containsKey(sum - k)){

                count += map.get(sum-k);

            }

            if(map.containsKey(sum))
                map.put(sum, map.get(sum) +1);
            else
                map.put(sum, 1);

        }

        return count;
    }
}
