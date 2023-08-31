package Misc.CountSqSubMatrAllOnes;

import java.lang.reflect.Array;
import java.util.*;

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

        int [][] matrix3 = {{1,1,1,0,1,0,1,0},      //[3,1,1]
                            {1,0,1,1,1,1,1,1},      //[1,6]
                            {1,1,1,1,1,1,1,1},      //[8]
                            {1,1,1,1,1,0,1,1},      //[5,2]
                            {0,1,1,1,1,1,1,1}};     //[7]
        System.out.println("countSquares: " + countSquares(matrix3)+ "\n");


    }

    public static int countSquares(int[][] matrix) {
        int count = 0;

        Map<Integer,Integer> map = new TreeMap<>();

        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[0].length;col++) {
                System.out.print(matrix[row][col] + ",");
            }
            System.out.println();
        }


        return count;
    }


}
