package Strings.FindAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {

    public static void main(String [] args) {
        String [] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.print("List: " + findAndReplacePattern(words, pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        // Step1 - Create list to be outputted
        List<String> list = new ArrayList<>();

        // Step2 - Create Map
        Map<Character, Character> map = new HashMap<>();

        // Step3 - Traverse EACH word in the array
        outerLoop:
        for (String word : words) {

            // Step4 - Clear the map
            map.clear();

            // Step5 - Check if word length is the same, otherwise  move onto the next
            if (word.length() != pattern.length())
                continue;

            // Step6 - Traverse each character
            letterLoop:
            for (int i=0; i < word.length(); i++) {

                char wordLetter = word.charAt(i);           // This is the letter from the word
                char targetLetter = pattern.charAt(i);      // This is the letter from the target

                // There are two scenario where will continue
                // 1. Letter exists in map but is different
                // 2. Letter does NOT exists in map but SHOULD (aka ... it should already have been mapped)
                // If any of these critera is hit, we continue to the next word
                if (map.containsKey(wordLetter)) {

                    if (map.get(wordLetter) != targetLetter)
                        continue outerLoop;

                } else {

                    if (map.containsValue(targetLetter))
                        continue outerLoop;

                    // Step8 - Add letter and target letter
                    map.put(wordLetter, targetLetter);

                }
            }

            // Step9 - If all LETTERS are mapped properly, we add to the list
            list.add(word);
        }


        return list;
    }
}

/**
 Solution
 - Use a hashamp to keep track of the mapping
 - After each word, remember to reset the hashmap back to empty map
 - Traverse each letter in a word and map mapping to HashMap




 */