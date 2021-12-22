package integers;

import java.util.HashMap;
import java.util.Map;

public class FindTargetThree {
    public static int[] findTarget(int[] nums, int target){
        if(nums.length == 0) return nums;

        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
             int compliment = target - nums[i];
             if(!numMap.containsKey(compliment)){
                 numMap.put(nums[i], i);
             }else{
                 return new int[] {numMap.get(compliment), i};
             }
        }

        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] results = FindTargetThree.findTarget(new int[]{2,4,7,6} ,9);
        for(int i: results)System.out.println(i);
    }

}
//Space complexity = O(n)
//Time complexity = O(n)