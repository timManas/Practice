package Strings.CounttheNumberofConsistentStrings;

import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofConsistentStrings {

    public static void main(String [] args) {
        String allowed = "ab";
        String [] words = {"ad","bd","aaab","baa","badab"};

        System.out.println("Count Consistent Strings: " + countConsistentStrings(allowed, words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        // Step1 - Create master Set to compare the words too
        Set<Character> allowedSet = new HashSet<>();
        for (int i=0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }

        // Step2 - Traverse each word in the input Array
        for (String word : words) {
            for (int i=0; i < word.length(); i++) {
                char letter = word.charAt(i);

                // Step3 - Compare each letter to alowedSet
                if (!allowedSet.contains(letter)) {
                    break;
                } else {
                    if (i == word.length() - 1) {
                        count += 1;
                    }
                }
            }
        }


        return count;
    }
}
