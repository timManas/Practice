package Lists.CheckIfArrConsecutive;

import java.util.Arrays;

public class CheckIfArrConsecutive {
    public static void main(String [] args) {
        int [] nums = {1,3,4,2};
        System.out.println("isConsecutive: " + isConsecutive(nums) + "\n");

        int [] nums1 = {1,3};
        System.out.println("isConsecutive: " + isConsecutive(nums1) + "\n");

        int [] nums2 = {3,5,4};
        System.out.println("isConsecutive: " + isConsecutive(nums2) + "\n");

        int [] nums3 = {3,2};
        System.out.println("isConsecutive: " + isConsecutive(nums3) + "\n");
    }

    public static boolean isConsecutive(int[] nums) {

        if (nums.length == 0) return false;

        // Sort Array
        Arrays.sort(nums);

        // Find range
        int x = nums[0];
        int y = x + nums.length - 1;
        System.out.println("x: " + x +" | y: " + y);

        // Check if all values are present
        int i = 0;
        while (i < nums.length) {
            if (x != nums[i]) return false;

            x++;
            i++;
        }

        return true;
    }
}
