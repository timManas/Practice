package Math.MatrixBlockSum;

public class MatrixBlockSum {

    public static void main(String [] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int K = 1;

        int [][] result = matrixBlockSum(mat, K);
        System.out.println("Done");
    }

    public static int[][] matrixBlockSum(int[][] mat, int K) {
        int [][] result = new int[mat.length][];

        for (int x=0; x < mat.length; x++) {
            for (int y=0; y < mat[x].length; y++) {
                System.out.println(mat[x][y]);

                result[x][y] = sumBlock(mat, x, y, K);
                System.out.println(result[x][y]);
            }
        }

        return result;
    }

    private static int sumBlock(int[][] mat, int x, int y, int K) {
        int total = 0;

        int minX = x - K < 0 ? 0 : x - K;
        int minY = y - K < 0 ? 0 : y - K;

        int maxX = x + K > mat.length ? mat.length : x + K;
        int maxY = y + K > mat.length ? mat.length : y + K;




        for (int i=minX; i < maxX; i++) {
            for (int j=minY; j < maxY; j++) {
                total += mat[i][j];
            }
        }

        return total;
    }

}
