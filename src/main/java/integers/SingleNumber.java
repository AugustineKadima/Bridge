package integers;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int findSingleNumber(int[] nums){

        Map<Integer, Integer> numFreqMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!numFreqMap.containsKey(nums[i])){
                numFreqMap.put(nums[i], 1);
            }else{
                numFreqMap.replace(nums[i], numFreqMap.get(nums[i]) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry:numFreqMap.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = SingleNumber.findSingleNumber(new int[]{2,2,2,3,3, 9});
        System.out.println(result);
    }
}
