package Strings.ValidWordSquare;

import java.util.ArrayList;
import java.util.List;

public class ValidWordSquare {
    public static void main(String [] args) {
        String [] words = {"abcd","bnrt","crmy","dtye"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words)) + "\n");

        String [] words1 = {"abcd","bnrt","crm","dt"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words1)) + "\n");

        String [] words2 = {"ball","area","read","lady"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words2)) + "\n");

        String [] words3 = {"ball","asee","let","lep"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words3)) + "\n");

        String [] words4 = {"abc","b"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words4)) + "\n");
    }

    private static List<String> convertToList(String[] words) {
        List<String> output = new ArrayList<>();
        for (String i : words) output.add(i);
        return output;
    }

    public static boolean validWordSquare(List<String> words) {

        int offset = 0;

        while (offset < words.size()) {
            int rowIndex = 0;
            int colIndex = 0;

            while (rowIndex < words.get(offset).length() && colIndex < words.size()) {

                char row = offset < words.get(rowIndex).length() ? words.get(rowIndex).charAt(offset) : ' ';
                char col = colIndex < words.get(offset).length() ? words.get(offset).charAt(colIndex) : ' ';
                System.out.println("Row: " + row + "    Col: " + col);

                if (row != col)
                    return false;

                rowIndex++;
                colIndex++;
            }
            System.out.println("-------");
            offset++;
        }



        return true;
    }
}
