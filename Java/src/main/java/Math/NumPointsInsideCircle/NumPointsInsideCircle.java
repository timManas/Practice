package Math.NumPointsInsideCircle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumPointsInsideCircle {

    public static void main(String [] args) {
        int [][] points = {{1,3},{3,3},{5,3},{2,2}};
        int [][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        System.out.println("Count Points: " + Arrays.toString(countPoints(points, queries)));

        int [][] points1 =  {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int [][] queries1 = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        System.out.println("Count Points: " + Arrays.toString(countPoints(points1, queries1)));
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        List<Integer> list = new ArrayList<>();




        // Create output Points
        int [] output = new int[queries.length];
        for (int i : list) output[i] = list.get(i);

        return output;
    }
}
