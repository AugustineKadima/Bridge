package integers;

public class ProductExceptSelfTwo {
    public static int[] findProduct(int[] nums){
        int[] result = new int[nums.length];
        int tmp = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = tmp;
            tmp *= nums[i];
        }

        tmp = 1;
       for(int i = nums.length - 1; i >=0; i--){
            result[i] *= tmp;
            tmp *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] results = ProductExceptSelfTwo.findProduct(new int[] {1,2,3,4});
        for(int i:results) System.out.println("Output: "+i);
    }
}
/*
Pseudocode
_______________
Loop1

output = [0,0,0,0]
input = [1,2,3,4]
tmp = 1
output[i] = tmp
tmp *= nums[i] => 1*1

output = [1,1,0,0]
tmp = 1
output[i] = tmp
tmp *= nums[i] => 1 * 2

output = [1,1,2,0]
tmp = 2
output[i] = tmp
tmp *= nums[i] => 2 * 3

output = [1,1,2,0]
tmp = 2
output[i] = tmp
tmp *= nums[i] => 2 * 3

output = [1,1,2,6]
tmp = 6
output[i] = tmp
-------------------------

Loop2

nums = [1,2,3,4]
result = [1,1,2,6]

tmp = 1
result[i] *= tmp => 6 * 1 = 6
tmp *= nums[i] => 1 * 4 = 4
output = [1,1,2,6]

tmp = 1
result[i] *= tmp => 2 * 4 = 8
tmp *= nums[i]
output = [1,1,8,6]






 */
