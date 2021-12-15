package Lists.DetermineMatrixObtainedByRotation;

import java.util.Map;
import java.util.TreeMap;

public class DetermineMatrixObtainedByRotation {
    public static void main(String [] args) {
        int [][] mat = {{0,1}, {1,0}};
        int [][] target = {{1,0}, {0,1}};
        System.out.println("Find Rotation: " + findRotation(mat, target));

        int [][] mat1 = {{0,1}, {1,1}};
        int [][] target1 = {{1,0}, {0,1}};
        System.out.println("Find Rotation: " + findRotation(mat1, target1));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        // Check if there is the same amount of 1's
        Map<Integer, Integer> matMap = populateMap(mat);
        Map<Integer, Integer> targetMap = populateMap(target);

        if (matMap.size() != targetMap.size() || matMap.get(0) != targetMap.get(0) || matMap.get(1) != targetMap.get(1))
            return false;

        // Rotate and Compare to target array
        for (int i=0; i < 4; i++) {
            if (!isMatch(mat, target))
                return false;

            rotateMatrix(mat);
        }


        return true;
    }


    private static void rotateMatrix(int[][] mat) {

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
