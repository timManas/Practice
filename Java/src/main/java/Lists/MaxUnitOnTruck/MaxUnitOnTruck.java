package Lists.MaxUnitOnTruck;

import java.util.*;

public class MaxUnitOnTruck {

    public static void main (String [] args) {
        int [][] boxTypes = {{1,3}, {2,2}, {3,1}}; int truckSize = 4;
        System.out.println("MaxUnits: " + maximumUnits(boxTypes, truckSize));

        int [][] boxTypes2 = {{5,10}, {2,5}, {4,7}, {3,9}}; int truckSize2 = 10;
        System.out.println("MaxUnits: " + maximumUnits(boxTypes2, truckSize2));

        int [][] boxTypes3 = {{2,1}, {4,4}, {3,1}, {4,1}, {2,4}, {3,4}, {1,3}, {4,3}, {5,3}, {5,3}}; int truckSize3 = 13;
        System.out.println("MaxUnits: " + maximumUnits(boxTypes3, truckSize3));
    }

    public static int maximumUnits(int[][] boxTypes, int maxSize) {
        int totalNumUnits = 0;
        int totalBoxes = 0;

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i=0; i < boxTypes.length; i++) {
            int numBoxes = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];
            if (map.containsKey(unitsPerBox))
                map.put(unitsPerBox, map.get(unitsPerBox) + numBoxes);
            else
                map.put(unitsPerBox, numBoxes);
        }

        // Find the total
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            totalNumUnits += mapEntry.getKey() * mapEntry.getValue();
            totalBoxes += mapEntry.getValue();
        }

        // Reduce the total until its matches maxSize
        // Start with the smallest units first
        List<Integer> keys = new ArrayList<>(map.keySet());
        while (totalBoxes > maxSize) {
            System.out.println("TotalNumUnits: " + totalNumUnits + "    TotalNumBoxes: " + totalBoxes);

            // Fetch the 1st element ..aka smallest unit per box
            int unitsPerBox = keys.get(0);
            int numBox = 1;

            // Decrement the count
            map.put(unitsPerBox, map.get(unitsPerBox) - 1);

            // Removed from map and list if value is 0
            if (map.get(unitsPerBox) == 0) {
                map.remove(unitsPerBox);
                keys.remove(0);
            }

            totalNumUnits -= unitsPerBox * numBox;
            totalBoxes -= numBox;
        }

        return totalNumUnits;
    }
}
