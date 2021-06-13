package Strings.SortingtheSentence;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class SortingtheSentence {
    public static void main(String [] args) {
        String [] input = {"is2 sentence4 This1 a3", "Myself2 Me1 I4 and3"};
        for (String word : input)
            System.out.println("Original: " + sortSentence(word));
    }

    public static String sortSentence(String sentence) {
        TreeMap<Character, String> map = new TreeMap<>();
        String [] wordArr = sentence.split(" ");
        for (String word : wordArr) {
            char position = (word.charAt(word.length()-1));
            map.put(position, word.substring(0, word.length() - 1));
        }

        StringBuilder sb = new StringBuilder();
        for (String word : map.values())
            sb.append(word + " ");

        return sb.toString().trim();
    }
}
