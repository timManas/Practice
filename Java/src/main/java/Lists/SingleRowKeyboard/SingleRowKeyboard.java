package Lists.SingleRowKeyboard;

import java.util.LinkedHashSet;

public class SingleRowKeyboard {

    public static void main(String [] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";

//        String keyboard = "pqrstuvwxyzabcdefghijklmno";
//        String word = "leetcode";

        System.out.println("Calculcated Time: " + calculateTime(keyboard, word));
    }

    public static int calculateTime(String keyboard, String word) {
        int total = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();

        int index = 0;  // Need to track current Index

        // Traverse Loop
        for (int i=0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Track the targetLetter index
            int targetLetterIndex = keyboard.indexOf(letter);

            // Find the difference
            int diff = Math.abs(targetLetterIndex - index);

            // Add diff to total
            total += diff;

            // Set current index to targetedIndex
            index = targetLetterIndex;
        }

        return total;
    }



}
