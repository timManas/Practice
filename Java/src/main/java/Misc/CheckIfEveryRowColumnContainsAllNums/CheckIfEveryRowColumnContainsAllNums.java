package Misc.CheckIfEveryRowColumnContainsAllNums;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CheckIfEveryRowColumnContainsAllNums {

    public static void main(String [] args) {
        int [] [] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println("CheckValid: " + checkValid(matrix) + "\n");

        int [] [] matrix1 = {{1,1,1},{1,2,3},{1,2,3}};
        System.out.println("CheckValid: " + checkValid(matrix1) + "\n");
    }

    public static boolean checkValid(int[][] matrix) {

        // Step1 - Create set to remove ellements
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < matrix.length; i++) list.add(i + 1);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println("set: " + set);

        // Step2 - Traverse row by row. Remove each element from the set. If already removed, set to false
        for (int row=0; row < matrix.length; row++) {
            Set<Integer> rowSet = new TreeSet<>(set);
            for (int i=0; i<matrix.length; i++) {
                System.out.println(matrix[row][i]);
                if (!rowSet.contains(matrix[row][i]))
                    return false;

                rowSet.remove(matrix[row][i]);
            }
        }

        // Step3 - Traverse col by col. Remove each element from the set. If already removed, set to false
        for (int col=0; col < matrix.length; col++) {
            Set<Integer> colSet = new TreeSet<>(set);
            for (int j=0; j < matrix[col].length; j++) {
                System.out.println(matrix[j][col]);
                if (!colSet.contains(matrix[j][col]))
                    return false;

                colSet.remove(matrix[j][col]);
            }
        }

        return true;
    }
}
