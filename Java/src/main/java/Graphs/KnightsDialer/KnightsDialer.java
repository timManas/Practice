package Graphs.KnightsDialer;

import java.util.HashMap;
import java.util.Map;

public class KnightsDialer {

    public static final int max = 1000000007;
    private static final int[][] dirs = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
    static Map<String,Long> pathCount = new HashMap<>();

    public static void main(String [] args) {
        int [] input = {1,2,3,4,3131};
        for (int i : input)
            System.out.println("# of Unique Numbers: " + knightDialer(i));
    }

    public static int knightDialer(int n) {
        long result = 0;

        // Step1 - Traverse input grid one by one
        for (int row=0; row<4; row++) {
            for (int col=0; col<3; col++) {
                result = (result + findPaths(row,col,n)) % max;
            }
        }
        return (int) result;
    }

    private static long findPaths(int row, int col, int n) {

        // Step1 - Check if over the boundary
        if (row < 0 || row >= 4 || col < 0 || col >= 3 || (row == 3 && col != 1))
            return 0;

        // Step2 - Return if size is 1
        if (n == 1)
            return 1;

        String key = row + "_" + col + "_" + n;

        // Step3 - Check if Path already exists
        if (pathCount.containsKey(key))
            return pathCount.get(key);

        // Step4 - If path DNE, Find the total number of paths we can take
        long totalPath = findPaths(row - 1, col - 2, n - 1) % max +        // jump to a
                findPaths(row - 2, col - 1, n -1) % max +               // jump to b
                findPaths(row - 2, col + 1, n - 1) % max +              // jump to c
                findPaths(row - 1, col + 2, n - 1) % max +              // jump to d
                findPaths(row + 1, col + 2, n - 1) % max +              // jump to e
                findPaths(row + 2, col + 1, n - 1) % max +              // jump to f
                findPaths(row + 2, col - 1, n - 1) % max +              // jump to g
                findPaths(row + 1, col - 2, n - 1) % max;               // jump to h


        // Step5 - Add to pathCount
        pathCount.put(key,totalPath);

        return totalPath;
    }

}

/**
 Notes
 - Very very fucking HARD. like 10/10 Hard
 - This solution is better but not mine



 Solution
 1. Traverse the input grid one by one
 2. For Each element in the grid
    - Check if within grid boundary of the phone dialer
    - Check if remaining input is greater than 1.
    - Check if path already exists:
        > if Exists, use it
        > Not: Fnd the path and add it to Map for memory
    - Return totalPath

Moves available for Knight
 *   *   *   *   *   *   *   *
 *   *   *   *   *   *   *   *
 *   *   b   *   c   *   *   *
 *   a   *   *   *   d   *   *
 *   *   *   k   *   *   *   *
 *   h   *   *   *   e   *   *
 *   *   g   *   f   *   *   *
 *   *   *   *   *   *   *   *

 */


