package Math.MaximalSquare;

import java.util.Arrays;

public class MaximalSquare {

    public static void main(String[] args) {
        char [][] input =  {{'1', '0', '1', '0', '0'},
                            {'1', '0', '1', '1', '1'},
                            {'1', '1', '1', '1', '1'},
                            {'1', '0', '0', '1', '0'}};
        char [][] input2 =  {{'0','1'}, {'1','0'}};
        System.out.println("Maximal Squares: " + maximalSquare(input2));
    }

    public static int maximalSquare(char[][] matrix) {
        int max = 0;

        if (matrix.length == 0)
            return max;

        // Create deep copy of original matrix and assign to dpMatrix
        int [][] dpMatrix = new int[matrix.length][matrix[0].length];
        for (int row=0; row < matrix.length; row++) {
            for (int col=0; col < matrix[row].length; col++) {
                dpMatrix[row][col] = Character.getNumericValue(matrix[row][col]);
            }
        }

        // Check if Matrix is only one row or only one column
        if (dpMatrix.length == 1 || dpMatrix[0].length == 1) {
            for (int row=0; row < dpMatrix.length; row++) {
                for (int col=0; col < dpMatrix[row].length; col++) {
                    if (dpMatrix[row][col] == 1)
                        return 1;
                }
            }
            return max;
        }

        // Traverse the dpMatrix
        for (int row=1; row < dpMatrix.length; row++) {
            for (int col=1; col < dpMatrix[row].length; col++) {
                int current = dpMatrix[row][col];
                System.out.println("Current: " + current);

                if (current == 0)
                    continue;

                int top = dpMatrix[row-1][col];
                int left = dpMatrix[row][col-1];
                int topLeft = dpMatrix[row-1][col-1];

                dpMatrix[row][col] = Math.min(left, Math.min(top, topLeft)) + 1;
                max = Math.max(dpMatrix[row][col], max);
            }
            System.out.println();
        }

        return max * max;
    }

}
