public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = new int[]{-1,0,1,2,3,4,7,9,10,20};
        System.out.println(binarySearchWithRecursion(arr,0,arr.length-1,9));

    }

    public static boolean binarySearchWithRecursion(int[] arr,int left, int right, int target){

        // what is the base case
           if(left > right)
               return false;



        // what is the laziest work I can contribute to the problem
          int mid = left + (right-left)/2;
          if(arr[mid] == target)
              return true;
          else if (arr[mid] > target)
              return binarySearchWithRecursion(arr, left,mid-1,target);
          else
              return binarySearchWithRecursion(arr, mid+1,right,target);


    }
    public static boolean binarySearch(int[] arr, int target){

        int left = 0, right = arr.length-1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(arr[mid] == target)
                return true;
            else if(arr[mid]> target){
                right = mid-1;
            }else
                left = mid+1;

        }

        return false;
    }
}
