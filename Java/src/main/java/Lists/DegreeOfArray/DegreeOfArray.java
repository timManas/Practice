package Lists.DegreeOfArray;

import java.util.*;

public class DegreeOfArray {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,3,1}, {1,2,2,3,1,4,2}};
        for (int [] i : input)
            System.out.println("Shortest subArray: " + findShortestSubArray(i) + "\n");
    }

    public static int findShortestSubArray(int[] nums) {
        // Step1 - Create variable to store the largest occurence & shortestSubArrayLength
        int largestOccurence = 0;
        int shortestSubArrayLength = Integer.MAX_VALUE;

        // Step2 - Create map to store the occurence, the start position, end position list
        Map<Integer, Integer> occurenceMap = new LinkedHashMap<>();
        Map<Integer, Integer> startIndexMap = new LinkedHashMap<>();
        Map<Integer, Integer> lastIndexMap = new LinkedHashMap<>();

        // Step3 - Traverse nums List & populate maps
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];

            // If contains add to counter
            if (occurenceMap.containsKey(current)) {
                occurenceMap.put(current, occurenceMap.get(current) + 1);
            } else {
                occurenceMap.put(current, 1);
                startIndexMap.put(current, i);
            }

            // keep track of the largest occurence
            largestOccurence = occurenceMap.get(current) > largestOccurence ? occurenceMap.get(current) : largestOccurence;

            // Add last known position of this element
            lastIndexMap.put(current, i);
        }

        System.out.println("Occurence Map: " + occurenceMap + "     LargestOccurence: " + largestOccurence);
        System.out.println("StartIndex Map: " + startIndexMap);
        System.out.println("EndIndex Map: " + lastIndexMap);

        // Step4 - Traverse Occurence Map and find smallest subarray using startIndex and endIndex list
        for (Map.Entry<Integer, Integer> mapEntry : occurenceMap.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (value != largestOccurence)
                continue;

            int lengthBetweenStartEnd = Math.abs(lastIndexMap.get(key) - startIndexMap.get(key));
            shortestSubArrayLength = (shortestSubArrayLength > lengthBetweenStartEnd) ? lengthBetweenStartEnd : shortestSubArrayLength;
        }


        // Add one since it is length
        return shortestSubArrayLength + 1;
    }
}
