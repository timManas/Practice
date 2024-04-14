package Lists.CountElementsWithMaxFreq;

import java.util.*;

public class CountElementsWithMaxFreq {
    public static void main (String [] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println("max Freq:" + maxFrequencyElements(nums) + "\n");

        int [] nums1 = {1,2,3,4,5};
        System.out.println("max Freq:" + maxFrequencyElements(nums1) + "\n");
    }

    public static int maxFrequencyElements(int[] nums) {
        int numElementsWithMaxFreq = 0;
        int maxFreq = 0;
        Map<Integer, Integer> map = new TreeMap<>();

        // Create Map
        for (int num : nums) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
            maxFreq = maxFreq < map.get(num) ? map.get(num) : maxFreq;
        }
        System.out.println("map: " + map);
        System.out.println("maxFreq: " + maxFreq);


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            numElementsWithMaxFreq = entry.getValue() == maxFreq ? numElementsWithMaxFreq + entry.getValue(): numElementsWithMaxFreq;
        }

        return numElementsWithMaxFreq;
    }
}
