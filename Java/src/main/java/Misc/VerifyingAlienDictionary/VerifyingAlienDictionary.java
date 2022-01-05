package Misc.VerifyingAlienDictionary;

import java.util.LinkedHashMap;
import java.util.Map;

public class VerifyingAlienDictionary {
    public static void main(String [] args) {
        String [] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words, order) + "\n");

        String [] words1 = {"word","world","row"};
        String order1 = "worldabcefghijkmnpqstuvxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words1, order1) + "\n");

        String [] words2 = {"apple","app"};
        String order2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words2, order2) + "\n");

        String [] words3 = {"kuvp","q"};
        String order3 = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words3, order3) + "\n");

        String [] words4 = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order4 = "zkgwaverfimqxbnctdplsjyohu";
        System.out.println("Is Alien Sorted: " + isAlienSorted(words4, order4) + "\n");
    }

    public static boolean isAlienSorted(String[] words, String order) {

        // Step1 - Create Map instead of constantly searching for number
        int count = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<order.length(); i++)
            map.put(order.charAt(i), ++count);
        System.out.println("Map:" + map);

        // Step2 - Traverse array of words
        for (int i=0; i<words.length - 1; i++) {
            String current = words[i];
            String next = words[i+1];
            System.out.println("Current: " + current + "  Next: " + next);

            // Step3 - Traverse each letter one by one from currentWord and nextWord
            int index = 0;
            innerLoop:
            while (index < current.length() && index < next.length()) {

                // Step4 - Check if elements are the same, bigger or smaller than each other
                if (map.get(current.charAt(index)) == map.get(next.charAt(index))) {
                    // Do nothing but continue onto the next
                } else if (map.get(current.charAt(index)) < map.get(next.charAt(index))) {
                    // Move onto the next word
                    break innerLoop;
                } else if (map.get(current.charAt(index)) > map.get(next.charAt(index))) {
                    return false;
                }

                ++index; // Update index

                // Step5 - Make sure to account for short words on next...
                if (index < current.length() && index >= next.length()) {
                    return false;
                }

            }
        }


        return true;
    }
}
