package integers;

import java.util.HashSet;

public class FindDuplicates {
    public static boolean findDuplicates(int[] nums){
        if(nums.length < 2) return false;
        HashSet<Integer> numSet = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            if(!numSet.contains(nums[i])){
                numSet.add(nums[i]);
            }else{
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        boolean results = FindDuplicates.findDuplicates(new int[] {9,2,3,1});
        System.out.println(results);
    }
}
//Input: nums = [1,2,3,1]
//Output: true
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

//Pseudocode
//----------------
//Loop through nums
//add to hashset
//check if hashset contains nums[i] return true

//Time complexity = O(n)
//Space complexity = O(n)