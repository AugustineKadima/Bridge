package recursion;

public class FactorialSum {

    public static int factorialSum(int num){
        if(num < 2) return num;
        return num + factorialSum(num - 1);

    }
    public static void main(String[] args) {
        int result = FactorialSum.factorialSum(2);
        System.out.println(result);
    }
}

//Enter a number and return the sum of all its factorials
//solve using recursion
//5 => 5 + 4!
//4 => 4 + 3!
//3 => 3 + 2!
//2 => 2 + 1!
//1 => 1

//Time complexity = O(n)
//Space complexity = O(n)
