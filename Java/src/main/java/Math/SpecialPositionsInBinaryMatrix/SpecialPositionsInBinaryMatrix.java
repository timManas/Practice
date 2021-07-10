package Math.SpecialPositionsInBinaryMatrix;

public class SpecialPositionsInBinaryMatrix {

    public static void main(String args []) {
//        int [][] mat1 = {{1,0,0}, {0,0,1}, {1,0,0}};
//        System.out.println("Num Special: " + numSpecial(mat1));

        int [][] mat2 = {{1,0,0}, {0,1,0}, {0,0,1}};
        System.out.println("Num Special: " + numSpecial(mat2));

        int [][] mat3 = {{0,0,0,1}, {1,0,0,0}, {0,1,1,0}, {0,0,0,0}};
        System.out.println("Num Special: " + numSpecial(mat3));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;

        boolean isFound1 = false;
        int index = 0;
        while (index < mat.length) {

            // Traverse Top Down
            for (int i=0; i < mat.length; i++) {
                int currentX = mat[i][index];
                System.out.println("row:" + i + "   col: " + index + "      Current: " + currentX);
                if (currentX == 0)
                    continue;

                if (isFound1) {
                    isFound1 = false;
                    break;
                }

                isFound1 = true;
            }

            // Traverse Left Right
            for (int i=0; i < mat[0].length; i++) {
                int currentY = mat[index][i];
                System.out.println("row:" + index + "   col: " + i + "      Current: " + currentY);

                if (currentY == 0)
                    continue;

                if (isFound1) {
                    isFound1 = false;
                    break;
                }

                isFound1 = true;
            }

            System.out.println();



            if (isFound1)
                count++;

            isFound1 = false;   // Reset the values

            index++;
        }

        return count;
    }
}
