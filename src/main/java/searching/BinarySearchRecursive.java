package searching;

public class BinarySearchRecursive {

    public static  int findXPosition(int[] nums,int left, int right, int target){
        if (nums.length == 0) return -1;
        if(left > right) return  -1;
        int midpoint = left + (right - left) / 2;

        if(nums[midpoint] == target) return midpoint;
        else if(nums[midpoint] > target){
            findXPosition(nums, left,midpoint - 1, target);
        }else{
            findXPosition(nums, midpoint + 1,right, target);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int left = 0;
        int right = nums.length;
        int target = 2;
        int result = BinarySearchRecursive.findXPosition(nums,left,right,target);
        System.out.println("Result: " + result);
    }
}
//Time complexity = O(log n)
//Space complexity = O(n)