package Lists.FindAllNumbersMissingInArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersMissingInArray {

    public static void main(String [] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
//        int [] nums = {1,1};
        ArrayList<Integer> list = (ArrayList<Integer>) findDisappearedNumbers(nums);
        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        // Step 1 - Check if the nums is empty. Return empty list
        if (nums.length == 0)
            return list;


        // Step 2 - Traverse nums list
        for (int i=0; i < nums.length; i++) {

            // Step 3 - Get the value which is the original - 1
            // Why ? because we need to get the reference
            // Why do we need the Math.abs ? Because some numbers will be negative  and
            // we want to fetch the original value before it got turned negative
            int val = Math.abs(nums[i]);

            // Step 4 - If positive, we convert to Negative
            // Why val - 1 ? Because we want to get the original index ...rember this new list starts from 1-n
            // Not from 0 - n-1. Hence we need to get the val - 1
            if (nums[val - 1] > 0) {
                nums[val - 1] =  -nums[val - 1];    // Turn negative
            }

        }

        // Step 5 - Traverse same array and if positive, add to list
        for (int i=0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }

        return list;
    }
}

/**
 Notes
 -The basic idea is that we iterate through the input array and
 mark elements as negative using nums[nums[i] -1] = -nums[nums[i]-1].
 In this way all the numbers that we have seen will be marked as negative.
 In the second iteration, if a value is not marked as negative,
 it implies we have never seen that index before, so just add it to the return list.
 */