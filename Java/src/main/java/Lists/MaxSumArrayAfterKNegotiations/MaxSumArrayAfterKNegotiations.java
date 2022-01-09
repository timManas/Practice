package Lists.MaxSumArrayAfterKNegotiations;

import java.util.Arrays;

public class MaxSumArrayAfterKNegotiations {
    public static void main(String [] args) {
        int [] nums = {4,2,3};
        int k = 1;
        System.out.println("Largest Sum After K Negotiations: " + largestSumAfterKNegations(nums, k) + "\n");

        int [] nums1 = {3,-1,0,2};
        int k1 = 3;
        System.out.println("Largest Sum After K Negotiations: " + largestSumAfterKNegations(nums1, k1) + "\n");

        int [] nums2 = {2,-3,-1,5,-4};
        int k2 = 2;
        System.out.println("Largest Sum After K Negotiations: " + largestSumAfterKNegations(nums2, k2) + "\n");
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int max = 0;

        // Sort the Array & Find the base Sum
        Arrays.sort(nums);
        for (int i : nums) max += i;
        System.out.println("Max: " + max );

        printArray(nums);



        for (;k > 0; k--) {
            nums[0] = -1 * nums[0];
            Arrays.sort(nums);
            printArray(nums);
        }


        return max;
    }

    private static void printArray(int[] nums) {
        for (int i : nums)
            System.out.print(i + ",");
        System.out.println();
    }
}
