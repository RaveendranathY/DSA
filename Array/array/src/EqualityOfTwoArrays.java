import java.util.Arrays;

public class EqualityOfTwoArrays {

    public static void main(String[] args){

        int[] arr1 = new int[]{2,5,1,7,4};
        int[] arr2 = new int[]{2,5,2,7,4};


        System.out.println(equalityOfTwoArrays(arr1,arr2));

    }

    public static boolean equalityOfTwoArrays(int[] arr1, int[] arr2){

       /* if(arr1.length != arr2.length)
            return  false;

        for(int i=0; i< arr1.length;i++){

            if(arr1[i] != arr2[i])
                return  false;
        }
        return true;*/

        return Arrays.equals(arr1,arr2);
    }



}
