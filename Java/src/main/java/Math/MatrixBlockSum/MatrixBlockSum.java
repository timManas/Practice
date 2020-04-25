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
            }
        }

        return result;
    }

}
