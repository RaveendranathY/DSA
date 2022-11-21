import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args){

        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};

        int r = arr1.length-1;
        int j = arr2.length-1;
        int i = 2;

        while(i >= 0 && j >=0){

            if(arr2[j] > arr1[i]){

                arr1[r] = arr2[j];
                j--;

            }else {
                arr1[r] = arr1[i];
                i--;

            }
            r--;

        }

        System.out.println(Arrays.toString(arr1));

    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] res = new int[arr1.length+ arr2.length];

        int i=0,j=0,k=0;

        while(i < arr1.length && j  < arr2.length){

            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length){
            res[k] = arr1[i];
            k++;
            i++;
        }

        while(j < arr2.length){
            res[k] = arr2[j];
            k++;
            j++;
        }

        return res;

    }
}
