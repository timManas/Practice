package Math.Shift2DGrid;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String [] args) {
        int [][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        System.out.println("Shift Grid: " + shiftGrid(grid, k));

        int [][] grid2 = {{3,8,1,9},{19,7,2,5},{4,6,11,10}, {12,0,21,13}};
        int k2 = 4;
        System.out.println("Shift Grid: " + shiftGrid(grid2, k2));

        int [][] grid3 = {{1,2,3},{4,5,6},{7,8,9}};
        int k3 = 9;
        System.out.println("Shift Grid: " + shiftGrid(grid3, k3));

        int [][] grid4 = {{1}};
        int k4 = 100;
        System.out.println("Shift Grid: " + shiftGrid(grid4, k4));

        int [][] grid5 = {{1},{2},{3},{4},{7},{6},{5}};
        int k5 = 23;
        System.out.println("Shift Grid: " + shiftGrid(grid5, k5));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {

        // Step1 - Create output variable
        List<List<Integer>> outputList = new ArrayList<>();

        // Step2 - Continue shifting until we reach 0 ....from k
        while (k > 0) {

            // Step3 - Store the first Element
            // We need this to refer to the very first element
            int firstElement = grid[0][0];
            System.out.println("K = " + k);

            // Step4 - Traverse the grid backwards ...starting at the bottom right to top left
            for (int i=grid.length-1; i>=0; i--) {
                for (int j=grid[i].length-1; j>=0; j--) {

                    int current = grid[i][j];
                    System.out.println("Grid: " + current);

                    // Step5 - Check indexes
                    if (i == grid.length-1 && j == grid[i].length - 1) {    // Element at grid[m - 1][n - 1] moves to grid[0][0].
                        grid[0][0] = current;
                    } else if (i == 0 && j == 0) {          // Element at the first 0,0 index

                        // Step5b - Check the size ... if subArray is bigger than 1, then set the current to the next element
                        // Otherwise we
                        if (grid[i].length > 1)
                            grid[i][j+1] = firstElement;
                        else                        // Otherwise, we move indexes
                            grid[i+1][0] = firstElement;

                    } else if (j == grid[i].length - 1) { // Element at grid[i][n - 1] moves to grid[i + 1][0].
                        grid[i+1][0] = current;

                    } else {
                        grid[i][j+1] = current;         // Element at grid[i][j] moves to grid[i][j + 1].


                    }
                }
            }
            k--;
        }

        // Step6 - Convert Array to List
        for (int x=0; x<grid.length; x++) {
            List<Integer> tempList = new ArrayList<>();
            for (int y=0; y<grid[x].length; y++) {
                tempList.add(grid[x][y]);
            }
            outputList.add(tempList);
        }

        return outputList;
    }
}

/**
 Notes
 - Holy shit this was hard ...
 - But i got it myself

 Solution
 1. Key is to work backwards from bottom right to top left
 2. Create while loop to traverse backwards shifting until we reach 0 ....from k
 3. Check the indexes:
 Element at grid[i][j] moves to grid[i][j + 1].
 Element at grid[i][n - 1] moves to grid[i + 1][0].
 Element at grid[m - 1][n - 1] moves to grid[0][0].
 Element at grid[0][0] .... if subArray length is bigger than 1, we set the next element in the sub array. Else, we increase the next ith index by one
 4. Convert array to List
 */
