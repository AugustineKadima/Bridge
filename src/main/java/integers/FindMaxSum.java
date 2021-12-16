package integers;

public class FindMaxSum {
    public static int findMaxSum(int[] nums, int subArraySize){
        if(subArraySize > nums.length) return -1;

        int maxSum = 0;
        for(int i = 0; i <= nums.length - subArraySize; i++){
            int windowSum = 0;
            for(int j = i; j < i + subArraySize; j++){
                windowSum += nums[j];
            }
            maxSum = Math.max(maxSum,windowSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int result = FindMaxSum.findMaxSum(new int[]{1,9,-1,-2,6,3,-1,2}, 4);
        System.out.println(result);

    }
}
//Brute force solution
//initialize max sum;
//Loop through nums
//create an inner loop to compute the sum of sub array
//Compare the sum of sub array to max sum and return the largest

//Time complexity = O(n2)
//Space complexity = O(1)
