package Lists.DegreeOfArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class DegreeOfArray {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,3,1}, {1,2,2,3,1,4,2}};
        for (int [] i : input)
            System.out.println("Shortest subArray: " + findShortestSubArray(i));
    }

    public static int findShortestSubArray(int[] nums) {

        // Create map and populate
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : nums){
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        // Find largest occurence
        int largestElement = 0;
        int largestOccurence = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() > largestOccurence) {
                largestElement = mapEntry.getKey();
                largestOccurence = mapEntry.getValue();
            }
        }

        System.out.println("Largest Element: " + largestElement + "    Count: " + largestOccurence);


        return 0;
    }
}
