package Misc.FindValidMatrixGivenRowCol;

import java.util.Arrays;

public class FindValidMatrixGivenRowCol {
    public static void main(String [] args) {
        int [] rowSum = {5,7,10};
        int [] colSum = {8,6,8};
        System.out.println("Restore Matrix: " + Arrays.deepToString(restoreMatrix(rowSum, colSum)) + "\n");

        int [] rowSum1 = {3,8};
        int [] colSum1 = {4,7};
        System.out.println("Restore Matrix: " + Arrays.deepToString(restoreMatrix(rowSum1, colSum1)) + "\n");

    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] output = new int[rowSum.length][colSum.length];

        for(int row=0; row<rowSum.length; row++) {
            for (int col=0; col<colSum.length; col++) {
                int min = Math.min(rowSum[row], colSum[col]);
                System.out.println("row: " + rowSum[row] + " | col: " + colSum[col] + " | min: " + min);

                output[row][col] = min;
                rowSum[row] = rowSum[row] - min;
                colSum[col] = colSum[col] - min;
            }
        }

        return output;
    }
}
