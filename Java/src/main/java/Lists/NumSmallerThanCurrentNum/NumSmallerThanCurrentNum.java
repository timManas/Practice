package Lists.NumSmallerThanCurrentNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumSmallerThanCurrentNum {
    public static void main(String [] args) {
        int [] nums = {8,1,2,2,3};

        int [] result = smallerNumbersThanCurrent(nums);
        for (int i : result)
            System.out.println(i);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] result = new int[nums.length];

        // Sort nums and store in Array
        int [] copy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);

        // Use Arraylist for the indexOf property
        List<Integer> list = new ArrayList<Integer>();
        for (int i : copy)
            list.add(i);

        // For every value in the orignal nums
        // Fetch the index on the sorted list and place them in result array
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            result[i] = list.indexOf(value);
        }

        return result;
    }
}

/**
 Solution:
 1. Sort the array
 2. The sorted array index will determine how many numbers are behind it !

 */
