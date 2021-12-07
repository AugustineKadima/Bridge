package sorting;


public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4,9,2,7};

        int[] result = InsertionSort.insertionSort(nums);
        for(int i:result) System.out.println(i);
    }

    public static int[] insertionSort(int[] nums) {
        if(nums.length < 2) return  nums;
        for(int i =1; i < nums.length; i++){

            if(nums[i -1] > nums[i]){
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        insertionSort(nums);
        return nums;
    }
}
