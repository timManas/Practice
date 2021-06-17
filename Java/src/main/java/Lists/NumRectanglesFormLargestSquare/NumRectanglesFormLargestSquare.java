package Lists.NumRectanglesFormLargestSquare;

import java.util.*;

public class NumRectanglesFormLargestSquare {
    public static void main(String [] args) {
        int [][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
//        int [][] rectangles = {{5,8},{3,9},{3,12}};
        System.out.println("Largest possible square length: " + countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] input) {
        // Step1 - Traverse each array one by one
        // Populate the map with the min values
        Map<Integer, Integer> map = new TreeMap<>();
        for (int [] rectangle : input) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (map.containsKey(min)) {
                map.put(min, map.get(min) + 1);
            } else {
                map.put(min, 1);
            }
        }
        // Step2 - Find the max value in the tree
        int max = Collections.max(map.keySet());
        return map.get(max);
    }
}

