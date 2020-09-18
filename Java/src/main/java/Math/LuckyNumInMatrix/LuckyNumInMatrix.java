package Math.LuckyNumInMatrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumInMatrix {

    public static void main(String [] args) {
//        int [][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        int [][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println("Lucky Num: " + luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        // Find the smallest num in each row
        List<Integer> smallestYIndexInEachRowList = new ArrayList<>();
        for (int i=0; i < matrix.length; i++) {
            int smallestIndex = 0;
            for (int y=0; y < matrix[i].length; y++) {
                if (matrix[i][smallestIndex] > matrix[i][y])
                    smallestIndex = y;
            }
            System.out.println("Row: " + i + "      - Smallest index in Row: " + smallestIndex + "      Num: " + matrix[i][smallestIndex]);
            smallestYIndexInEachRowList.add(smallestIndex);
        }

        // Traverse each number in the smallestYIndexInEachRowList list
        for (int row=0; row < smallestYIndexInEachRowList.size(); row++) {
            int smallestYIndex = smallestYIndexInEachRowList.get(row);
            int largestNumInRow = matrix[0][smallestYIndex];

            // Traverse EACH Number in the column and Find LargestNum in Column
            for (int i=0; i < matrix.length; i++) {
                if (largestNumInRow < matrix[i][smallestYIndex])
                    largestNumInRow = matrix[i][smallestYIndex];
            }

            // Check if the largestNum in Column is equal to largest Smallest Y Index
            // This means this number is a lucky number
            if (largestNumInRow == matrix[row][smallestYIndex])
                output.add(matrix[row][smallestYIndex]);
        }


        return output;
    }

}


/**
 Notes
 - A bit tricky but not really

 Solution
 1. Find the smallest number in each row
 2. Save the column Index in a list
 3. For each number in the list, find the Largest number in the column
 4. If largest number in the column is the same number as the smallest number in the row, we have a lucky number
    > add to output list

 */