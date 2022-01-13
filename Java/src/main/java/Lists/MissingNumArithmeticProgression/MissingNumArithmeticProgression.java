package Lists.MissingNumArithmeticProgression;

import java.util.*;

public class MissingNumArithmeticProgression {
    public static void main(String [] args) {
        int [][] input = {{5,7,11,13}, {15,13,12}};
        for (int [] i : input)
            System.out.println("Missing Number: " + missingNumber(i));
    }

    public static int missingNumber(int[] arr) {
        int missingNum = arr[0];

        // Step1 - Sort
        Arrays.sort(arr);

        // Step2 - Find the difference with the largest occurence
        Map<Integer, Integer> diffMap = new TreeMap<>();
        for (int i=1; i<arr.length; i++) {
            int diff = arr[i] - arr[i-1];
            if (diffMap.containsKey(diff))
                diffMap.put(diff, diffMap.get(diff) + 1);
            else
                diffMap.put(diff, 1);
        }
        int largestOccurence = -1;
        int largestDiff = -1;
        for (Map.Entry<Integer, Integer> mapEntry : diffMap.entrySet()) {
            if (mapEntry.getValue() > largestOccurence) {
                largestDiff = mapEntry.getKey();
                largestOccurence = mapEntry.getValue();
            }
        }
        System.out.println("DiffMap: " + diffMap + "    largestOccurence: " + largestOccurence + "     largestDiff: " + largestDiff);

        // Step3 - Traverse input Array & find the missing #
        for (int i=0; i<arr.length - 1; i++) {
            int theoreticalNext = arr[i] + largestDiff;
            if (arr[i + 1] != theoreticalNext) {
                missingNum = theoreticalNext;
                break;
            }
        }

        return missingNum;
    }
}
