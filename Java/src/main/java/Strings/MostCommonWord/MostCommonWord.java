package Strings.MostCommonWord;

import java.util.*;

public class MostCommonWord {

    public static void main(String [] args) {

        String input = "a, a, a, a, b,b,b,c, c";
        String [] banned = {"a"};
        System.out.println("Most Common Word: " + mostCommonWord(input, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String mcWord = null;
        int count = 0;

        // Step#1 - Add to HashMap
        String [] wordArr = paragraph.split("[^a-zA-Z0-9]");
        LinkedHashMap <String, Integer> map = new LinkedHashMap <String, Integer>();

        for (String word : wordArr) {
            String key = word.toLowerCase();
            if (key.equals("") || Arrays.asList(banned).contains(key)) {
                continue;
            }

            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }

        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            String key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (count < value) {
                count = value;
                mcWord = key;
            }
        }

        return mcWord;
    }
}
