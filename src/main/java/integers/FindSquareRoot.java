package integers;

public class FindSquareRoot {
    private static  int squareRoot(int n){
        if(n < 2) return n;
        int start = 1;
        int end = n;
        while (start < end){
            int midpoint = start + (end - start) / 2;
            int square = midpoint * midpoint;
            if(square == n){
                return midpoint;
            }
            else if(square > n){
                end = midpoint - 1;
            }else{
                start = midpoint + 1;
            }
        }
        return start - 1;
    }
    public static void main(String[] args) {
        int result = FindSquareRoot.squareRoot(15);
        System.out.println("Result: "+ result);
    }
}
//find square root of a number
//input = 9, output = 3
//input = 10, output = 3