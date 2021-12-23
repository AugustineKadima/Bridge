package integers;

public class FindMaxContiguousSum {
    public static int findSum(int[] nums){
        if(nums.length == 1) return nums[0];
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > sum){
                sum = nums[i];
            }else{
                sum += nums[i];
                max = Math.max(sum, max);
            }

        }


        max = Math.max(sum, max);
        return max;
    }
    public static void main(String[] args) {
        int results = FindMaxContiguousSum.findSum(new int[] {1});
        System.out.println(results);
    }
}

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

//Input: nums = [1]
//Output: 1

//Input: nums = [5,4,-1,7,8]
//Output: 23

//Pseudocode
//____________
//Loop through nums
//track sum
//if nums[i] > sum then  sum = nums[i]
//else sum = sum + nums[i]
