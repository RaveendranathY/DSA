import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        //{68, 85, 10, 80, 79, 33, 21, 54, 85, 85}

        for(int i=0; i<arr.length;i++){
            arr[i] = random.nextInt(100);
        }

        System.out.println("***** Before sorting ******");
        System.out.println(Arrays.toString(arr));

        System.out.println("***** After sorting ******");
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}