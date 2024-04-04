package Lists.RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public static void main (String [] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        System.out.println("Remove Element: " + removeElement(nums, val) + "\n");

        int [] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;
        System.out.println("Remove Element: " + removeElement(nums1, val1) + "\n");

        int [] nums2 = {2};
        int val2 = 3;
        System.out.println("Remove Element: " + removeElement(nums2, val2) + "\n");

        int [] nums3 = {3,3};
        int val3 = 3;
        System.out.println("Remove Element: " + removeElement(nums3, val3) + "\n");

        int [] nums4 = {3,3};
        int val4 = 5;
        System.out.println("Remove Element: " + removeElement(nums4, val4) + "\n");
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        int end = nums.length-1;

        out:
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            System.out.println("current: " + current + "    end: " + nums[end]);

            if (current != val) {
                count++;
                continue;
            }

            if (i == end)
                break;


            // Is Equal to Val
            while (nums[end] == val) {
                end--;
                if (i == end)
                    break out;
            }

            // switch
            nums[i] = nums[end];
            nums[end] = val;
            count++;
            System.out.println("    nums: " + Arrays.toString(nums));


        }


        return count;
    }
}
