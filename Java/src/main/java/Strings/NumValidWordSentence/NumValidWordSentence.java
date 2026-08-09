package Strings.NumValidWordSentence;

import java.util.Arrays;

public class NumValidWordSentence {
    public static void main(String [] args) {
        String [] input = {
                "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.",
                ". ! 7hk  al6 l! aon49esj35la k3 7u2tkh  7i9y5  !jyylhppd et v- h!ogsouv 5",
                "-",
                "!",
                "a",
                "cat and  dog",
                "!this  1-s b8d!",
                "alice and  bob are playing stone-game10",
                "hello-world-tim",
                "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener."};
        for (String i : input)
            System.out.println("countValidWord: " + countValidWords(i) + "\n");
    }

    public static int countValidWords(String sentence) {
        System.out.println("sentence: " + sentence);
        int count = 0;

        String [] wordsArr = sentence.split(" ");
        System.out.println("Arr: " + Arrays.toString(wordsArr));

        outerLoop:
        for (String word : wordsArr) {
            if (word.trim().equalsIgnoreCase(""))
                continue;

            System.out.println("word: " + word);

            if (word.length() == 1) {
                if (Character.isDigit(word.charAt(0))) {
                    continue;
                }
                if (word.charAt(0) == '-') {
                    continue;
                }
                ++count;
                continue;
            }



            if (word.matches(".*\\d.*")) {
                System.out.println("    Contains: Digits");
                continue;
            }

            if (word.matches(".*-.*-.*")) {
                System.out.println("    Contains: Multiple -" );
                continue;
            }

            boolean puncOccurs = false;
            boolean dashOccurs = false;
            innerLoop:
            for (int i=0; i<word.length(); i++) {
                char letter = word.charAt(i);
                if (i==0 && !Character.isAlphabetic(letter)) {
                    System.out.println("    Contains: Invalid Word. Beginning of word" );
                    continue outerLoop;
                }

                if (letter == '?' || letter == '!' || letter == '.' || letter == ',') {
                    if (puncOccurs) {
                        System.out.println("    Contains: Multiple Punctuation Word" );
                        continue outerLoop;
                    }

                    puncOccurs = true;
                    if (i != word.length()-1) {
                        System.out.println("    Contains:  Invalid Word after Punctuation" );
                        continue outerLoop;
                    }
                }

                if (letter == '-') {
                    if (dashOccurs) {
                        System.out.println("    Contains: Multiple Punctuation Word" );
                        continue outerLoop;
                    }

                    if (i == word.length()-1) {
                        System.out.println("    Contains:  Invalid Word after Punctuation" );
                        continue outerLoop;
                    }

                    dashOccurs = true;
                    if (!Character.isAlphabetic(word.charAt(i-1)) || !Character.isAlphabetic(word.charAt(i+1))) {
                        System.out.println("    Contains:  Invalid Word between Punctuation" );
                        continue outerLoop;
                    }
                }
            }

            ++count;


        }
        return count;
    }
}
