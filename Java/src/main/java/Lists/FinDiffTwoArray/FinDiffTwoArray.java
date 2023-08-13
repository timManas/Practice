package Lists.FinDiffTwoArray;

import java.util.*;

public class FinDiffTwoArray {
    public static void main(String [] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4,6};
        System.out.println("Diff: " + findDifference(nums1, nums2) + "\n");

        int [] nums1a = {1,2,3,3};
        int [] nums2a = {1,1,2,2};
        System.out.println("Diff: " + findDifference(nums1a, nums2a) + "\n");
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> output = new ArrayList<>();

        // Step1 - Create sets
        Set<Integer> set1 = new TreeSet<>();
        for (int i : nums1) set1.add(i);
        Set<Integer> set2 = new TreeSet<>();
        for (int i : nums2) set2.add(i);

        // Step2 - Create Duplicate set to keep track of original
        Set<Integer> set1Duplicate = new TreeSet<>(set1);
        Set<Integer> set2Duplicate = new TreeSet<>(set2);

        // Step3 - Find the asymmetric difference
        set1.removeAll(set2Duplicate);
        set2.removeAll(set1Duplicate);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // Step4 - Add to output list
        output.add(new ArrayList<>(set1));
        output.add(new ArrayList<>(set2));

        return output;
    }
}
