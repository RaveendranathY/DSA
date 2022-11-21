import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args){

        int[] arr = new int[]{0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int max = 0, count = 1;
        for(int i=0; i<arr.length-1; i++){

            if((arr[i] + 1 == arr[i+1]) ) {
                System.out.println("super");
                count++;
            }
            else{
                System.out.println(count);
                max = Math.max(max, count);
                count = 1;
            }

        }
        System.out.println(count);
        max = Math.max(count,max);
        System.out.println(max);
    }
}
