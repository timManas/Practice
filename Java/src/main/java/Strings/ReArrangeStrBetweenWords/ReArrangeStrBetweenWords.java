package Strings.ReArrangeStrBetweenWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeStrBetweenWords {
    public static void main(String [] args) {
        String [] input = {"  this   is  a sentence ", " practice   makes   perfect", "   hello"};
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

        if (numSpaces == 0) return text;


        int spaceArea = wordList.size() - 1;

        if (spaceArea == 0) {
            sb.append(text.replaceAll(" ", ""));

            for (int j=numSpaces; j>0;j--) {
                sb.append(" ");
            }

            return sb.toString();
        }

        int minNumSpaces = 0;
        int remainder = 0;
        if (numSpaces % spaceArea != 0) {
            remainder = numSpaces % spaceArea;
        }
        minNumSpaces = numSpaces / spaceArea;

        // Create String
        for (int i=0; i<wordList.size(); i++) {
            String word = wordList.get(i);
            sb.append(word);

            if (i == wordList.size() - 1) {

                if (remainder != 0) {
                    for (int j=remainder; j>0;j--) {
                        sb.append(" ");
                    }
                }
                break;
            }

            for (int j=minNumSpaces; j>0;j--) {
                sb.append(" ");
            }
        }



        return sb.toString();
    }
}
