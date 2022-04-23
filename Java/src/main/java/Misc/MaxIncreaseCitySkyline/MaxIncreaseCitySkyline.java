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

        // Step1 - Create list to store the max of each row and max of each column
        List<Integer> rowMaxList = new ArrayList<>();
        List<Integer> colMaxList = new ArrayList<>();

        // Step2 - Populate rowHighest
        for (int row=0; row < grid.length; row++) {
            int largest = -1;
            for (int col=0; col < grid.length; col++) {
                largest = largest < grid[row][col] ? grid[row][col] : largest;
            }
            rowMaxList.add(largest);
        }
        System.out.println("rowHighest: " + rowMaxList);

        // Step3 - Populate colHighest
        for (int col=0; col < grid.length; col++) {
            int largest = -1;
            for (int row=0; row < grid[col].length; row++) {
                largest = largest < grid[row][col] ? grid[row][col] : largest;
            }
            colMaxList.add(largest);
        }
        System.out.println("colHighest: " + colMaxList);


        // Step4 - Find the replaced value
        // The max is difference between the replaced value and the current value
        for (int row=0; row < grid.length; row++) {
            for (int col=0; col < grid[row].length; col++) {
                int current = grid[row][col];
                int rowMax = rowMaxList.get(row);
                int colMax = colMaxList.get(col);

                // If currentValue is equal to the max, we  move on
                // Why ? Because its already the max. Changing this would change the skyline
                if (rowMax == current || colMax == current) {
                    System.out.print(current + ",");
                    continue;
                }

                // Step5 - Find the replaced value. This is the value we put in the array
                // The max is the difference between the current and the replaced value
                int replacedValue = Math.min(rowMax, colMax);
                max += Math.abs(replacedValue - current);

                System.out.print(Math.min(rowMax, colMax) + ",");
            }
            System.out.println();
        }

        return max;
    }
}
