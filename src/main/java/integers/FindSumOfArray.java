package integers;

public class FindSumOfArray {
    public static int sum(int[] nums){
        int total = 0;
        for(int i =0; i < nums.length; i++){
            total += nums[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int result = FindSumOfArray.sum(new int[] {2,4,5,1});
        System.out.println(result);
    }
}
//Pseudocode
//loop
//add to total

//Time complexity = O(n)
//Space complexity = O(1)
