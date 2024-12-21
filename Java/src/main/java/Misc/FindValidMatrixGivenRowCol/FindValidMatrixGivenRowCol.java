package Misc.FindValidMatrixGivenRowCol;

import java.util.Arrays;

public class FindValidMatrixGivenRowCol {
    public static void main(String [] args) {
        int [] rowSum = {5,7,10};
        int [] colSum = {8,6,8};
        System.out.println("Restore Matrix: " + Arrays.deepToString(restoreMatrix(rowSum, colSum)));

        int [] rowSum1 = {3,8};
        int [] colSum1 = {4,7};
        System.out.println("Restore Matrix: " + Arrays.deepToString(restoreMatrix(rowSum1, colSum1)));

    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int [][] output = new int[rowSum.length][colSum.length];

        return output;
    }
}
