public class MergeSort {


    public static void sort(int[] arr){

         sort(arr,0, arr.length-1);

    }

    private static void sort(int[] arr, int low, int high){

        if(low < high){

            int mid = low + (high - low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);

        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {

        // size of 2 arrays
        int n1 = mid-low+1;
        int n2 = high-mid;

        //create two arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy the data
        for(int i=0;i<n1;i++) left[i] = arr[i+low];
        for(int j=0;j<n2;j++) right[j] = arr[j+mid+1];

        //initialize the variables
        int i=0,j=0,k=low;

        while(i<n1 && j<n2){
            if(left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];

    }

}
