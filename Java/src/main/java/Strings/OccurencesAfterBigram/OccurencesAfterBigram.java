package Strings.OccurencesAfterBigram;

import java.util.ArrayList;
import java.util.List;

public class OccurencesAfterBigram {
    public static void main(String [] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a", second = "good";
        System.out.println("Find Occurences: " + findOcurrences(text, first, second));

        text = "we will we will rock you";
        first = "we"; second = "will";
        System.out.println("Find Occurences: " + findOcurrences(text, first, second));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String [] words = text.split(" ");

        for (int i=0; i<words.length - 2; i++) {
            if (words[i].equalsIgnoreCase(first) && words[i+1].equalsIgnoreCase(second)) {
                list.add(words[i+2]);
            }
        }

        String [] occurences = new String[list.size()];
        occurences = list.toArray(occurences);

        return occurences;
    }
}
