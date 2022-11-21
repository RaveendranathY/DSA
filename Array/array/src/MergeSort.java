import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){

        int arr[] = { 9, 7, 3, 6,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

   public static int merge(int array[], int left, int mid, int right) {

        int n1 = mid-left+1;
        int n2 = right-mid;
        int inversionCount = 0;

        int[] l1 = new int[n1];
        int[] l2 = new int[n2];

        for(int i=0;i<n1;i++)
            l1[i] = array[i+left];
        for(int i=0;i<n2;i++)
           l2[i] = array[i+mid+1];

        int i=0,j=0,k= left;

        while(i<n1 && j<n2){

            if(l1[i] < l2[j]){

                array[k] = l1[i];
                i++;
            }else{
                array[k] = l2[j];
                j++;
                inversionCount = inversionCount+n1-i;
            }
            k++;
        }
        while(i<n1){
            array[k] = l1[i];
            k++;
            i++;
        }
        while(j<n2){
            array[k] = l2[j];
            j++;
            k++;
        }
        return inversionCount;
    }
    public static int mergeSort(int array[], int left, int right) {
        int inversionCount = 0;
        if(left < right){

            int mid = (left + right)/2;

            inversionCount += mergeSort(array,left,mid);
            inversionCount += mergeSort(array,mid+1,right);
            inversionCount += merge(array,left,mid,right);


        }
        return inversionCount;
    }

}
