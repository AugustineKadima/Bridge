package integers;

public class FindMissingNumber {
    public static int missingNumber(int[] nums){
        int sum1 = 0;
        for(int num:nums){
            sum1 += num;
        }
        int sum2 = 0;
        for(int i = 0; i < nums.length +1; i++){
            sum2 += i;
        }

        return sum2 - sum1;
    }
    public static void main(String[] args) {
        int result = FindMissingNumber.missingNumber(new int[]{0,3,4,1});
        System.out.println(result);
    }
}
