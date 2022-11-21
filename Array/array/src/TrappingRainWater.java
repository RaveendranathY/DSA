import java.lang.reflect.Array;
import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args){
        //[0,1,0,2,1,0,1,3,2,1,2,1]
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapWithOutExtraSpace(arr));

    }

    public static int trap(int[] height) {

       // water stored at any index = min(left_max,right_max) - arr[index]

        int[] prefix_leftMax = new int[height.length];
        int[] suffix_rightMax = new int[height.length];

        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
        int res = 0;

        // creating prefix_leftMax array
        for(int i=0; i<height.length; i++){
            left_max = Math.max(left_max,height[i]);
            prefix_leftMax[i] = left_max;
        }
        // creating suffix_rightMax array
        for(int j=height.length-1; j>=0; j--){
            right_max = Math.max(right_max,height[j]);
            suffix_rightMax[j] = right_max;
        }

        for(int i=0; i<height.length; i++)
            res += Math.min(prefix_leftMax[i],suffix_rightMax[i]) - height[i];


        return res;
    }

    public static int trapWithOutExtraSpace(int[] height){

        int left_max = Integer.MIN_VALUE, right_max = Integer.MIN_VALUE;

        int l=0,r=height.length-1,res=0;

        while(l<r){

            if(height[l] <= height[r]){

                if(left_max<height[l])
                    left_max = height[l];
                else
                    res += left_max-height[l];

                l++;
            }else{

                if(right_max < height[r])
                    right_max = height[r];
                else
                    res += right_max-height[r];

                r--;
            }

        }

        return res;
    }
}
