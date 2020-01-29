package Strings.LongestPalindrome;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String [] args) {

//        String input = "ababababa";
        String input = "tattarrattat";  // t=6, a=4, r=2;

        System.out.println("LongestPalindrome: " + longestPalindrome(input));
    }

    public static int longestPalindrome(String input) {
        int longest = 0;

        // Step 1 - If Input is empty ...return 0;
        if (input.length() == 0)
            return longest;

        // Step 2 - Convert to Map to get the # of occurence
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i=0; i < input.length(); i++) {
            char letter = input.charAt(i);

            int value = 1;
            if (map.containsKey(letter)) {
                value = map.get(letter) + 1;
            }

            map.put(letter, value);
        }

        // Step3 - Check If only one letter but multiple times occur
        if (map.size() == 1) {
            return input.length();
        }

        // Step4 - If More than one letter, then add values
        boolean addedUnique = false;
        for (int  value : map.values()) {

            // Add ONLY the first occurence of 1
            if (value == 1) {
                if (!addedUnique) {
                    longest = longest + 1;
                    addedUnique = true;
                }
                continue;
            }

            // Add the value
            longest = longest + value;

            // If value is odd, we start
            if (value % 2 == 1) {
                longest = longest - 1;
            }
        }

        if (!addedUnique && longest < input.length())
            longest = longest + 1;


        return longest;
    }

}
