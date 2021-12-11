package searching;

public class LinearSearch {
    public static int findChar(String s, char c){
        if(s.length() == 0) return -1;
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == c){
                return i;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int result = LinearSearch.findChar("babay", 'y');
        System.out.println("Result: " + result);
    }
}
//Given a string find the position of a given character
//Pseudocode
//Convert string to char array
//loop
//return position of a given character
//Time complexity = O(n)
//Space complexity = O(1)