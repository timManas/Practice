package Strings.CommonWordsWithOneOccurence;

import java.util.Map;
import java.util.TreeMap;

public class CommonWordsWithOneOccurence {
    public static void main(String [] args) {
        String [] words1 = {"leetcode","is","amazing","as","is"};
        String [] words2 = {"amazing","leetcode","is"};
        System.out.println("CountWords: " + countWords(words1, words2) + "\n");

        String [] words3 = {"b","bb","bbb"};
        String [] words4 = {"a","aa","aaa"};
        System.out.println("CountWords: " + countWords(words3, words4)+ "\n");

        String [] words5 = {"a","ab"};
        String [] words6 = {"a","aa","aaa"};
        System.out.println("CountWords: " + countWords(words5, words6)+ "\n");
    }

    public static int countWords(String[] words1, String[] words2) {
        int count = 0;

        //Create maps to store occurence
        Map<String, Integer> map1 = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();

        // Populate maps
        for (String word : words1) {
            if (map1.containsKey(word))
                map1.put(word, map1.get(word) + 1);
            else
                map1.put(word,1);
        }
        System.out.println("map1: " + map1);

        for (String word : words2) {
            if (map2.containsKey(word))
                map2.put(word, map2.get(word) + 1);
            else
                map2.put(word,1);
        }
        System.out.println("map2: " + map2);

        // Find if occurence is only 1 for both maps
        Map<String, Integer> map = map1.size() > map2.size() ? map1 : map2;
        for (String key : map.keySet()) {

            if (!map1.containsKey(key) || !map2.containsKey(key))
                continue;

            if (map1.get(key) == 1 && map2.get(key) == 1) count++;
        }


        return count;
    }
}
