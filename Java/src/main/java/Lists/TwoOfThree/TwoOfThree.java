package Lists.TwoOfThree;

import java.util.*;

public class TwoOfThree {
    public static void main(String [] args) {
        int [] nums1 = {1,1,3,2};
        int [] nums2 = {2,3};
        int [] nums3 = {3};
        System.out.println("twoOutThree: " + twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> output = new TreeSet<>();

        Set<Integer> set1 = new TreeSet<>();
        for (int i : nums1) set1.add(i);

        Set<Integer> set2 = new TreeSet<>();
        for (int i : nums2) set2.add(i);

        Set<Integer> set3 = new TreeSet<>();
        for (int i : nums3) set3.add(i);

        int max = Math.max(nums1.length, nums2.length);
        max = Math.max(max, nums3.length);

        for (int i=0; i<max; i++) {

        }



        return new ArrayList<>(output);
    }
}
