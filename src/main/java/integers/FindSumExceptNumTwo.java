package integers;

public class FindSumExceptNumTwo {
    public static int[] findSum(int[] nums){
        if(nums.length == 0) return new int[] {-1, -1};
        int[]  output = new int[nums.length];
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            output[i] = totalSum - nums[i];
        }
        return  output;
    }

    public static void main(String[] args) {
        int[] result = FindSumExceptNumTwo.findSum(new int[] {1,2,3,4});
        for(int i : result) System.out.println(i);

    }
}
//Pseudocode
//______________
//Loop through the array
//record total sum
//loop again and subtract nums[i] from totalSum
//push the new result to output array

//Time complexity = O(n)
//Space complexity = O(n)
