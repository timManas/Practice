package Lists.LongestHarmoniousSubsequence;

import java.util.*;

public class LongestHarmoniousSubsequence {

    public static void main(String [] args) {
        int [][] input = {{1,3,2,2,5,2,3,7}, {1,2,3,4}, {1,1,1}};
        for (int [] i : input)
            System.out.println("Find LHS: " + findLHS(i));
    }

    public static int findLHS(int[] nums) {
        // Step1 - Create output var
        int LHS = 0;

        // Step2 - Create Map to count number of occurence of each number
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println("Map: " + map);

        // Step3 - Find the keys which have difference of 1, check if LHS needs to be updated
        List<Integer> setList = new ArrayList<>(map.keySet());
        for (int i=1; i<setList.size(); i++) {
            int prev = setList.get(i-1);
            int current = setList.get(i);

            if (Math.abs(current - prev) == 1) {
                int total = map.get(prev) + map.get(current);
                LHS = total > LHS ? total : LHS;
            }
        }

        return LHS;
    }

}
