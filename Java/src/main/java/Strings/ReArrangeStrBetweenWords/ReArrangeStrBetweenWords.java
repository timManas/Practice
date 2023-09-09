package Strings.ReArrangeStrBetweenWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeStrBetweenWords {
    public static void main(String [] args) {
        String [] input = {"  this   is  a sentence ", " practice   makes   perfect"};
        for (String i : input)
            System.out.println("reorder: " + reorderSpaces(i) + "\n");
    }

    public static String reorderSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        String [] wordsArr = text.split("[^a-zA-Z]+");
        List<String> wordList = new ArrayList<>();
        for (String word : wordsArr) if (!word.equalsIgnoreCase("")) wordList.add(word);
        System.out.println("words: " + wordList);

        int numSpaces = 0;
        for (char i : text.toCharArray()) if (i == ' ') numSpaces++;


        int spaceArea = wordList.size() - 1;

        int minNumSpaces = 0;
        int remainder = 0;
        if (numSpaces % spaceArea == 0) {
            minNumSpaces = numSpaces / spaceArea;

        } else {



        }




        return sb.toString();
    }
}
