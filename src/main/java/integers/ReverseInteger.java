package integers;

public class ReverseInteger {
    public static int reverseInteger(int num){
        int result = 0;
        if(num == 0) return num;
        while(num != 0) {
            result = (result * 10) + num%10;
            num = num/10;
        }

        return result;
    }
    public static void main(String[] args) {
        int result = ReverseInteger.reverseInteger(15);
        System.out.println(result);
    }
}
//Pseudocode

//loop
//While num != 0
//Find remainder = num%10
//result = results * 10 + remaider;
//Find floor of num/10

//Space complexity = O(1)
//Time complexity = O(n)