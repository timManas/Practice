package Math.NumPointsInsideCircle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumPointsInsideCircle {

    public static void main(String [] args) {
        int [][] points = {{1,3},{3,3},{5,3},{2,2}};
        int [][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        System.out.println("Count Points: " + Arrays.toString(countPoints(points, queries)) + "\n");

        int [][] points1 =  {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int [][] queries1 = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        System.out.println("Count Points: " + Arrays.toString(countPoints(points1, queries1)) + "\n");
    }

    public static int[] countPoints(int[][] points, int[][] queries) {

        // Step1 - Create list to store the num of points
        List<Integer> list = new ArrayList<>();

        // Step2 - Traverse Points and find the radius between each point and a query
        int numPoints = 0;
        for (int i=0; i < queries.length; i++) {
            for (int x=0; x < points.length; x++) {

                // Step3 - Find the radius
                double radius = findRadius(queries[i], points[x]);
                if (radius <= queries[i][2])
                    ++numPoints;
            }

            // Step4 - Add numPoints to list
            list.add(numPoints);
            numPoints = 0;
        }

        // Step5 - Create output Points
        int [] output = new int[queries.length];
        for (int i=0; i < list.size(); i++) output[i] = list.get(i);
        return output;
    }

    private static double findRadius(int[] query, int[] point) {
        int x = Math.abs(query[0] - point[0]);
        int y = Math.abs(query[1] - point[1]);
        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("r: " + r + "    x: " + x + "    y: " + y);
        return r;
    }
}
