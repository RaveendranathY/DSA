public class StockBuyAndSell {

    public static void main(String[] args){

        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(max_profit(arr));

    }

    public static int max_profit(int[] arr){

        int max_profit = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i])
                 max_profit = Math.max(max_profit,arr[j]-arr[i]);
            }
        }
        return max_profit;
    }


}
