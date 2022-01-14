package integers;

public class FindSumExceptNum {
    public int[] findSum(int[] nums){
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums.length; j++){
                sum += nums[j];
            }
            output[i] = sum - nums[i];
        }

        return output;
    }
    public static void main(String[] args) {
        FindSumExceptNum findSumExceptNum = new FindSumExceptNum();
        int[] result = findSumExceptNum.findSum(new int[]{1,2,3});
        for(int i: result)System.out.println(i);
    }
}
//Pseudocode
//-------------
//loop through array
//store num[i] in variable
//add all nums in array
//subtract num[i] from nums
//push new sum to output array
//return output array

//Time complexity = O(n2)
//Space complexity = O(n)