package Strings.CheckIfSentencePangram;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSentencePangram {
    public static void main(String [] args) {
        String [] input = {"thequickbrownfoxjumpsoverthelazydog", "leetcode"};
        for (String i : input)
            System.out.println("IsPangram: " + checkIfPangram(i));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i=0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            set.add(letter);
        }

        return set.size() == 26;
    }
}
