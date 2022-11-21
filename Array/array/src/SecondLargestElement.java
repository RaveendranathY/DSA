public class SecondLargestElement {

    public static void main(String[] args){
        System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));

        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

        System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

        System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
    }

    public static int secondLargest(int[] arr){

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i=0; i< arr.length;i++){

            if(max < arr[i]){
                sec_max = max;
                max = arr[i];
            } else if (sec_max < arr[i] && max > arr[i]) {
                sec_max = arr[i];
            }

        }
        return sec_max;
    }

}
