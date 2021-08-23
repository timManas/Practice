package Strings.RedistributeCharToMakeStringEqual;

import java.util.LinkedHashMap;
import java.util.Map;

public class RedistributeCharToMakeStringEqual {
    public static void main(String [] args) {
        String [][] wordsList = {{"abc","aabc","bc"}, {"ab","a"},{"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"}};
        for (String [] words : wordsList)
            System.out.println("Make Equal: " + makeEqual(words));

    }

    // The trick is to check if each letter appears atleast word.length times. Use modulus to make sure there are no remainders
    public static boolean makeEqual(String[] words) {

        if (words.length == 1)
            return true;

        // Step1 - Create map to store the letter occurence
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (String word : words) {
            for (int i=0; i<word.length(); i++) {
                char letter = word.charAt(i);
                if (map.containsKey(letter)) {
                    map.put(letter, map.get(letter) + 1);
                } else {
                    map.put(letter, 1);
                }
            }
        }

        // Step2 - Check if every letter is divisbile by the number of input words present. If not, return false
        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() % words.length != 0)
                return false;
        }

        return true;
    }
}
