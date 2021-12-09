package integers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindTarget2 {
    public static ArrayList<Integer> findTargetX(int[] nums, int target){
        ArrayList<Integer> baseCase = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();

        baseCase.add(-1);
        baseCase.add(-1);
        if(nums.length == 0) return baseCase;
        Map<Integer, Integer> indexMap = new HashMap<>();

        for( int i = 0; i < nums.length; i++){
            int complementaryNumber = target - nums[i];
            if(indexMap.containsKey(complementaryNumber)){
               indices.add(indexMap.get(complementaryNumber));
               indices.add(i);
               return indices;
            }else{
                indexMap.put(nums[i], i);
            }
        }

        return baseCase;
    }

    public static void main(String[] args) {
        ArrayList<Integer> results = FindTarget2.findTargetX(new int[] {2,4,7,6}, 9);
        for(int i: results) System.out.println(i);
    }

}
//[2,4,7,6] => 9
//[0,2]
//loop
//-1, -1
//Time complexity O(n)
//Space complexity O(1)
