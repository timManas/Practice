package Lists.DegreeOfArray;

import java.util.*;

public class DegreeOfArray {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,3,1}, {1,2,2,3,1,4,2}};
        for (int [] i : input)
            System.out.println("Shortest subArray: " + findShortestSubArray(i) + "\n");
    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> occurenceMap = new LinkedHashMap<>();
        Map<Integer, Integer> startIndexMap = new LinkedHashMap<>();
        Map<Integer, Integer> lastIndexMap = new LinkedHashMap<>();

        // Traverse nums List
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            if (occurenceMap.containsKey(current)) {
                occurenceMap.put(current, occurenceMap.get(current) + 1);
            } else {
                occurenceMap.put(current, 1);
                startIndexMap.put(current, i);
            }

            // Add to lastIndex Map
            lastIndexMap.put(current, i);
        }

        System.out.println("Occurence Map: " + occurenceMap);
        System.out.println("StartIndex Map: " + startIndexMap);
        System.out.println("EndIndex Map: " + lastIndexMap);


        // Traverse Occurence Map and find smallest subarray




        return 0;
    }
}
