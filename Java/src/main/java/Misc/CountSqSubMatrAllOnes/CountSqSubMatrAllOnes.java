package Misc.CountSqSubMatrAllOnes;

import java.lang.reflect.Array;
import java.util.*;

public class CountSqSubMatrAllOnes {

    public static void main (String [] args) {

        int [][] matrix = { {0,1,1,1},
                            {1,1,1,1},
                            {0,1,1,1}};
        System.out.println("countSquares: " + countSquares(matrix)+ "\n");

        int [][] matrix1 = {{1,0,1},
                            {1,1,0},
                            {1,1,0}};
        System.out.println("countSquares: " + countSquares(matrix1)+ "\n");

        int [][] matrix2 = {{0,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {1,1,1,1},
                            {0,1,1,1}};
        System.out.println("countSquares: " + countSquares(matrix2)+ "\n");

        int [][] matrix3 = {{1,1,1,0,1,0,1,0},      //[3,1,1]
                            {1,0,1,1,1,1,1,1},      //[1,6]
                            {1,1,1,1,1,1,1,1},      //[8]
                            {1,1,1,1,1,0,1,1},      //[5,2]
                            {0,1,1,1,1,1,1,1}};     //[7]
        System.out.println("countSquares: " + countSquares(matrix3)+ "\n");

        int [][] matrix5 = {{ 1, 2, 3, 4, 5, 6, 7, 8},
                            { 9,10,11,12,13,14,15,16},
                            {17,18,19,20,21,22,23,24},
                            {25,26,27,28,29,30,31,32},
                            {33,34,35,36,37,38,39,40}};
        System.out.println("countSquares: " + countSquares(matrix5)+ "\n");


    }

    public static int countSquares(int[][] matrix) {
        int count = 0;

        // Step1 - Create map to store the different combinations of squares
        Map<Integer,Integer> map = new TreeMap<>();

        // Step2 - Traverse each element one by one. Left to right. Top to bottom
        int area = 1;
        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[0].length;col++) {
                System.out.println("\n\nelement: " + matrix[row][col]);

                // Ignore if element is zero
                if (matrix[row][col] == 0) {
                    continue;
                }

                // Step3 - Traverse each combination of squares.
                // Go up by area (i.e size of square)
                area = 1;

                if (map.containsKey(area))
                    map.put(area, map.get(area) + 1);
                else
                    map.put(area, 1);

                elementLoop:
                while (area <= Math.min(matrix.length, matrix[0].length)) {

                    // Step4 - Start from left to right & Top to bottom
                    int endRow = row + area;
                    int endCol = col + area;

                    if (matrix.length <= endRow) break;
                    if (matrix[0].length <= endCol) break;


                    System.out.println("\nendRow: "  + endRow + "     encCol: " + endCol);
                    int end = matrix[endRow][endCol];

                    // Check all values in row are valid
                    int i = row;
                    int j = col;

                    // Step5- Traverse left to right of end
                    System.out.println("\nRow Values:");
                    while (j <= endCol) {
                        System.out.print("  " + matrix[endRow][j] + ",");

                        if (matrix[endRow][j] == 0) {
                            break elementLoop;
                        }

                        j++;
                    }

                    // Step6 - Check all values in col are valid
                    System.out.println("\n" + "Col Values:");
                    while (i <= endRow) {
                        System.out.print("  " + matrix[i][endCol] + ",");

                        if (matrix[i][endCol] == 0) {
                            break elementLoop;
                        }

                        i++;
                    }

                    // Step7- Update Map
                    if (map.containsKey(area + 1))
                        map.put(area + 1, map.get(area + 1) + 1);
                    else
                        map.put(area + 1, 1);

                    area++; // Increase size of square by one
                }
                System.out.println("\nMap: " + map);

            }
            System.out.println();
        }

        // Map up all the keys
        for (int i : map.values()) {
            count+= i;
        }

        return count;
    }


}
