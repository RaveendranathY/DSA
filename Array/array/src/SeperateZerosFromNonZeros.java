import java.util.Arrays;

public class SeperateZerosFromNonZeros {

    public static void main(String[] args){

        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});

        System.out.println("*******************************");

        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});

    }

    public static void moveZerosToEnd(int[] arr){

        int count = 0;

        for(int i=0; i<arr.length;i++){

            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }

        }
        while (count < arr.length){
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToFront(int[] arr){

        int count= arr.length-1;

        for(int i= arr.length-1; i>=0;i--){

            if(arr[i] != 0){
                arr[count] = arr[i];
                count--;
            }

        }
        while(count >=0){
            arr[count] = 0;
            count --;
        }

        System.out.println(Arrays.toString(arr));
    }


}
