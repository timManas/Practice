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

        String licensePlate2 = "Ah71752";
        String [] words2 = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
        System.out.println("Shortest Completing Word: " + shortestCompletingWord(licensePlate2, words2) + "\n");
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        System.out.println("licensePlate: " + licensePlate);
        String licensePlateWordSorted = sortWord(licensePlate);
        List<String> validStr = new ArrayList<>();

        int shortestLength = Integer.MAX_VALUE;
        String shortestWord = "";
        for (String word:words) {
            System.out.println("word: " + word);
            StringBuilder sb = new StringBuilder(licensePlateWordSorted);

            if (word.length() < licensePlateWordSorted.length())
                continue;

            for (char letter : word.toCharArray()) {
                String letterStr = String.valueOf(letter);
                if (sb.indexOf(letterStr) == -1)
                    continue;
                sb.deleteCharAt(sb.indexOf(letterStr));
            }

            if (sb.length() != 0)
                continue;


            validStr.add(word);
            if (shortestLength > word.length()) {
                shortestLength = word.length();
                shortestWord = word;
            }
        }
        System.out.println("Valid Str: " + validStr);
        System.out.println("shortestWord: " + shortestWord);

        return shortestWord;
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
