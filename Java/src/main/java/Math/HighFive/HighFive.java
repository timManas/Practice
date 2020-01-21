package Math.HighFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighFive {

    public static void main(String [] args) {
        int [][] input = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        int [][] output = highFive(input);

//        print(input);
        print(output);
    }



    public static int[][] highFive(int[][] items) {


        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        // Step1 - Add to HashMap
        for (int row=0; row < items.length; row++) {
            int id = items[row][0];
            int grade = items[row][1];
            ArrayList<Integer> arrayList;

            if (map.containsKey(id)) {
                arrayList = map.get(id);
            } else {
                arrayList = new ArrayList<Integer>();
            }

            arrayList.add(grade);
            map.put(id, arrayList);
        }

        int [][] totalArr = new int [map.size()][2];

        // Step2 - Add TopFive
        int rowIndex = 0;
        int colIndex = 0;
        for (Map.Entry<Integer, ArrayList<Integer>> mapEntry : map.entrySet()) {
            int id = mapEntry.getKey();
            int total = fetchTopFive(mapEntry.getValue());

            totalArr[rowIndex][colIndex] = id;
            ++colIndex;

            totalArr[rowIndex][colIndex] = total;
            ++rowIndex;
            colIndex = 0;

            System.out.println();
        }


        return totalArr;
    }

    private static int fetchTopFive(ArrayList<Integer> gradeList) {
        int total = 0;
        int counter = 5;
        Collections.sort(gradeList);

        while (counter > 0) {
            total += gradeList.get(gradeList.size() - counter);
            counter--;
        }

        total = total / 5;

        return total;
    }

    private static void print(int[][] arr) {
        for (int row=0; row < arr.length; row++) {
            for (int col=0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}
