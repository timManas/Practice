package Math.MostFreqEvenElement;

import java.util.*;

public class MostFreqEvenElement {
    public static void main(String [] args) {
        int [] nums = {0,1,2,2,4,4,1};
        System.out.println("most Freq: " + mostFrequentEven(nums) + "\n");

        int [] nums1 = {4,4,4,9,2,4};
        System.out.println("most Freq: " + mostFrequentEven(nums1)+ "\n");

        int [] nums2 = {29,47,21,41,13,37,25,7};
        System.out.println("most Freq: " + mostFrequentEven(nums2)+ "\n");
    }

    public static int mostFrequentEven(int[] nums) {
        int mostFreq = 0;
        int mostFreqKey = -1;

        // Step1 - Create map to store the count
        Map<Integer, Integer> map = new TreeMap<>();

        // Step2 - Populate Map
        for (int i=0; i<nums.length; i++) {
            System.out.println("nums: " + nums[i]);
            if (nums[i] % 2 != 0 )
                continue;

            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        System.out.println("Prev map:" + map);


        // Step3 - Sort map based on value;
        map = sortByValue(map);
        System.out.println("map:" + map);

        // Step4 - Get the last value and traverse from largest to smallest
        List<Integer> keyList = new ArrayList<>(map.keySet());
        for (int i=keyList.size()-1; i>=0;i--) {
            System.out.println("    key: " + keyList.get(i));

            if (mostFreq <= map.get(keyList.get(i))) {
                mostFreqKey = keyList.get(i);
                mostFreq = map.get(keyList.get(i));
            }
        }

        return mostFreqKey;
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> treeMap) {
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry> list = new LinkedList<>(treeMap.entrySet());

        // Sort List
        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return ((Comparable)o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Place in LinkedList
        for (Map.Entry mapEntry : list) {
            sortedMap.put((Integer) mapEntry.getKey(), (Integer) mapEntry.getValue());
        }

        return sortedMap;
    }
}
