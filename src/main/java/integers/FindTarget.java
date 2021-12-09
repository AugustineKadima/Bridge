package integers;

import java.util.ArrayList;

public class FindTarget {
        public static ArrayList<Integer> findTarget(int[] nums, int target) {
            ArrayList<Integer> baseCase = new ArrayList<>();
            ArrayList<Integer> indices = new ArrayList<>();
            baseCase.add(-1);
            baseCase.add(-1);
            if (nums.length == 0) return baseCase;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        indices.add(i);
                        indices.add(j);
                        return indices;
                    }
                }
            }

            return baseCase;
        }
    public static void main(String[] args) {
        ArrayList<Integer> results = FindTarget.findTarget(new int[]{6,2,7,11}, 9);
        for(int i: results) System.out.println(i);
    }
}
//[2,5,7,11] => 9
//return indices of numbers that add up to target
//Time complexity = O(n2)
//Space complexity = O(1)