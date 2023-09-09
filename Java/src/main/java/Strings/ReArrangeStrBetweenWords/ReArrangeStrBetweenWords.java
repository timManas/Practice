package Strings.ReArrangeStrBetweenWords;

import java.util.Arrays;

public class ReArrangeStrBetweenWords {
    public static void main(String [] args) {
        String [] input = {"  this   is  a sentence ", " practice   makes   perfect"};
        for (String i : input)
            System.out.println("reorder: " + reorderSpaces(i) + "\n");
    }

    public static String reorderSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        String [] words = text.split("[^a-zA-Z]+");
        System.out.println("words: " + Arrays.toString(words));

        return sb.toString();
    }
}
