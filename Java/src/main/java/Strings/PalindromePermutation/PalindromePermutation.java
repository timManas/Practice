package Strings.PalindromePermutation;

import java.util.Set;
import java.util.TreeSet;

public class PalindromePermutation {
    public static void main (String [] args) {
        String [] input = {"code", "aab", "carerac"};
        for (String s : input)
            System.out.println("Can Permutate Palindrome: " + canPermutePalindrome(s));
    }

    public static boolean canPermutePalindrome(String word) {
        Set<Character> set = new TreeSet<>();

        // Step1 - Traverse each letter in word
        for (int i=0; i<word.length();i++) {
            char letter = word.charAt(i);

            // Step2 - Remove letter from set if it already exists
            // Add it otherwise
            if (set.contains(letter)) {
                set.remove(letter);
                continue;
            }
            set.add(letter);
        }

        // Step3 - Check the final size of the set
        // If 0 - Return true
        // If 1 and word is odd length - Return true
        // If more than 1, return false or even length
        if (set.size() == 0) {
            return true;
        } else if (set.size() == 1) {
            if (word.length() % 2 == 1) {   // Odd length of word
                return true;
            }
        }
        return false;
    }
}
