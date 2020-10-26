package Math.MaximumProd3Numbers;

import java.math.BigInteger;
import java.util.*;

public class MaximumProduct3Nums {

    public static void main(String [] args) {
        int [] nums = {-1,-2,1,2,3};
//        int [] nums = {1,2,3};
//        int [] nums = {-1,-2,-3};
//        int [] nums = {1,0,100};
        System.out.println("MaxProduct: " + maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {

        int max = 1;

        // Step1 - Sort Array
        Arrays.sort(nums);

        // Step2 - Just add all values if nums size is 3 or less
        if (nums.length <= 3) {
            for (int num : nums)
                max *= num;
            return max;
        }

        // Step3 - Calculate the product of left and right
        int leftProd = nums[0] * nums[1] * nums[nums.length - 1];
        int rightProd = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        return Math.max(leftProd, rightProd);
    }


}

/**
 Notes
 - NOT EASY AT ALLL .... Still couldnt figure it out
 - The values to calculate we very specific.
 > To find the smallest you need  to find the:
    2 Smallest Num & 3 Largest Num      ... why 2 ? Because they add up to be positive

 Solution
 1. Sort the array
 2. Return the Bigger of the two:
    nums[0] * nums[1] * nums[nums.length - 1]   vs. nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];


 TIP:
 - I did figure out how to calculate the Max Prod of 4,5,6, ...etc nums
 Ex: Find max of 4 Nums
 - Find the larger of:
 nums[0] * nums[1] * nums[n-1] * nums[n-2]      Vs.  nums[n-1] * nums[n-1] * nums[n-3] * nums[n-4]

 */