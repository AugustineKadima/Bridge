package strings;

public class LongestPrefix {
    public static String findPrefix(String[] strs){
        String prefix = "";
        for(int i = 0; i < strs[0].length(); i++){
            String prefixChar = Character.toString(strs[0].charAt(i));
            for(String str:strs){
                if(!Character.toString(str.charAt(i)).equals(prefixChar)){
                    return prefix;
                }
            }

            prefix += prefixChar;

        }
        return prefix;
    }
    public static void main(String[] args) {
        String result = LongestPrefix.findPrefix(new String[]{"flower", "flora", "fly", "jo"});
        System.out.println(result);
    }
}
//Pseudocode
/*
* Loop -individual strings
* Compare characters(inner loop)
* if characters are equal on all strings at the same index, append to a variable
* else return the variable with appended characters
* */