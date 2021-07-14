package Math.Shift2DGrid;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Shift2DGrid {
    public static void main(String [] args) {
//        int [][] grid = {{1,2,3},{4,5,6},{7,8,9}};
//        int k = 1;
//        System.out.println("Shift Grid: " + shiftGrid(grid, k));
//
//
//        int [][] grid2 = {{3,8,1,9},{19,7,2,5},{4,6,11,10}, {12,0,21,13}};
//        int k2 = 4;
//        System.out.println("Shift Grid: " + shiftGrid(grid2, k2));
//
//
//        int [][] grid3 = {{1,2,3},{4,5,6},{7,8,9}};
//        int k3 = 9;
//        System.out.println("Shift Grid: " + shiftGrid(grid3, k3));

        int [][] grid4 = {{1}};
        int k4 = 100;
        System.out.println("Shift Grid: " + shiftGrid(grid4, k4));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int itemsToBeShifted = k;
        List<List<Integer>> outputList = new ArrayList<>();



        if (grid.length == 1 && grid[0].length == 1) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(grid[0][0]);
            outputList.add(tempList);
            return outputList;
        }




        Deque<Integer> queue = new LinkedList<>();

        int i = grid.length - 1;
        int j = grid[0].length - 1;
        while (k > 0) {
            queue.addFirst(grid[i][j]);
            i = j == 0 ? --i : i;
            j = j == 0 ? grid[0].length - 1 : --j;
            k--;
        }

        int remaining = (grid.length * grid[0].length) - itemsToBeShifted;
        i = 0;
        j = 0;
        while (remaining > 0) {
            queue.addLast(grid[i][j]);
            i = j == grid[0].length - 1 ? ++i : i;
            j = j == grid[0].length - 1 ? 0 : ++j;

            --remaining;
        }

        System.out.println("Queue: " + queue);
        // Create the outputList
        for (int row=0; row<grid.length; row++) {
            List<Integer> rowList = new ArrayList<>();
            for (int col=0; col < grid[0].length; col++) {
                rowList.add(queue.removeFirst());
            }
            outputList.add(rowList);;
        }

        return outputList;
    }
}
