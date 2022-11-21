import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args){

        int[] arr = new int[] {1,3,5,4,2};
/*
        int i = arr.length-2;

        while(i>=0 && arr[i] > arr[i+1]) i--;

        int j = arr.length-1;
        while(j>=0 && arr[j] < arr[i]) j--;

        swap(arr,i,j);

        reverse(arr,i+1,arr.length-1);*/

        System.out.println(Arrays.toString(nextPermutation(arr)));

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end){

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    public static int[] nextPermutation(int[] arr){

        int i = arr.length-2;

        while(i>=0 && arr[i] > arr[i+1]) i--;

        if(i>=0){

            int j = arr.length-1;
            while(j>=0 && arr[j] < arr[i]) j--;
            swap(arr,i,j);
        }
       reverse(arr,i+1,arr.length-1);
        return arr;

    }
}
