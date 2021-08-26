package Strings.LargestSubStringBetweenTwoCharacters;

import java.util.*;

public class LargestSubStringBetweenTwoCharacters {
    public static void main(String [] args) {
        String [] input = {"aa", "abca", "cbzxy", "cabbac"};
        for (String i : input)
            System.out.println("Max Length: " + maxLengthBetweenEqualCharacters(i));
    }

    public static int maxLengthBetweenEqualCharacters(String string) {
        int max = -1;

        // Step1 - Create Map to store the positions
        Map<Character, List<Integer>> map = new TreeMap<>();
        List<Integer> tempList;
        for (int i=0; i < string.length();i++) {
            char letter = string.charAt(i);
            if (map.containsKey(letter)) {
                tempList = map.get(letter);
                Collections.sort(tempList);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(i+1);
            map.put(letter, tempList);
        }

        // Step2 - Find the largest length based on the FIRST and LAST element on the list
        for (Map.Entry<Character, List<Integer>> mapEntry : map.entrySet()) {
            List<Integer> list = mapEntry.getValue();

            // If only one entry ... just continue
            if (list.size() == 1)
                continue;

            // We subtract 1 because we want to find the difference between the letters
            int positionDifference = list.get(list.size()-1) - list.get(0) -1;
            if (max < list.get(list.size()-1) - list.get(0))
                max = positionDifference;
        }

        return max;
    }
}
