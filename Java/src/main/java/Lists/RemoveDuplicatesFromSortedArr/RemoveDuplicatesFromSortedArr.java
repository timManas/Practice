package Lists.RemoveDuplicatesFromSortedArr;

import java.util.HashMap;
import java.util.TreeMap;

public class RemoveDuplicatesFromSortedArr {

    public static void main(String [] args) {
//        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int [] nums = {-3,-1,0,0,0,3,3};
        System.out.println("Totalnumber: " + removeDuplicates(nums));
        for (int i : nums)
            System.out.println(i);
    }


    public static int removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        // Store all key/value pair into map
        for (int i : nums) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        int index = 0;
        for (int element : map.keySet()) {
            nums[index++] = element;
        }



        return index;
    }
}

/**
 Solution
 1. Use two pointers ... one pointer to move by one, and the other pointer to move slowly
 2. Use a map to store all the key sets
 */
