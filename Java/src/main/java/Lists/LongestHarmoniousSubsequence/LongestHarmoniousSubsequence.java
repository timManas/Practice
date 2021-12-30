package Lists.LongestHarmoniousSubsequence;

import java.util.*;

public class LongestHarmoniousSubsequence {

    public static void main(String [] args) {
        int [][] input = {{1,3,2,2,5,2,3,7}, {1,2,3,4}, {1,1,1}};
        for (int [] i : input)
            System.out.println("Find LHS: " + findLHS(i));
    }

    public static int findLHS(int[] nums) {
        List<Integer> subSeqList = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i=0; i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println("Map: " + map);




        return subSeqList.size();
    }

}
