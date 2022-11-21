public class MissingNumberInArray {

    public static void main(String[] args){

        int n = 8;
        int[] arr = new int[]{1, 2, 4, 3, 7, 5, 6};

       // int missingNumber = sumOfNNumbers(n) - sumOfElements(arr);
       // System.out.println(missingNumber);

        missingNumber(arr,n);

    }

    public static void missingNumber(int[] arr,int n){

        int xor = 1;
        for(int i=2; i<=n;i++)
            xor = xor ^ i;

        for(int i=0; i<arr.length;i++)
            xor = xor ^ arr[i];

        System.out.println(xor);
    }

    public static int sumOfNNumbers(int n){

        return n*(n+1)/2;
    }

    public static int sumOfElements(int[] arr){
        int sum =0;
        for(int i =0 ;i<arr.length;i++)
            sum = sum + arr[i];
        return sum;
    }


}
