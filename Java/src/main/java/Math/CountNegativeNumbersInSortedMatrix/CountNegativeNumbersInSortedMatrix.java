package Math.CountNegativeNumbersInSortedMatrix;

public class CountNegativeNumbersInSortedMatrix {

    public static void main(String [] args) {
        int [][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println("Negatives: " + countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;

        // Step 1 - Traverse multi dimensional matrix
        for (int i=0; i < grid.length; i++) {
            for (int j=0; j < grid[i].length; j++) {

                // Step2 - If element < 0, increment count
                if (grid[i][j] < 0)
                    ++count;
            }
        }


        return count;
    }
}
