package Lists.SortIntegersByNum1Bits;

import java.util.*;

public class SortIntegersByNum1Bits {
    public static void main (String [] args) {
        int [][] input = {{0,1,2,3,4,5,6,7,8}, {1024,512,256,128,64,32,16,8,4,2,1}, {10000,10000}, {2,3,5,7,11,13,17,19}};
        for (int [] arr : input) {
            int [] output = sortByBits(arr);
            for (int i : output)
                System.out.print(i + ", ");

            System.out.println();
        }
    }

    public static int[] sortByBits(int[] arr) {

        // Step1 - Create output array
        int [] output = new int [arr.length];

        // Step2 - Create map to store all the numof1s
        Map<Integer, List<Integer>> map = new TreeMap<>();

        // Step3 - Poulate the map
        for (int i : arr) {

            // Convert to binary
            String binary = Integer.toBinaryString(i);

            // Find numb of 1s
            int num1S = findNumOnes(binary);

            // Add to map
            List<Integer> mapList = new ArrayList<>();;
            if (map.containsKey(num1S)) {
                mapList = map.get(num1S);
            }

            // Add to map, then Sort from lowest to highest
            mapList.add(i);
            Collections.sort(mapList);
            map.put(num1S, mapList);
        }

        // Populate the output array
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> mapEntry : map.entrySet()) {
            List<Integer> list = mapEntry.getValue();
            for (int num : list) {
                output[index] = num;
                index++;
            }
        }

        return output;
    }

    private static int findNumOnes(String binary) {
        int count = 0;
        for (int i=0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                count++;
        }

        return count;
    }
}

