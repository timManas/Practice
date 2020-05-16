package Sorting.PancakeSorting;

import java.util.*;

class Solution {

    public static void main(String [] args) {
        int [] A = {3,2,4,1};
        System.out.println("Pancake Sort: " + pancakeSort(A));
    }

    public static List<Integer> pancakeSort(int[] A) {

        // Step1 - Create list to return
        List<Integer> list = new ArrayList<>();

        // Step2 - Set index: Index is the position starting from last all way to the first element
        int index = A.length - 1;

        // Step3 - Convert array to list & create Sorted list to keep track of the largest value
        List<Integer> Alist = new ArrayList<>();
        for (int i : A) {
            Alist.add(i);
        }
        List<Integer> orderedList = new ArrayList<>(new TreeSet<>(Alist));

        // Step4 - Start from the Last index all the way till 1st index
        int largestVal;
        int k;
        while (index > 0) {
            largestVal = orderedList.get(index);

            // Step5 - Flip from 0 to largest value
            k = flip(Alist, 0, Alist.indexOf(largestVal));
            list.add(k);

            // Step6 - Flip from 0 to index
            k = flip(Alist, 0, index);
            list.add(k);

            // Step7 - Update the largest value now
            --index;
        }

        return list;
    }

    // Flip the values in the list using two pointers
    private static int flip(List<Integer> list, int start, int end) {
        int k = end + 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        return k;
    }
}

/**
 Solution
 - Relatively simple once you get the hang of it
 - You only have operation method "flip()" where you flip all values from start to end in the list

 Step1
 - Start from the last index to the first index+
 - Find largest value
 - Flip from 0 to largest value
    > Now largest value should be in the 1st index
 - Flip from 0 to last index
    why ? This will place the largest value at the very last position (sorted)
 - Continue until we reach the first index


 Watch video on Pancake Sorting ...quite useful and easy

 */

