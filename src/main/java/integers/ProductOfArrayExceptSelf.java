package integers;

public class ProductOfArrayExceptSelf {
    public static int[] findProduct(int[] nums){

        int[] output = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }

            output[i] = product;
            product = 1;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] results = ProductOfArrayExceptSelf.findProduct(new int[] {1,2,3,4});
        for(int i:results) System.out.println("Output: "+i);
    }
}

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

//Pseudocode
//------------
//Loop
//find product
//Store product in a new array
//Return new array

//Time complexity = O(n2)
//Space complexity = O(n)