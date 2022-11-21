public class CountInversions {

    public static void main(String[] args){

        int[] arr = new int[]{ 9, 7, 3, 6,2};

        int count =0;

        for(int i=0; i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i] > arr[j])
                    count++;
            }
        }

        System.out.println(count);

    }
}
