import java.util.Random;

public class QuickSort {

    public static void sort(int[] arr){

        sort(arr, 0,arr.length-1);
    }

    private static void sort(int[] arr, int low, int high ) {
        
        if(low < high){
            
            int part = partition(arr,low,high);
            
            sort(arr,low,part-1);
            sort(arr,part+1,high);
            
        }
        
        
    }

    private static int partition(int[] arr, int low, int high) {

        int pivotIndex = new Random().nextInt(high-low) + low;
        int pivot = arr[pivotIndex];

        swap(arr,pivotIndex,high);
        int left = low;
        int right = high;

        while(left < right){

            while(left<right && arr[left] <= pivot) left++;
            while(left<right && arr[right]>= pivot) right--;

            swap(arr,left,right);

        }
        swap(arr,left,high);
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
