public class LeadersInArray {

    public static void main(String[] args){

        findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});

        findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});

        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});

        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});



    }

    public static void findTheLeaders(int [] arr){

        int max = arr[arr.length-1];

        System.out.print(max + " ");

        for(int i = arr.length-2; i>=0;i--){

            if(max < arr[i]){
                System.out.print(arr[i] + " ");
                max = arr[i];
            }

        }

        System.out.println("----------------------");


    }
}
