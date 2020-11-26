package Math.xMaximalSquare;

public class MaximalSquare {

    public static void main(String[] args) {
        char [][] input =  {{'1', '0', '1', '0', '0'},
                            {'1', '0', '1', '1', '1'},
                            {'1', '1', '1', '1', '1'},
                            {'1', '0', '0', '1', '0'}};
        char [][] input2 =  {{'0','1'}, {'1','0'}};
        System.out.println("Maximal Squares: " + maximalSquare(input));
    }

    public static int maximalSquare(char[][] matrix) {

        // Step1 - Create output variable
        int max = 0;

        // Step2 - Return 0 if empty input array
        if (matrix.length == 0)
            return max;

        // Step3 - Create dpMatrix
        int [][] dpMatrix = new int[matrix.length + 1][matrix[0].length + 1];

        // Step4 - Traverse the dpMatrix
        for (int row=1; row < matrix.length; row++) {
            for (int col=1; col < matrix[row].length; col++) {
                System.out.println("Current: " + matrix[row][col]);

                // Step5 - Continue along if encounter a '0'
                if (matrix[row - 1][col - 1] == '0')
                    continue;

                // Step6 - Find the Top, Left, TopLeft numbers
                int top = dpMatrix[row-1][col];
                int left = dpMatrix[row][col-1];
                int topLeft = dpMatrix[row-1][col-1];

                // Step7 - Calculate the current dpMatrix[row][col] * max
                dpMatrix[row][col] = Math.min(left, Math.min(top, topLeft)) + 1;
                max = Math.max(dpMatrix[row][col], max);
            }
            System.out.println();
        }

        return max * max;   // return the square
    }
}

/**
 Notes
 - Super fucking hard 10/10
 - Not my solution =(
 - The trick is to create another matrix dpMatrix which Stores the smallest value of the top,topLeft,Left values

 Solution
 1. Create a dpMatrix . However you increase the size by one
    Why ? Because you start from 1
 2. Traverse the array one by one
 3. If we encounter a 0, we continue
 4. Otherwise, we calculate the top,left, topLeft Values
 5. Find the minimum between all three and add 1
 6. Store the min + 1 to the current dpMatrix
 7. Continue until we reach the last element


 */
