import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class MajorityElement {

    public static void main(String[] args){

        int[] arr = new int[]{2,2,3,1,1,2};

        int count = 0;
        int element = arr[0];

        for(int i=0;i<arr.length;i++){

            if(element == arr[i])
                count++;
            else{
                count--;

            }

        }

        System.out.println(element);
    }


}
