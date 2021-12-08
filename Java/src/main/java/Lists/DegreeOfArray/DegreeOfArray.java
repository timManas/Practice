package Lists.DegreeOfArray;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfArray {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,3,1}, {1,2,2,3,1,4,2}};
        for (int [] i : input)
            System.out.println("Shortest subArray: " + findShortestSubArray(i) + "\n");
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
        List<Integer> largestElementList = new ArrayList<>();
        int largestOccurence = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {

            if (mapEntry.getValue() > largestOccurence) {
                largestOccurence = mapEntry.getValue();
                largestElementList.clear();
                largestElementList.add(mapEntry.getKey());

            } else if (mapEntry.getValue() == largestOccurence) {
                largestElementList.add(mapEntry.getKey());
            }
        }

        System.out.println("Largest Element: " + largestElementList + "    Count: " + largestOccurence);
        int minSubArrayLength = Integer.MAX_VALUE;
        // Find the largest SubArray Length
        List<Integer> subList = new ArrayList<>();
        for (int i=0; i < largestElementList.size(); i++) {
            int target = largestElementList.get(i);

            System.out.println("Looking for Element: " + target);

            outLoop:
            for (int start=0; start < nums.length; start++) {
                subList.clear();
                int count = 0;

                System.out.println("Start: " + nums[start]);
                subList.add(nums[start]);
                if (nums[start] == target)
                    ++count;

                if (count == largestOccurence) {
                    System.out.println("SubList: " + subList + " | Count: " + count);
                    minSubArrayLength = Math.min(minSubArrayLength, subList.size());
                    break;
                }

                inLoop:
                for (int end=start + 1; end < nums.length; end++) {
                    System.out.println("End: " + nums[end]);

                    subList.add(nums[end]);
                    if (nums[end] == target)
                        ++count;

                    if (count == largestOccurence) {
                        System.out.println("SubList: " + subList + " | Count: " + count);
                        minSubArrayLength = Math.min(minSubArrayLength, subList.size());
                        break inLoop;
                    }


                }
            }
        }



        return minSubArrayLength;
    }
}
