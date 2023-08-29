package Misc.CountSqSubMatrAllOnes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSqSubMatrAllOnes {

    public static void main (String [] args) {
//        int [][] matrix = { {0,1,1,1},
//                            {1,1,1,1},
//                            {0,1,1,1}};
//        System.out.println("countSquares: " + countSquares(matrix)+ "\n");


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

        int [][] matrix3 = {{0,1,0,1,1,0,1,1},
                            {1,0,1,1,1,1,1,1},
                            {1,1,1,1,1,1,1,1},
                            {1,0,0,1,1,1,1,1},
                            {0,1,1,1,1,1,1,1}};
        System.out.println("countSquares: " + countSquares(matrix3)+ "\n");


    }

    public static int countSquares(int[][] matrix) {
        int count = 0;
        int largest = Math.max(matrix.length, matrix[0].length);
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("largest: " + largest);

        // Step1 - Identify the consecutive one
        List<Integer> sizeList = findOnes(matrix);


        // Step2 - Traverse the matrix


        // Step2 - Calculate the sub blocks

        return count;
    }

    private static List<Integer> findOnes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int numConOnes = 0;
        for (int i=0; i<matrix.length; i++) {

            numConOnes = 0;
            for (int j=0; j<matrix[0].length - 1;j++) {
                int current = matrix[i][j];
                int next = matrix[i][j+1];

                if (current == 0) {
                    numConOnes = 0;
                } else if (next == 1) {
                    if (numConOnes == 0) numConOnes++;
                    numConOnes++;
                }

                if (j == matrix[0].length - 2) {
                    list.add(numConOnes);
                }

            }
        }

        System.out.println("list: " + list);
        return list;
    }
}
