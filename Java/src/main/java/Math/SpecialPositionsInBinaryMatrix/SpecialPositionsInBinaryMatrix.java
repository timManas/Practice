package Math.SpecialPositionsInBinaryMatrix;

public class SpecialPositionsInBinaryMatrix {

    public static void main(String args []) {
        int [][] mat1 = {{1,0,0}, {0,0,1}, {1,0,0}};
        System.out.println("Num Special: " + numSpecial(mat1) + "\n");

        int [][] mat2 = {{1,0,0}, {0,1,0}, {0,0,1}};
        System.out.println("Num Special: " + numSpecial(mat2) + "\n");

        int [][] mat3 = {{0,0,0,1}, {1,0,0,0}, {0,1,1,0}, {0,0,0,0}};
        System.out.println("Num Special: " + numSpecial(mat3) + "\n");

        int [][] mat4 = {{0,0,0,0,0}, {1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,1}};
        System.out.println("Num Special: " + numSpecial(mat4) + "\n");
    }

    private static int numSpecial(int[][] mat) {
        int count = 0;

        for (int row=0; row < mat.length; row++) {
            for (int col=0; col < mat[row].length; col++) {
                int current = mat[row][col];
                System.out.println("--------- Row: " + row + "    Col:" + col + "   Current: " + current);

                // Ignore all 0's
                if (current == 0)
                    continue;

                // At this point it is 1 ------
                boolean isFound = false;

                // Traverse top down
                for (int i=0; i < mat.length; i++) {
                    int elementToBeChecked = mat[i][col];

                    // Move on if we same element
                    if (i == row)
                        continue;


                    if (elementToBeChecked == 1) {
                        isFound = true;
                    }
                }

                // Traverse left right
                for (int i=0; i < mat[0].length; i++) {
                    int elementToBeChecked = mat[row][i];

                    // Move on if we same element
                    if (i == col)
                        continue;

                    if (elementToBeChecked == 1)
                        isFound = true;

                }

                if (!isFound)
                    count++;

            }
        }

        return count;
    }


}
