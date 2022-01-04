package interview;

public class Sample {
    public static int findSum(int[] nums){
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result += nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int output = Sample.findSum(new int[] {4,5,8,12});
        System.out.println(output);
    }
}
//[1,2,3] => 6
//loop
//add to result
//return result