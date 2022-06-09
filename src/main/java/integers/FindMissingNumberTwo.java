package integers;

public class FindMissingNumberTwo {
    public  static int missingNumber(int[] nums){
        int sum2 = 0;
        int sum1 = 0;
        int i = 1;
        for(int num:nums){
            sum1 += num;
            sum2 += i;
            i++;
        }
        return sum2 - sum1;
    }
    public static void main(String[] args) {
        int result = FindMissingNumberTwo.missingNumber(new int[]{0,3,1});
        System.out.println(result);
    }
}
