package Lists.ElementAppearing25Per;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ElementAppearing25Per {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,6,6,6,6,7,10}, {1,1}};
        for (int [] i : input)
            System.out.println("Find Special Int: " + findSpecialInteger(i));

    }

    public static int findSpecialInteger(int[] arr) {
        // Step1 - Create map to store the count of each digit
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
             else
                map.put(i, 1);
        }

        // Step2 - Find the largest value in the map and return
        int largest = -1;
        int largestValue = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()){
            if (mapEntry.getValue() > largestValue) {
                largestValue = mapEntry.getValue();
                largest = mapEntry.getKey();
            }
        }

        return largest;
    }
}
