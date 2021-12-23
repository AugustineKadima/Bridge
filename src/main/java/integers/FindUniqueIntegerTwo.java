package integers;

public class FindUniqueIntegerTwo {
    public static int findUnique(int[] nums){
        for(int i = 0; i < nums.length; i++){
            boolean checker = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i != j){
                    checker = true;
                }
            }

            if(checker == false) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = FindUniqueIntegerTwo.findUnique(new int[]{1,1,2,2,3,4,4});
        System.out.println(result);
    }
}

//Pseudocode
//------------

//loop within a loop
//initialize checker to false
//if nums[i] == nums[j], checker = true;
//if checker == false return nums[i]

//Time complexity = O(n2)
//Space complexity = O(1)
