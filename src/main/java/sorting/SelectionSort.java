package sorting;

public class SelectionSort {
//    Recursive approach
//    ----------------------------------
//    For selection sort we start by finding the smallest element in the array
//    We do this by looping through the array from the first element to the last element
//    We initialize the start to zero, the index
//    Then we check for any value that is less than the value at start index.
//    When we find this value we swap in place so that the value at start index is the smallest

    public int[] sort(int[] nums, int start){


        int n = nums.length;
//        if(n == 0) return nums;
        for(int i = 0; i < n; i++){
            if(nums[i] < nums[start]){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
            }
        }
        int[] sorted = sort(nums, start +1);
        for(int i: sorted) System.out.println(i);


        return nums;
    }

//    public int[] selectionSortAlgorithm(int[] numsArr){
//        if(numsArr.length == 0) return numsArr;
//
//        int start = -1;
//        for(int i = 0; i < numsArr.length; i++) return sort(numsArr, i);
//
//
//        return numsArr;
//    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(new int[]{4,5,6,7,2}, 0);
//        for(int result:results) System.out.println(result);
    }
}
