package integers;


import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelfTwo {
    public static int[] findProduct(int[] nums){

        int[] output = new int[nums.length];
        int total = 1;
        for(int i =0; i < nums.length; i++){
            total *= nums[i];
        }
        for(int i =0; i < nums.length; i++){
            output[i] = total/ nums[i];
        }


        return output;
    }
    public static void main(String[] args) {
        int[] results = ProductOfArrayExceptSelfTwo.findProduct(new int[] {1,2,3,4});
        for(int i:results) System.out.println("Output: "+i);
    }
}
//time complexity = O(n)
//space complexity = O(n)
