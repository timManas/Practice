package Strings.ValidWordSquare;

import java.util.ArrayList;
import java.util.List;

public class ValidWordSquare {
    public static void main(String [] args) {
//        String [] words = {"abcd","bnrt","crmy","dtye"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words)) + "\n");
//
//        String [] words1 = {"abcd","bnrt","crm","dt"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words1)) + "\n");
//
//        String [] words2 = {"ball","area","read","lady"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words2)) + "\n");
//
//        String [] words3 = {"ball","asee","let","lep"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words3)) + "\n");
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words3)) + "\n");

//        String [] words4 = {"abc","b"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words4)) + "\n");

//        String [] words5 = {"abcd","bnrt","crm","dt"};
//        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words5)) + "\n");

        String [] words6 = {"aa","ad","ad"};
        System.out.println("Valid Word Square: " + validWordSquare(convertToList(words6)) + "\n");
    }

    private static List<String> convertToList(String[] words) {
        List<String> output = new ArrayList<>();
        for (String i : words) output.add(i);
        return output;
    }

    public static boolean validWordSquare(List<String> words) {
        // Step1 - Create off set which allows us to get the respective positions
        int offset = 0;

        // Step2 - Find the longestword. This will be used as the to run against the offset
        int longestWordLength = 0;
        for (String word : words) longestWordLength = word.length() > longestWordLength ? word.length() : longestWordLength;


        // Step3 - Find the valid word square
        while (offset < longestWordLength || offset < words.size()) {
            int rowIndex = 0;
            int colIndex = 0;

            // Step4 - Check the character from the row matches with the respective character from the column
            while (rowIndex < longestWordLength || colIndex < longestWordLength) {

                char row = ' ';
                char col = ' ';

                // Step5 - Find the row and col offset
                try {
                    row = words.get(rowIndex).charAt(offset);
                } catch (Exception e) {}

                try {
                    col = words.get(offset).charAt(colIndex);
                } catch (Exception e) {}

                System.out.println("Row: " + row + "    Col: " + col);

                // Step6 - Return false if row and col are not the same
                if (row != col)
                    return false;

                // Increment
                rowIndex++;
                colIndex++;
            }
            System.out.println("-------");
            offset++;
        }

        return true;
    }
}
