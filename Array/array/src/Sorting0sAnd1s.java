import java.util.Arrays;

public class Sorting0sAnd1s {

    public static void main(String[] args){


        int[] arr = new int[]{1, 0, 1, 1, 0, 1, 0, 1};

        System.out.println(Arrays.toString(arr));
        sort(arr);

      /*  int count =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] ==0)
                count++;
        }

        for(int i=0; i<count;i++){
            arr[i] = 0;
        }
        for(int i=count; i<arr.length;i++)
            arr[i] = 1;

        System.out.println(Arrays.toString(arr));*/
    }



    public static void sort(int[] inputArray){
        int left = 0;

        int right = inputArray.length-1;

        System.out.println("Input Array Before Sorting : "+Arrays.toString(inputArray));

        while (left < right)
        {
            if (inputArray[left] == 1)
            {
                //Swapping

                inputArray[right] = inputArray[right] + inputArray[left];
                inputArray[left] = inputArray[right] - inputArray[left];
                inputArray[right] = inputArray[right] - inputArray[left];

                right--;
            }
            else
            {
                left++;
            }
        }

        System.out.println(Arrays.toString(inputArray));
    }

}
