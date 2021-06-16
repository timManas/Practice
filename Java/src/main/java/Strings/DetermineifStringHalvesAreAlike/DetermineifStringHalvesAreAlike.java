package Strings.DetermineifStringHalvesAreAlike;

import java.util.*;

public class DetermineifStringHalvesAreAlike {

    public static void main(String [] args) {
        String [] input = {"book", "textbook", "MerryChristmas", "AbCdEfGh"};
        for (String word : input)
            System.out.println("Halves are alike: " + halvesAreAlike(word));
    }

    public static boolean halvesAreAlike(String word) {

        // Step1 - Create counters
        int numVowelsFirst = 0;
        int numVowelsSecond = 0;
        Set<Character> set = new LinkedHashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));


        // Step2 - Find the mid
        int mid = word.length() / 2;

        // Step3 - Split word into first and second
        String firstWord = word.substring(0, mid);
        String secondWord = word.substring(mid, word.length());

        // Step4 - Populate Map
        for (int i=0; i < firstWord.length(); i++) {
            char letter = firstWord.charAt(i);
            if (!set.contains(letter))
                continue;

            numVowelsFirst++;
        }

        // Step4 -Populate Map
        for (int i=0; i < secondWord.length(); i++) {
            char letter = secondWord.charAt(i);
            if (!set.contains(letter))
                continue;

            numVowelsSecond++;
        }

        return numVowelsFirst == numVowelsSecond;
    }
}
