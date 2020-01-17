package Lists.RelativeSort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSort {

    public static void main(String [] args) {

        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};

        int [] sorted = relativeSortArray(arr1, arr2);
        for (int i : sorted)
            System.out.println(i);

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] sorted = new int[arr1.length];
        int index = 0;
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        // Go through Arr1 and place in map
        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        // Step 2 - For every value in map, add into sorted in order
        for (int i=0; i < arr2.length; i++) {
            int key = arr2[i];
            int counter = map.containsKey(key) ? map.get(key) : 1;

            for (int j=0; j<counter; j++) {
                sorted[index] = key;
                index++;
            }
            map.remove(key);
        }

        // Add Remaining
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int counter = mapEntry.getValue();

            for (int j=0; j<counter; j++) {
                sorted[index] = key;
                index++;
            }
        }

        return sorted;
    }


}
