import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){

        int[] arr = new int[] {-1,0,1,2,-1,-2,-4};
        int sum = 0;

        //twoSum(arr,sum);
        System.out.println("********");
        twoSumWithHashmap(arr,sum);
        System.out.println("********");
        twoSumWithSorting(arr,sum);

    }

    public static void twoSum(int[] arr, int sum){

        for(int i=0; i< arr.length;i++){

            for(int j=i+1; j<arr.length;j++){

                if(arr[i] + arr[j] == sum)
                    System.out.println(arr[i] + " ... " + arr[j]);

            }
        }

    }

    public static void twoSumWithHashmap(int[] arr, int sum){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){

            if(map.containsKey(sum-arr[i]))
                System.out.println(arr[i] + "..." + (sum-arr[i]));
            else
                map.put(arr[i],i);
        }

    }

    public  static void twoSumWithSorting(int[] arr, int sum){
        Arrays.sort(arr);
        int i =0,j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == sum)
                System.out.println(arr[i++] + " ... " + arr[j--]);
            else if (arr[i] + arr[j] <sum)
                i++;
            else
                j--;
        }
    }
}
