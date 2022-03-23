package Strings.WordPattern;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordPattern {
    public static void main (String [] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println("Word Pattern: " + wordPattern(pattern, s));

        String pattern1 = "abba";
        String s1 = "dog cat cat fish";
        System.out.println("Word Pattern: " + wordPattern(pattern1, s1));

        String pattern2 = "aaaa";
        String s2 = "dog cat cat dog";
        System.out.println("Word Pattern: " + wordPattern(pattern2, s2));
    }

    public static boolean wordPattern(String pattern, String s) {

        // Step1 - Split the words into array
        String [] input = s.split(" ");

        // Step2 - Check both pattern and input array have the same length. why ? because they need to have the same length for the same pattern..duh
        if (input.length != pattern.length())
            return false;

        // Step3 - Create map to store mapping. Create set to store the words already encountered
        Map<Character, String> map = new TreeMap<>();
        Set<String> set = new TreeSet<>();


        // Step4 - Populate the map
        String word = "";
        for (int i=0; i<pattern.length(); i++) {
            char letter = pattern.charAt(i);
            word = input[i];

            // Step5 - Check if letter or word is already encoutnered
            if (map.containsKey(letter)) {
                if (!map.get(letter).equalsIgnoreCase(word))
                    return false;
            } else {

                if (set.contains(word))
                    return false;

                map.put(letter, word);
            }

            set.add(word);      // Add word to set
        }

        return true;        // Once we reach the end, we return true
    }
}
