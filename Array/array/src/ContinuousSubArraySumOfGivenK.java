import java.util.ArrayList;

public class ContinuousSubArraySumOfGivenK {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,7,5};
        int sum = 12;

        /*for(int i=0; i< arr.length; i++){

            for(int j=i; j<arr.length;j++){
                int curr_sum = 0;
                for(int k=i; k<=j;k++){
                    curr_sum += arr[k];
                    //System.out.print(arr[k] + " ");
                }
               // System.out.println();
                if(curr_sum == sum) {
                    System.out.println(true);
                    System.out.println(i);
                    System.out.println(j);
                }
            }
           // System.out.println("********");

        }*/
        System.out.println(subArraywithSum(arr,arr.length,sum));
    }
    public static ArrayList<Integer> subArraywithSum(int[] arr, int n, int s){

        ArrayList<Integer> res = new ArrayList();

        int curr_sum = 0;
        int start = 0;

        for(int i=0;i<n;i++){

            curr_sum = curr_sum + arr[i];

            while(curr_sum > s && s < i){
                curr_sum = curr_sum -arr[start];
                start++;
            }

            if(curr_sum == s){
                res.add(start+1);
                res.add(i+1);
                return res;
            }


        }

        res.add(-1);
        return res;


    }
}
