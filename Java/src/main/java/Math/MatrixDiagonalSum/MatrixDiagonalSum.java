package Math.MatrixDiagonalSum;

public class MatrixDiagonalSum {

    public static void main(String [] args) {
        int [][] matrix1 =  {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] matrix2 =  {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};

        System.out.println("Digonal Sum: " + diagonalSum(matrix1));
        System.out.println("Digonal Sum: " + diagonalSum(matrix2));
    }

    public static int diagonalSum(int[][] mat) {
        int sum=0;
        boolean isMiddleHit = false;

        // Step1 - Check if length is 1
        if (mat.length == 1 && mat[0].length == 1)
            return mat[0][0];

        // Step2 - Digonal Right (Top Left to Bottom Right)
        int row=0;
        int col=0;
        while (row < mat.length) {

            if (!isMiddleHit && row == col && row != 0) {
                isMiddleHit = true;
            }

            System.out.println(mat[row][col]);
            sum += mat[row][col];
            col++;
            row++;
        }

        // Step3 - Digonal Left (Top Right to Bottom Left)
        row = 0;
        col = mat.length - 1;

        while (row < mat.length) {

            if (isMiddleHit && row == col) {
                col--;
                row++;
                continue;
            }

            System.out.println(mat[row][col]);
            sum += mat[row][col];
            col--;
            row++;
        }

        return sum;
    }
}
