package Lists.DetectPatternLengthMRepeatedKTimes;

import java.util.*;

public class DetectPatternLengthMRepeatedKTimes {
    public static void main(String [] args) {
        int [] arr = {1,2,4,4,4,4};
        int m = 1;
        int k = 3;
        System.out.println("Contains Pattern: " + containsPattern(arr, m, k) + "\n");

        int [] arr1 = {1,2,1,2,1,1,1,3};
        int m1 = 2;
        int k1 = 2;
        System.out.println("Contains Pattern: " + containsPattern(arr1, m1, k1) + "\n");

        int [] arr2 = {1,2,1,2,1,3};
        int m2 = 2;
        int k2 = 3;
        System.out.println("Contains Pattern: " + containsPattern(arr2, m2, k2) + "\n");

        int [] arr3 = {1,2,3,1,2};
        int m3 = 2;
        int k3 = 2;
        System.out.println("Contains Pattern: " + containsPattern(arr3, m3, k3) + "\n");

        int [] arr4 = {2,2};
        int m4 = 1;
        int k4 = 2;
        System.out.println("Contains Pattern: " + containsPattern(arr4, m4, k4) + "\n");

        int [] arr5 = {2,2,2,2};
        int m5 = 2;
        int k5 = 3;
        System.out.println("Contains Pattern: " + containsPattern(arr5, m5, k5) + "\n");


        //{1,2,1,2,1,3};
        //{3,2,1,2,1,3};
        //{1,2,1,2,5,3};
    }

    public static boolean containsPattern(int[] arr, int m, int k) {

        // Step1 - Keep track of counts of the largest and current count
        int longestCount = 0;
        int currentCount = 0;
        String prevPattern = "";


        // Step3 - Convert arr to list
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        // Step3 - Traverse one by one
        for (int i=0; i<arr.length; i++) {
            System.out.println("i: " + arr[i]);
            currentCount = 0;

            // Step4 - Traverse by m times. Find the sublist and compare with prev
            for (int x=i; x < arr.length; x+=m) {
                if (x + m > arr.length)
                    break;

                // Step5 - Find the sublist
                List<Integer> subList = list.subList(x, x + m);
                System.out.println("subList: " + subList);

                // Step6 - Increment respective counters if equal to the previous patterns
                if (subList.toString().equalsIgnoreCase(prevPattern)) {
                    currentCount++;
                } else {
                    longestCount = longestCount < currentCount ? currentCount : longestCount;
                    currentCount = 1;
                }

                prevPattern = subList.toString();
            }
            System.out.println();
            longestCount = longestCount < currentCount ? currentCount : longestCount;
        }



        return longestCount >= k;
    }
}
