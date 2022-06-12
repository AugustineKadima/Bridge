package integers;

public class MoveZeros {

    public static int[] moveZeros(int[] nums){
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[left] = nums[i];
                left++;
            }
        }

        for(int i = left; i < nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }
    public static void main(String[] args) {

        int[] results = MoveZeros.moveZeros(new int[]{0,4,5,0,9});
        for(int i:results) System.out.println(i);

    }
}
//Pseudocode
/*
* Loop through the array
* Have a pointer to  track zeros
* replace zeros with adjacent numbers
* move zeros to the end*/