import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] args){

        int[] arr = new int[]{9,7,3,6,2};
        int[] temp = new int[arr.length];

        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,temp,0,arr.length-1);

        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(temp));

    }

    public static void merge(int[] arr,int[] temp,int left,int mid, int right){

        int n1 = mid-left+1;
        int n2 = right-mid;

        int i=0,j=0,k=left;

        while(i<n1 && j<n2){

            if(arr[i+left] < arr[j+mid+1]){
                temp[k] = arr[i+left];
                i++;
            }else{
                temp[k] = arr[j+mid+1];
                j++;
            }
            k++;

        }

        while(i<n1){
            temp[k] = arr[i+left];
            i++;
            k++;
        }
        while(j<n2){
            temp[k] = arr[mid+1+j];
            j++;
            k++;

        }

        for(int x=left; x<=right ;x++)
            arr[x] = temp[x];

    }
    public static void mergeSort(int[] arr,int[] temp, int left, int right){

        if(left < right){
            int mid = left + (right-left)/2;
            mergeSort(arr, temp,left,mid);
            mergeSort(arr,temp,mid+1,right);
            merge(arr,temp,left,mid,right);
        }

    }

}
