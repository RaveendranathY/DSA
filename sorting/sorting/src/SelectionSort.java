public class SelectionSort {

    public static void sort(int[] arr){
        int curr_smallest = 0;
        int curr_smallest_index = 0;

        for(int i=0; i<arr.length; i++){

            curr_smallest_index = i;
            curr_smallest = arr[i];
            for(int j= i+1; j<arr.length; j++){
                if(arr[j] < curr_smallest){
                    curr_smallest = arr[j];
                    curr_smallest_index =j;
                }

            }
            swap(arr,i,curr_smallest_index);

        }

    }

    private static void swap(int[] arr, int i, int curr_smallest_index) {
        int temp = arr[i];
        arr[i] = arr[curr_smallest_index];
        arr[curr_smallest_index] = temp;
    }
}
