package Strings.CheckIfAllCharsHaveEqualOccur;

import java.util.Map;
import java.util.TreeMap;

public class CheckIfAllCharsHaveEqualOccur {
    public static void main(String [] args) {
        String [] input = {"abacbc", "aaabb"};
        for (String word : input) {
            System.out.println("word: " + word + "      check:" + areOccurrencesEqual(word) + "\n");
        }
    }

    public static boolean areOccurrencesEqual(String str) {

        Map<Character, Integer> map = new TreeMap<>();

        for (Character letter : str.toCharArray()) {
            int val = 1;
            if (map.containsKey(letter))
                val = map.get(letter) + 1;
            map.put(letter, val);
        }
        System.out.println("map: " + map);

        int lastOccurence = 0;
        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            if (lastOccurence == 0) {
                lastOccurence = mapEntry.getValue();
            } else if (lastOccurence != mapEntry.getValue()) {
                return false;
            }
        }

        return true;
    }
}
