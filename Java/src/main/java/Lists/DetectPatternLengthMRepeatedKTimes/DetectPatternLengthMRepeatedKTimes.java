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


        //{1,2,1,2,1,3};
        //{3,2,1,2,1,3};
        //{1,2,1,2,5,3};
    }

    public static boolean containsPattern(int[] arr, int m, int k) {
        // Convert arr to list
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        Deque<Integer> queue = new LinkedList<>();
        int start = 0;
        int end = 0;

        for (int i=0; i<arr.length; i++) {
            int current = list.get(i);
            System.out.println("current: " + current);

            if (queue.size() != m) {
                queue.addLast(current);
            } else {

            }
        }



        return false;
    }
}
