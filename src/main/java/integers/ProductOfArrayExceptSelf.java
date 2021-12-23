package integers;

public class ProductOfArrayExceptSelf {
    public static int[] findProduct(int[] nums){
        int productLeft = 1;
        int productRight = 1;
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(i == 0) productLeft = 1;
                else productLeft *= nums[j];

            }

            for(int j = i+1; j < nums.length; j++){
                productRight *= nums[j];
            }

            System.out.println("left = " + productLeft);
            System.out.println("right = " + productRight);

            output[i] = productLeft + productRight - 1;

        }

        return output;
    }
    public static void main(String[] args) {
        int[] results = ProductOfArrayExceptSelf.findProduct(new int[] {1,2,3,4});
        for(int i:results) System.out.println(i);
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