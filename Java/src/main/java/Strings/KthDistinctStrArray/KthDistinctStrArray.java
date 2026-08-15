package Strings.KthDistinctStrArray;

import java.util.*;

public class KthDistinctStrArray {

    public static void main(String [] args) {
        String [] arr = {"d","b","c","b","c","a"}; // a,b,b,c,c,d
        int k = 2;
        System.out.println("kth Distinct: " + kthDistinct(arr, k) + "\n");

        String [] arr1 = {"a","b","a"}; // a,b,b,c,c,d
        int k1 = 3;
        System.out.println("kth Distinct: " + kthDistinct(arr1, k1) + "\n");
    }

    public static String kthDistinct(String[] arr, int k) {

        List<String> list = new ArrayList<>();
        Set<String> duplicates = new TreeSet<>();

        outLoop:
        for (int i=0; i < arr.length; i++) {
            String current = arr[i];
            boolean isDup = false;
            System.out.println("current: " + current);

            if (duplicates.contains(current)) {
                continue;
            }

            inLoop:
            for (int j=i+1; j < arr.length; j++) {
                String next = arr[j];
                System.out.println("    next: " + next);



                if (current.equalsIgnoreCase(next)) {
                    System.out.println("    duplicate found");

                    duplicates.add(current);
                    isDup = true;
                    break;
                }
            }

            if (!isDup)
                list.add(current);
        }

        System.out.println(list);

        return list.size() <= k-1 ? "" :  list.get(k-1);
    }
}
