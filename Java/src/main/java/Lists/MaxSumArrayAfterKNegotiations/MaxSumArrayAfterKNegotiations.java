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

        // Step1 - Sort the Array & Find the base Sum
        Arrays.sort(nums);
        for (int i : nums) max += i;
        System.out.println("Max: " + max );
        printArray(nums);

        // Step2 - Change only the lowestElement
        for (;k > 0; k--) {
            int current = nums[0];
            int newElement = -1 * nums[0];

            // Step3 - Modify the max and lowestElement by -1
            max -= current;
            max += newElement;
            nums[0] = newElement;

            // Step4 - Sort out array again
            Arrays.sort(nums);
            printArray(nums);
            System.out.println("New Max: " + max);
        }

        return max;
    }

    private static void printArray(int[] nums) {
        for (int i : nums)
            System.out.print(i + ",");
        System.out.println();
    }
}
