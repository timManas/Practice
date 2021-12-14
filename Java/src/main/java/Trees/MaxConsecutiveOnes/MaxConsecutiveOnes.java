package Trees.MaxConsecutiveOnes;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    public static void main(String [] args) {
        int [][] input = {{1,1,0,1,1,1}, {1,0,1,1,0,1}, {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}};
        for (int [] i : input)
            System.out.println("Find Max Consecutive Ones: " + findMaxConsecutiveOnes(i) + "\n");
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("max", 0);
        map.put("consecutive", 0);
        map.put("prevElement", -1);
        traverseArray(nums, 0, map);

        return map.get("max");
    }

    private static void traverseArray(int[] nums, int index, Map<String, Integer> map) {

        if (index >= nums.length)
            return;

        int leftIndex = (2*index) + 1;
        int rightIndex = (2*index) + 2;

        System.out.println("Current: " + nums[index]);

        if (nums[index] == 1) {

            if (map.get("prevElement") == 1) {
                map.put("consecutive", map.get("consecutive") + 1);
            } else {
                map.put("consecutive", 1);
            }
        } else {
            if (map.get("prevElement") == 1) {
                if (map.get("max") < map.get("consecutive")) {
                    map.put("max", map.get("consecutive"));
                    map.put("consecutive", 0);      // Reset
                }
            }
        }
        map.put("prevElement", nums[index]);

        traverseArray(nums, leftIndex, map);
        traverseArray(nums, rightIndex, map);

    }
}
