package Strings._InProgress_WordPattern;

import java.util.LinkedHashMap;

public class WordPattern {

    public static void main(String [] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";  // True
//        String str = "dog dog dog dog";  //False
//        String str = "dog cat cat fish";  //False

//        String pattern = "aaa";             // True
//        String str = "aa aa aa aa";

        System.out.println("Pattern: " + wordPattern(pattern, str));

    }

    public static boolean wordPattern(String pattern, String str) {

        LinkedHashMap<String, Character> map = new LinkedHashMap<String, Character>();
        String [] strArr = str.split(" ");
        int patternIndex = 0;
        for (int i=0; i < strArr.length; i++) {
            String word = strArr[i];

            // Does Not contain
            if (!map.containsKey(word)) {
                map.put(word, pattern.charAt(patternIndex));
                ++patternIndex;
                continue;
            }

            // Does Contain
            char storedLetter = map.get(word);
            if (storedLetter != pattern.charAt(patternIndex))
                return false;



        }

        return true;
    }

}
