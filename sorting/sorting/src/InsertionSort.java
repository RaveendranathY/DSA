public class InsertionSort {

    public static void sort(int[] arr){

        for(int i=1; i< arr.length;i++){

            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr, j,j-1);
                j--;
            }
        }


    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
