package Lists.SetMismatch;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String [] args) {
        int [] nums = {1,2,2,4};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums)));

        int [] nums1 = {1,1};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums1)));

        int [] nums2 = {2,2};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums2)));
    }

    public static int[] findErrorNums(int[] nums) {
        int [] output = new int [2];

        int prev = 0;
        for (int i=0; i<nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i+1];

            if (current == next) {
                output[0] = current;
                if (prev + 1 == current) {
                    output[1] = current + 1;;
                } else {
                    output[1] = prev + 1;
                }
                return output;
            }

            prev = current;
        }



        return output;
    }
}
