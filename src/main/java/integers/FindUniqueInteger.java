package integers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindUniqueInteger {
    public static int uniqueInteger(int[] nums){

        if(nums.length == 0) return -1;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           if(!numMap.containsKey(nums[i])){
               numMap.put(nums[i], 1);
           }else{
               numMap.replace(nums[i], numMap.get(nums[i]) + 1);
           }
        }

        for(Map.Entry<Integer, Integer> entry : numMap.entrySet()){
            if(entry.getValue() < 2) return  entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int results = FindUniqueInteger.uniqueInteger(new int[] {1,1,2,2,3,4,4});
        System.out.println(results);
    }
}

//input [1,1,2,2,3,4,4] output = 3
//Pseudocode
//-----------------
//loop through nums
//Add num frequency to numMap
//loop through numMap and find the entry that has a frequency of 1
//return unique

//Time complexity = O(n)
//Space complexity = O(n)
