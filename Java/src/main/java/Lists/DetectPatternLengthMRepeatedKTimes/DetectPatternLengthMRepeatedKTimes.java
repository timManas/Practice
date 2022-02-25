package Lists.DetectPatternLengthMRepeatedKTimes;

import java.util.*;

public class DetectPatternLengthMRepeatedKTimes {
    public static void main(String [] args) {
//        int [] arr = {1,2,4,4,4,4};
//        int m = 1;
//        int k = 3;
//        System.out.println("Contains Pattern: " + containsPattern(arr, m, k) + "\n");
//
//        int [] arr1 = {1,2,1,2,1,1,1,3};
//        int m1 = 2;
//        int k1 = 2;
//        System.out.println("Contains Pattern: " + containsPattern(arr1, m1, k1) + "\n");
//
//        int [] arr2 = {1,2,1,2,1,3};
//        int m2 = 2;
//        int k2 = 3;
//        System.out.println("Contains Pattern: " + containsPattern(arr2, m2, k2) + "\n");

        int [] arr3 = {1,2,3,1,2};
        int m3 = 2;
        int k3 = 2;
        System.out.println("Contains Pattern: " + containsPattern(arr3, m3, k3) + "\n");
    }

    public static boolean containsPattern(int[] arr, int m, int k) {
        Map<String, Integer> map = new TreeMap<>();

        Deque<Integer> queue = new LinkedList<>();
        for (int i=0; i < arr.length; i++) {
            int current = arr[i];

            if (queue.size() != m) {
                queue.addFirst(current);
            } else {
                System.out.println("removing: " + queue.removeLast());
                queue.addFirst(current);
            }
            System.out.println("Queue: " + queue);

            List<Integer> tempList = new ArrayList<>(queue);
            String listString = tempList.toString();
            if (map.containsKey(listString)) {
                map.put(listString, map.get(listString) + 1);
            } else {
                map.put(listString, 1);
            }
        }
        System.out.println("Map: " + map);

        // Find if any one of the list has length k
        for (Map.Entry<String, Integer> mapEntry: map.entrySet()) {
            if (mapEntry.getValue() >= k)
                return true;
        }

        return false;
    }
}
