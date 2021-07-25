package Lists.TwoSumLessThanK;

import java.util.*;

public class TwoSumLessThanK {
    public static void main(String [] args) {
        int [] nums = {34,23,1,24,75,33,54,8};
        int k = 60;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums,k));

        int [] nums2 = {10,20,30};
        int k2 = 60;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums2,k2));
    }

    public static int twoSumLessThanK(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();

        // Sort the arrays
        Arrays.sort(nums);

        for (int i=0; i < nums.length - 1; i++) {
            int current = nums[i];

            if (current >= k)
                break;

            int findLastElementIndex = findElementIndex(nums, k - current, i+1, nums.length - 1);
            if (findLastElementIndex == -1)
                continue;

            set.add(current + findLastElementIndex);
        }

        System.out.println("Set:" + set);

        // Return the last element;
        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size()-1);
    }

    private static int findElementIndex(int[] nums, int target, int start, int end) {

        int result = -1;

        if (start >= end)
            return start-1;

        int midIndex = (start + end) / 2;

        if (target == nums[midIndex]) {
            result = midIndex - 1;
        } else if (target < nums[midIndex]) {
            result = findElementIndex(nums, target, start, midIndex-1);
        } else if (target > nums[midIndex]) {
            result = findElementIndex(nums, target, midIndex + 1, end);
        }

        return result;
    }
}
