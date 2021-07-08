package Lists.MaxAscSubArraySum;

import java.util.*;

public class MaxAscSubArraySum {
    public static void main(String [] args) {
        int [][] input = {{3,6,10,1,8,9,9,8,9}, {10,20,30,5,10,50}, {10,20,30,40,50}, {12,17,15,13,10,11,12}, {100,10,1}};
        for (int [] nums : input)
            System.out.println("max ascending sum: " + maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();

        int subTotal = 0;
        List<Integer> tempList = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            // Do nothing for the 1st element in the array
            if (i == 0) {
                subTotal += current;
                tempList.add(current);
                continue;
            }

            // Check if Ascending. Clear temp set if descending
            if (nums[i-1] > current) {
                map.put(subTotal, tempList);
                tempList.clear();

                subTotal = current;
                tempList.add(current);  // Start from scatch
            } else {
                subTotal += current;
                tempList.add(current);
            }


        }
        map.put(subTotal, tempList);
        System.out.println("Map: " + map);

        List<Integer> list = new ArrayList<>(map.keySet());

        return list.get(list.size()-1);
    }
}
