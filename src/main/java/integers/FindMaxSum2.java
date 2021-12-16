package integers;

public class FindMaxSum2 {
    public static int maxSum(int[] nums, int k){

        if(k > nums.length) return -1;

        int maxSumVal = 0;
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
            maxSumVal += nums[i];
        }

        for(int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i - k];
            maxSumVal = Math.max(windowSum, maxSumVal);
        }

        return maxSumVal;
    }
    public static void main(String[] args) {
        int result = FindMaxSum2.maxSum(new int[]{166,9,-1,-2,6,3,-1,2}, 4);
        System.out.println(result);
    }
}
//Pseudocode
//
//Loop through the window
//record window sum and store it as the initial sum
//loop through the whole array from k to n - 1 and compute the window sum while subtracting the first value and adding the new value
//Compare window sum and max sum and return max sum