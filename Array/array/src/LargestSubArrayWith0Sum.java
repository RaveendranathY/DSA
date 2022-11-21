import java.util.HashMap;

public class LargestSubArrayWith0Sum {

    public static void main (String[] args){


        int [] arr = new int[]{15,-2,2,-8,1,7,10,23};

        int max = Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){

            sum = sum + arr[i];

            if(sum == 0)
                max = Math.max(max, i+1);
            else{
                if(map.containsKey(sum))
                    max = Math.max(max,i-map.get(sum));
                else
                    map.put(sum,i);
            }

        }

        System.out.println(max);

    }
}
