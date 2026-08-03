package Strings.ShortestCompletingWord;

import java.util.*;
import java.util.regex.Pattern;

public class ShortestCompletingWord {

    public static void main(String [] args) {

        String licensePlate = "1s3 PSt";
        String [] words = {"step","steps","stripe","stepple"};
        System.out.println("Shortest Completing Word: " + shortestCompletingWord(licensePlate, words) + "\n");

        String licensePlate1 = "1s3 456";
        String [] words1 = {"looks","pest","stew","show"};
        System.out.println("Shortest Completing Word: " + shortestCompletingWord(licensePlate1, words1) + "\n");
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        System.out.println("licensePlate: " + licensePlate);
        String licensePlateWordSorted = sortWord(licensePlate);

        int shortestLength = words[0].length();
        String shortestWord = words[0];
        for (String word:words) {
            System.out.println("word: " + word);
            String



        }


        return null;
    }

    public static String sortWord(String input) {

        String word = Pattern.compile("[^a-zA-Z]").matcher(input).replaceAll("").toLowerCase();
        char [] charArr = word.toCharArray();
        Arrays.sort(charArr);
        word = new String(charArr);
        System.out.println("SortedWord: " + word);

        return word;
    }


}
