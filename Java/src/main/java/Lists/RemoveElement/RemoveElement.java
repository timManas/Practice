package Lists.RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public static void main (String [] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        System.out.println("Remove Element: " + removeElement(nums, val));

        int [] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;
        System.out.println("Remove Element: " + removeElement(nums1, val1));

        int [] nums2 = {2};
        int val2 = 3;
        System.out.println("Remove Element: " + removeElement(nums2, val2));

        int [] nums3 = {3,3};
        int val3 = 3;
        System.out.println("Remove Element: " + removeElement(nums3, val3));
    }

    public static int removeElement(int[] nums, int val) {

        if (nums.length == 1) {
           if (nums[0] == val) return 0;

           return 1;
        }
        int start=0;
        int end=nums.length-1;

       while (start < end) {
            System.out.println("val: " + nums[start]) ;
            if (nums[start] == val) {
                while(nums[end] == val) {
                    end--;
                    if (start >= end) {
                        return start;
                    }
                }
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            System.out.println("    nums: " + Arrays.toString(nums));

            start++;

        }

        return start;
    }
}
