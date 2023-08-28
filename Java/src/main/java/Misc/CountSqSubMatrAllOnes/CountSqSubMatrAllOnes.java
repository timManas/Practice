package Misc.CountSqSubMatrAllOnes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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


    }

    public static int countSquares(int[][] matrix) {
        int count = 0;
        int largest = Math.max(matrix.length, matrix[0].length);
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("largest: " + largest);

        // Step1 - Identify the biggest matrix


        // Step2 - Calculate the sub blocks

        return count;
    }
}
