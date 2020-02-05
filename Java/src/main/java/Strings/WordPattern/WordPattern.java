package Strings.WordPattern;

import java.util.LinkedHashMap;

public class WordPattern {

    public static void main(String [] args) {
        String pattern = "abba";
//        String str = "dog cat cat dog";
        String str = "dog dog dog dog";
        System.out.println("Pattern: " + wordPattern(pattern, str));

    }

    public static boolean wordPattern(String pattern, String str) {

        LinkedHashMap<Character, String> map = new LinkedHashMap<Character, String>();
        String [] strArr = str.split(" ");
        for (int i=0; i < pattern.length(); i++) {
            char letter = pattern.charAt(i);

            if (!map.containsKey(letter)) {
                map.put(letter, strArr[i]);
                continue;
            }

            String storedStr = map.get(letter);
            if (!storedStr.equalsIgnoreCase(strArr[i]))
                return false;

        }

        return true;
    }

}
