import java.util.Arrays;


public class RotateArray {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotateArray(arr,3);

    }

    public static void rotateArray(int[] nums, int k){
        k = k % nums.length;
        reverseArr(nums,0,nums.length-1);
        reverseArr(nums,0,k-1);
        reverseArr(nums,k,nums.length-1);
      /*  int temp = 0;
        k = k % nums.length;
        while(k>0){
            int i= nums.length-1;
            temp = nums[nums.length-1];
            while(i>0){
                nums[i] = nums[i-1];
                i--;
            }
            nums[i] = temp;

            k--;
        }*/


        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArr(int[] nums,int left, int right) {

        while(left < right){
            swapNumbers(nums,left,right);
            left++;
            right--;
        }

    }

    private static void swapNumbers(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }


}
