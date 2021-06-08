package Strings.CheckIfWordsEqualsSummationOfTwoWords;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class CheckIfWordsEqualsSummationOfTwoWords {

    public static void main(String [] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";

        System.out.println("IsSumEqual: " + isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int firstWordSummation = getSummation(firstWord);
        int secondWordSummation = getSummation(secondWord);
        int targetWordSummation = getSummation(targetWord);

        return firstWordSummation + secondWordSummation == targetWordSummation;
    }

    private static int getSummation(String word) {
        char [] set = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k', 'l','m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder sb = new StringBuilder();
        for (int i=0; i < word.length(); i++) {
            char letter = word.charAt(i);
            sb.append(Arrays.binarySearch(set, letter));
        }

        return Integer.valueOf(sb.toString());
    }
}
