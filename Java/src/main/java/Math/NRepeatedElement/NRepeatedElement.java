package Math.NRepeatedElement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NRepeatedElement {

    public static void main(String [] args) {

//        int [] input = {5,1,5,2,5,3,5,4};
        int [] input = {2,1,2,5,3,2};
        System.out.println("RepeatedTimes: " + repeatedNTimes(input));
    }

    public static int repeatedNTimes(int[] inputArr) {

        // Step1 - Create map to store the number of times number occurs in array
        HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        // Step2 - Populate the map
        for (int i : inputArr) {
            int value = 1;
            if (map.containsKey(i))
                value = map.get(i) + 1;

            map.put(i, value);
        }

        // Find N
        int N = inputArr.length / 2;

        // Step4 - Traverse map until value matches N
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            // If match return key
            if (value == N)
                return key;
        }

        return 0;
    }

}
