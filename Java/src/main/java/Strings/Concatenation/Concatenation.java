package Strings.Concatenation;

import java.util.*;

public class Concatenation {
    public static void main(String [] args) {
        int [] arr = {85};
        int [][] pieces = {{85}};
        System.out.println("Can Form Array: " + canFormArray(arr, pieces) + "\n");

        int [] arr1 = {15,88};
        int [][] pieces1 = {{88}};
        System.out.println("Can Form Array: " + canFormArray(arr1, pieces1) + "\n");

        int [] arr2 = {49,18,16};
        int [][] pieces2 = {{16,18,49}};
        System.out.println("Can Form Array: " + canFormArray(arr2, pieces2) + "\n");

        int [] arr3 = {91,4,64,78};
        int [][] pieces3 = {{78}, {4,64}, {91}};
        System.out.println("Can Form Array: " + canFormArray(arr3, pieces3) + "\n");

    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        // Step1 - Create Map to store pieces array
        Map<String, List<Integer>> map = new TreeMap<>();
        for (int i=0; i < pieces.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j=0; j < pieces[i].length; j++) {
                tempList.add(pieces[i][j]);
            }

            map.put(String.valueOf(pieces[i][0]), tempList);
        }
        System.out.println("Map:" + map);

        // Step2 - Create the outputList
        List<Integer> outputList = new ArrayList<>();
        for (int i=0; i < arr.length; i++) {
            int target = arr[i];

            // Check if the list already contains the target
            if (outputList.contains(target))
                continue;

            // Add entire list to outputList if not null
            List<Integer> list = map.get(String.valueOf(target));
            if (list == null)
                continue;
            outputList.addAll(list);
        }
        System.out.println("outputList:" + outputList);

        // Step3 - Check if output list size matches arr
        if (outputList.size() != arr.length)
            return false;

        // Step4 - Check ordering is the same
        for (int i=0; i < arr.length; i++) {
            if (outputList.get(i) != arr[i])
                return false;
        }

        return true;
    }
}
