package integers;

public class TargetSum {
    public static int[] findComplementIndices(int[] nums, int target){
        for(int i = 0; i < nums.length -1; i++){
            for(int j = 0; j < nums.length; j++){
                if((nums[i] + nums[j] == target) && i != j){
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] results = TargetSum.findComplementIndices(new int[]{2,5,8,7}, 9);
        for(int i:results) System.out.println(i);
    }
}
