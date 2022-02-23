package Lists.MaxSubsequence;

import java.util.*;

public class MaxSubsequence {
    public static void main(String [] args) {
//        int [] nums = {2,1,3,3};
//        int k=2;
//        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums, k)) + "\n");
//
//        int [] nums1 = {-1,-2,3,4};
//        int k1=3;
//        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums1, k1)) + "\n");
//
//        int [] nums2 = {3,4,3,3};
//        int k2=2;
//        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums2, k2)) + "\n");

        int [] nums3 = {63,-74,61,-17,-55,-59,-10,2,-60,-65};
        int k3=9;
        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums3, k3)) + "\n");
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        // Step1 - Create output varaible
        int [] output = new int[k];

        // Step2 - Check if k equals nums.length ...for the sake of speed
        if (nums.length == k)
            return nums;

        // Step3 - Sort the input array. We make a copy since we need the original
        int [] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        // Step4 - Find the Max SubSequence
        List<Integer> maxlist = new ArrayList<>();
        for (int i=sorted.length - 1; i >= sorted.length - k; i--) {
            System.out.println("current: " + sorted[i]);
            maxlist.add(sorted[i]);
        }

        // Step5 - Starting the original nums array, we traverse each number and check if number is one of the max list
        int outputIndex = 0;
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            if (!maxlist.contains(current))
                continue;

            output[outputIndex++] = current;
            maxlist.remove(maxlist.indexOf(current));
        }

        return output;
    }
}
