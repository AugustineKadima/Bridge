package sorting;

public class SortArray {
    public static  int[] sortArray(int[] nums){
        if(nums.length < 2) return nums;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] > nums[i] && i != j){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,1,6,4,3,6,4};
        int[] results = SortArray.sortArray(nums);
        for(int i: results) System.out.println(i);
    }
}

//Time complexity = O(n2)
//Space complexity = O(1)
