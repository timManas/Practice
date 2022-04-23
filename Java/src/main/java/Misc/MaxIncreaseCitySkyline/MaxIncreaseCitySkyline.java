package Misc.MaxIncreaseCitySkyline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxIncreaseCitySkyline {
    public static void main(String [] args) {
        int [][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println("Max Increase: " + maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int max = 0;
        List<Integer> rowHighest = new ArrayList<>();
        List<Integer> colHighest = new ArrayList<>();

        // Populate rowHighest
        for (int row=0; row < grid.length; row++) {
            int [] rowArr = Arrays.copyOf(grid[row], grid.length);
            Arrays.sort(rowArr);
            rowHighest.add(rowArr[rowArr.length - 1]);
        }
        System.out.println("rowHighest: " + rowHighest);

        // Populate colHighest
        for (int col=0; col < grid.length; col++) {
            int largest = -1;
            for (int row=0; row < grid[col].length; row++) {
                largest = largest < grid[row][col] ? grid[row][col] : largest;
            }
            colHighest.add(largest);
        }
        System.out.println("colHighest: " + colHighest);

        return max;
    }
}
