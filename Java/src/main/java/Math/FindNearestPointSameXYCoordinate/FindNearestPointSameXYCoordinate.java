package Math.FindNearestPointSameXYCoordinate;

import java.util.ArrayList;
import java.util.List;

public class FindNearestPointSameXYCoordinate {
    public static void main(String [] args) {
//        int x = 3, y = 4;
//        int [][] points = {{1,2}, {3,1}, {2,4}, {2,3}, {4,4}};

//        int x = 3, y = 4;
//        int [][] points = {{3,4}};

        int x = 1, y = 1;
        int [][] points = {{3,4}};

        System.out.println("Neatest Valid Point: " + nearestValidPoint(x,y, points));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int smallestDistance = Integer.MAX_VALUE;

        // Step1 - Create List
        List<Integer> list = new ArrayList<>();

        // Step2 - Traverse through input points array
        // Populate list
        for (int row=0; row < points.length; row++) {
            int pointX = points[row][0];
            int pointY = points[row][1];
            if (x == pointX || y == pointY) {
                int manhattanDistance = Math.abs(x-pointX) + Math.abs(y-pointY);
                list.add(manhattanDistance);

                // Set the smallest Distance
                smallestDistance = manhattanDistance < smallestDistance ? manhattanDistance : smallestDistance;

            } else {
                list.add(Integer.MAX_VALUE);
            }
        }

        // Step3 - Check if smallest thing has changed
        if (smallestDistance == Integer.MAX_VALUE)
            return -1;

        // Step4 - Return index with the smallest index
        for (int i=0; i < list.size(); i++) {
            if (list.get(i) == smallestDistance)
                return i;
        }

        return -1;
    }
}
