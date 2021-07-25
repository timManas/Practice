package Lists.TwoSumLessThanK;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

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
        int sum = 0;
        Set<Integer> set = new TreeSet<>();

        // Sort the arrays
        Arrays.sort(nums);

        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            if (current >= k)
                break;
            


        }


        return sum;
    }
}
