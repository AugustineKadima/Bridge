package integers;

public class FindDuplicatesTwo {

    public static boolean findDuplicates(int[] nums){
        if(nums.length < 2) return false;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] == nums[j]) return true;
                else return false;
            }

        }

        return  false;
    }
    public static void main(String[] args) {
        boolean results = FindDuplicatesTwo.findDuplicates(new int[] {9,2,3,1});
        System.out.println(results);
    }
}
//loop within a loop
//return true if nums[i] = nums[j]

//Time complexity = O(n2)
//Space complexity = O(1)