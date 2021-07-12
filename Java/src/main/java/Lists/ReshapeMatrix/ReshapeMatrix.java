package Lists.ReshapeMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReshapeMatrix {
    public static void main(String [] args) {
//        int [][] mat = {{1,2},{3,4}};
//        int r = 1, c = 4;
//        int [][] output = matrixReshape(mat, r, c);
//        for (int i=0; i < output.length; i++) {
//            for (int j=0; j <output.length; j++) {
//                System.out.print(output[i][j] + ", ");
//            }
//            System.out.println();
//        }

//        int [][] mat2 = {{1,2},{3,4}};
//        int r2 = 2, c2 = 4;
//        int [][] output2 = matrixReshape(mat2, r2, c2);
//        for (int i=0; i < output2.length; i++) {
//            for (int j=0; j <output2.length; j++) {
//                System.out.print(output2[i][j] + ", ");
//            }
//            System.out.println();
//        }

        int [][] mat3 = {{1,2,3,4}};
        int r3 = 2, c3 = 2;
        int [][] output3 = matrixReshape(mat3, r3, c3);
        for (int i=0; i < output3.length; i++) {
            for (int j=0; j <output3.length; j++) {
                System.out.print(output3[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] output = new int [r][c];

        // Step1 - Check if mat and new array will be having the same number of elements
        // Return original if not
        int numElements = mat.length * mat[0].length;
        if (numElements != r*c)
            return mat;

        // Step2 - Create list to store the values and populate
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < mat.length; i++) {
            for (int j=0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }

        // Step3 - Reverse the list
        Collections.reverse(list);

        // Step4 - Populate output list
        System.out.println("List: " + list);
        for (int i=0; i < output.length; i++) {
            for (int j=0; j < output[0].length; j++) {
                output[i][j] = list.remove(list.size() - 1);
            }
        }

        return output;
    }
}
