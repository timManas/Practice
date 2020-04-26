package Math.MatrixBlockSum;

public class MatrixBlockSum {

    public static void main(String [] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int K = 1;

//        int [][] mat = {{67,64,78},{99,98,38},{82,46,46},{6,52,55},{55,99,45}};
//        int K = 3;

        int [][] result = matrixBlockSum(mat, K);
        System.out.println("Done");
    }

    public static int[][] matrixBlockSum(int[][] mat, int K) {

        // Step1 - Create Resulting Multi-dim Array
        int [][] result = new int[mat.length][mat[0].length];

        // Step2 - Traverse input matrix one by one
        for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                result[x][y] = sumBlock(mat, x, y, K);
                System.out.println(result[x][y]);
            }
        }

        return result;
    }

    private static int sumBlock(int[][] mat, int x, int y, int K) {
        // Step1 - Initialize total variable ... to store cumulative total
        int total = 0;

        // Step2 - Calculaet the lower and upper bounds
        int minRow = x - K < 0 ? 0 : x - K;
        int minCol = y - K < 0 ? 0 : y - K;
        int maxRow = x + K >= mat.length ? mat.length - 1 : x + K;
        int maxCol = y + K >= mat[0].length ? mat[0].length - 1 : y + K;


        // Step3 - Calculate the Sum of all values between the upper and lower bounds inclusive
        for (int i=minRow; i <= maxRow; i++) {
            for (int j=minCol; j <= maxCol; j++) {
                total += mat[i][j];
            }
        }

        return total;
    }
}


/**
 Solution
 - A bit tricky but the trick is to define the upper and lower bounds to calculate the total
 - Remember that  when creating a new Multi-Dimen array, you need to define the #rows and columns
    > Otherwise, you get an error
 - Calculate the upper and lower bounds and use loop to calculate the total for each element
 - We then place that total in the new ML array we created.

 Runtime: O(n^2) ... :(  but it works
 */
