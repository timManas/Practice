package Lists.SortArrayByIncreasingFreq;

import java.util.*;

public class SortArrayByIncreasingFreq {
    public static void main (String [] args) {
        int [][] input = {{1,1,2,2,2,3}, {2,3,1,3,2}, {-1,1,-6,4,5,-6,1,4,1}};
        for (int [] nums : input) {
            int [] output = frequencySort(nums);

            for (int i : output)
                System.out.print(i + ", ");
            System.out.println();
        }

    }

    public static int[] frequencySort(int[] nums) {
        int [] output = new int[nums.length];

        // Step1 - Create Map which stores occurences
        Map<Integer, Integer> occurenceMap = new TreeMap<>();
        for (int i : nums) {
            if (occurenceMap.containsKey(i)) {
                occurenceMap.put(i, occurenceMap.get(i) + 1);
            } else
                occurenceMap.put(i, 1);
        }

        // Step2 - Create Map which stores the order
        Map<Integer, TreeSet<Integer>> map = new TreeMap<>();
        for (Map.Entry<Integer, Integer> mapEntry : occurenceMap.entrySet()) {
            int digit = mapEntry.getKey();
            int numOccurence = mapEntry.getValue();

            TreeSet<Integer> tempSet = new TreeSet<>();
            if (map.containsKey(numOccurence)) {
                tempSet = map.get(numOccurence);
                tempSet.add(digit);
            } else {
                tempSet.add(digit);
            }
            map.put(numOccurence, tempSet);
        }

        // Step3 - Build the output Array
        int index = 0;
        for (Map.Entry<Integer, TreeSet<Integer>> mapEntry : map.entrySet()) {
            int occurences = mapEntry.getKey();
            List<Integer> list = new ArrayList<>(mapEntry.getValue()); // Convert Set to List

            // Step4 - If more than one value in list ..reverse
            if (list.size() > 1)
                Collections.reverse(list);

            // Step5 - Add values to output array
            for (int num : list) {
                for (int i=0; i < occurences; i++) {
                    output[index] = num;
                    index++;
                }
            }
        }

        return output;
    }
}
