package Strings.CheckIfTwoStringArraysareEquivalent;

import java.util.*;

public class CheckIfTwoStringArraysareEquivalent {

    public static void main(String [] args) {
        String word1 = "aaaa";
        String word2 = "bccb";
        System.out.println("String are equal: " + checkAlmostEquivalent(word1, word2) + "\n");

        word1 = "abcdeef";
        word2 = "abaaacc";
        System.out.println("String are equal: " + checkAlmostEquivalent(word1, word2) + "\n");

        word1 = "cccddabba";
        word2 = "babababab";
        System.out.println("String are equal: " + checkAlmostEquivalent(word1, word2) + "\n");

        word1 = "aaaab";
        word2 = "zzzza";
        System.out.println("String are equal: " + checkAlmostEquivalent(word1, word2) + "\n");
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {

        // Map word1 and word2 into LinkedHashMaps
        Map<Character, Integer> map1 = getMap(word1);
        Map<Character, Integer> map2 = getMap(word2);

        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);

        // Check if highest value is greater than 4. Return false otherwise
        Set<Character> set = new TreeSet<>();
        set.addAll(map1.keySet());
        set.addAll(map2.keySet());
        System.out.println("keySet: " + set);

        for (char letter : set) {

            // Check if difference letters on both
            int numOccr1 = map1.containsKey(letter) ? map1.get(letter) : 0;
            int numOccr2 = map2.containsKey(letter) ? map2.get(letter) : 0;

            if (Math.abs(numOccr1 - numOccr2) > 3)
                return false;
        }

        return true;
    }

    public static LinkedHashMap<Character, Integer> getMap(String word) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (char letter : word.toCharArray()) {
            int count = 1;
            if (map.containsKey(letter)) {
                count = map.get(letter) + 1;
            }
            map.put(letter, count);
        }
        return map;
    }
}
