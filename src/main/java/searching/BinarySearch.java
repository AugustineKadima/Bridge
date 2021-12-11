package searching;

public class BinarySearch {
    public static  int searchX(int[] nums, int target){
        if (nums.length == 0) return - 1;

        int start = 0;
        int end = nums.length -1;

        while(start <= end){

            int midpoint = start + (end - start) / 2;
            if(nums[midpoint] == target){
                return midpoint;
            }
            else if(nums[midpoint] > target){
                end = midpoint - 1;

            }else if(nums[midpoint] < target){
                start = midpoint + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
       int result = BinarySearch.searchX(new int[] {1,2,3,4,5,6}, 3);
        System.out.println("result: "+result);
    }
}

//Given an array, find if the target number exists and return its position
//Loop through
//find midpoint
//change start and end
//return midpoint

//Time complexity = O(log n)
//Space complexity = O(1)
