public class MaximumSubArraySum {

    public static void main(String[] args){

        System.out.println(maximumSubArraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }

    public static int maximumSubArraySum(int[] arr){

        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0; int end=0; int s=0;

        for(int i=0;i<arr.length;i++){

            curr_sum = curr_sum+arr[i];

            if(curr_sum > max_sum){

                max_sum= curr_sum;
                start = s;
                end = i;
            }
            if(curr_sum < 0){
                curr_sum = 0;
                s = i+1;
            }

        }

        for(int k=start; k<=end;k++)
            System.out.print(arr[k]+ " ");
        System.out.println();
        return max_sum;

    }
}
