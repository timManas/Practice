package Lists.MissingRanges;

import java.util.*;

public class MissingRanges {
    public static void main(String args []) {
//        int [] nums = {0,1,3,50,75};
//        int lower = 0;
//        int upper = 99;

//        int [] nums = {};
//        int lower = 1;
//        int upper = 1;

//        int [] nums = {};
//        int lower = -3;
//        int upper = -1;

//        int [] nums = {-1};
//        int lower = -1;
//        int upper = -1;

//        int [] nums = {-1};
//        int lower = -2;
//        int upper = -1;

        int [] nums = {1,3};
        int lower = 0;
        int upper = 9;

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + missingRanges);
    }

    private static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> output = new ArrayList<>();
        int start;
        int end;

        // Step1 - Check if Array is Empty
        if (nums.length == 0) {
            if (lower == upper)
                output.add(String.valueOf(lower));
            else
                output.add(lower + "->" + upper );
        }

        // Step2 - Traverse through the nums array
        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            // If 1st Elemennt
            if (i == 0) {
                start = lower;
                end = current - 1;

                if (isWithinLimits(start, end, lower, upper)) {
                    if (start == end)
                        output.add(String.valueOf(start));
                    else
                        output.add(start + "->" + end );
                }

            }

            // If Last Element
            if (i == nums.length - 1) {
                start = current + 1;
                end = upper;

                if (isWithinLimits(start, end, lower, upper)) {
                    if (start == end)
                        output.add(String.valueOf(start));
                    else
                        output.add(start + "->" + end );
                }
            }
            // Check BETWEEN TWO ELEMENTS
            else {
                start = current + 1;
                end = nums[i + 1] - 1;

                if (isWithinLimits(start, end, lower, upper)) {
                    if (start == end)
                        output.add(String.valueOf(start));
                    else
                        output.add(start + "->" + end );
                }
            }
        }

        return output;
    }

    private static boolean isWithinLimits(int start, int end, int lower, int upper) {
        if ((lower <= start && start <= upper) &&
                (lower <= end && end <= upper) &&
                (start <= end)) {
            return true;
        }

        return false;
    }
}

/**
 Notes:
 - Not an easy problem for sureeeee ...took me 1.5 days

 Solution:
 1. Check if arr length == 0:
 - return the output list with the lower and upper limits

 2. Check if arr length > 1
 - Traverse through the array
 - For each element:
    > Check the start & end
    > For element 0: We check
        a. Between the start and (1st element - 1)
        b. Between the 1st and next element

    > For Element in between:
         a. Between the current element + 1 and next element - 1;

    > For the last element:
        a. Between the last element + 1  and  upper


 */