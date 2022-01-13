package Misc.CheckIfEveryRowColumnContainsAllNums;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CheckIfEveryRowColumnContainsAllNums {

    public static void main(String [] args) {
        int [] [] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        System.out.println("CheckValid: " + checkValid(matrix));

        int [] [] matrix1 = {{1,1,1},{1,2,3},{1,2,3}};
        System.out.println("CheckValid: " + checkValid(matrix1));
    }

    public static boolean checkValid(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < matrix.length; i++) list.add(i + 1);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println("set: " + set);



        return true;
    }
}
