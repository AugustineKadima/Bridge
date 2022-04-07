package integers;

public class FindSumToTarget {
    public static int[] twoSum(int[] nums, int target){
        if (nums.length < 2) {
            return new int[] {-1, -1};
        }

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                if (complement == nums[j]  && i != j){
                    return new int[] {i,j};
                }

            }
        }

        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
    int[] result = FindSumToTarget.twoSum(new int[]{2,9,37,11,15}, 39);
        for(int i: result)System.out.println(i);
    }
}
