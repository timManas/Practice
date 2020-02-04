package Strings.FindWordsThatCanBeFormedByCharacters;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String [] args) {
//        String [] words = {"hello","world","leetcode"};
//        String characters = "welldonehoneyr";

        String [] words = {"cat","bt","hat","tree"};
        String characters = "atach";


        System.out.println("Output: " + countCharacters(words, characters));
    }

    public static int countCharacters(String[] words, String characters) {
        StringBuilder sb = new StringBuilder();

        // Step 1 - Convert characters to HashMap
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < characters.length(); i++) {
            int count = 1;
            char letter = characters.charAt(i);
            if (charMap.containsKey(letter)) {
                count = charMap.get(letter) + 1;
            }

            charMap.put(letter, count);
        }

        // Step2 - Loop through words
        outLoop:
        for (String word : words) {
            // Step2b - Convert each word to map
            LinkedHashMap<Character, Integer> wordMap = new LinkedHashMap<Character, Integer>();
            for (int i = 0; i < word.length(); i++) {
                int count = 1;
                char letter = word.charAt(i);
                if (wordMap.containsKey(letter)) {
                    count = wordMap.get(letter) + 1;
                }

                wordMap.put(letter, count);
            }

            // Step3 - Compare Maps
            for (Map.Entry<Character, Integer> mapEntry : wordMap.entrySet()) {
                char key = mapEntry.getKey();
                int value = mapEntry.getValue();

                if (charMap.containsKey(key) && charMap.get(key) >= value) {
                    // Do nothing here =)
                } else {
                    continue outLoop;
                }

            }

            sb.append(word);


        }

        System.out.println("Output: " + sb.toString());

        return sb.length();
    }
}
