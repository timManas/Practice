package Lists.MinCommonValue;

import java.util.*;

public class MinCommonValue {
    public static void main(String [] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4};
        System.out.println("Get Common: " + getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new TreeSet<>();
        for (int i : nums1) set1.add(i);

        Set<Integer> set2 = new TreeSet<>();
        for (int i : nums2) set2.add(i);


        set1.retainAll(set2);
        System.out.println(set1);

        List<Integer> intersection = new ArrayList<>(set1);


        return intersection.size() == 0 ? -1 : intersection.get(0);
    }
}
