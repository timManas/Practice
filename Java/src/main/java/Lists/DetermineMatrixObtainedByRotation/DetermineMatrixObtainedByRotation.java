package Lists.DetermineMatrixObtainedByRotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DetermineMatrixObtainedByRotation {
    public static void main(String [] args) {

        int [][] mat0 = {{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int [][] target0 = {{15,13,2,5}, {14,3,4,1}, {12,6,8,9}, {16,7,10,11}};
        System.out.println("Find Rotation: " + findRotation(mat0, target0));


        int [][] mat = {{0,1}, {1,0}};
        int [][] target = {{1,0}, {0,1}};
        System.out.println("\nFind Rotation: " + findRotation(mat, target));

        int [][] mat1 = {{0,1}, {1,1}};
        int [][] target1 = {{1,0}, {0,1}};
        System.out.println("\nFind Rotation: " + findRotation(mat1, target1));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        // Check if there is the same amount of 1's
        Map<Integer, Integer> matMap = populateMap(mat);
        Map<Integer, Integer> targetMap = populateMap(target);

        if (matMap.size() != targetMap.size() || matMap.get(0) != targetMap.get(0) || matMap.get(1) != targetMap.get(1))
            return false;

        // Rotate and Compare to target array
        for (int i=0; i < 4; i++) {

            rotateMatrix(mat);

            if (!isMatch(mat, target))
                return false;


        }


        return true;
    }

    // Rotate Matrix in place
    private static void rotateMatrix(int[][] mat) {
        // Store element in List
        List<Integer> list = new ArrayList<>();

        // Start from 0,0
        for (int i=0; i < mat.length / 2; i++) {

            // X: 0 - N
            for (int col=i; col < mat[i].length - i; col++) {
                System.out.print(mat[i][col] + ",");
            }
            System.out.println();

            // Y: 0 - N
            for (int row=i; row < mat.length - i; row++) {
                System.out.print(mat[row][mat.length - 1 - i] + ",");
            }
            System.out.println();

            // X: N-0
            for(int col=mat[i].length - 1 - i; col >= i; col--) {
                System.out.print(mat[mat.length - 1 - i][col] + ",");
            }
            System.out.println();

            for (int row=mat.length - 1 - i; row >= i; row--) {
                System.out.print(mat[row][i] + ",");
            }
            System.out.println();



        }

    }


    private static boolean isMatch(int[][] mat, int[][] target) {
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<target.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }

        return true;
    }

    private static Map<Integer, Integer> populateMap(int[][] mat) {
        Map<Integer, Integer> matMap = new TreeMap<>();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (matMap.containsKey(mat[i][j]))
                    matMap.put(mat[i][j], matMap.get(mat[i][j]) + 1);
                else
                    matMap.put(mat[i][j], 1);
            }
        }

        return matMap;
    }
}
