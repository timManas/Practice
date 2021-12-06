package Strings.Concatenation;

import java.util.*;

public class Concatenation {
    public static void main(String [] args) {
        int [] arr = {85};
        int [][] pieces = {{85}};
        System.out.println("Can Form Array: " + canFormArray(arr, pieces));

        int [] arr1 = {15,88};
        int [][] pieces1 = {{88}};
        System.out.println("Can Form Array: " + canFormArray(arr1, pieces1));

        int [] arr2 = {49,18,16};
        int [][] pieces2 = {{16,18,49}};
        System.out.println("Can Form Array: " + canFormArray(arr2, pieces2));

        int [] arr3 = {91,4,64,78};
        int [][] pieces3 = {{78}, {4,64}, {91}};
        System.out.println("Can Form Array: " + canFormArray(arr3, pieces3));

    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        // Create Map to store pieces array
        Map<String, List<Integer>> map = new TreeMap<>();
        for (int i=0; i < pieces.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int j=0; j < pieces[i].length; j++) {
                tempList.add(pieces[i][j]);
                sb.append(pieces[i][j] + " ");
            }

            map.put(sb.toString().trim(), tempList);
        }
        System.out.println("Map:" + map);

        return true;
    }
}
