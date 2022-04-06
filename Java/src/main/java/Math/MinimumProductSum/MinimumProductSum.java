package Math.MinimumProductSum;

import java.util.Arrays;

public class MinimumProductSum {
    public static void main(String [] args) {
        int [] nums1 = {5,3,4,2};
        int [] nums2 = {4,2,2,5};
        System.out.println("MinProductSum: " + minProductSum(nums1, nums2));

        int [] nums3 = {2,1,4,5,7};
        int [] nums4 = {3,2,4,8,6};
        System.out.println("MinProductSum: " + minProductSum(nums3, nums4));
    }

    public static int minProductSum(int[] nums1, int[] nums2) {
        // Step1 - Sort nums1 in ascending order
        Arrays.sort(nums1);

        // Step2 - Sorts nums2 in descending order
        Arrays.sort(nums2);

        // Step3 - Calculate the min product
        int min = 0;
        for (int i=0; i < nums1.length; i++) {
            min += nums1[i] * nums2[nums1.length - 1 - i];
        }

        return min;
    }
}
