package Lists.MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String args []) {
        int [] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + missingRanges);
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> output = new ArrayList<>();

        int missingStart = -1;
        int missingEnd = -1;
        for (int current=lower; current <= upper; current++) {
            int indexInNums = findElementExists(nums, current, 0, nums.length - 1);
            if (indexInNums != -1) {
                System.out.println("MATCH FOUND: current: " + current);
                continue;
            }

            if (missingStart == -1) {
                missingStart = current;
            } else if (missingEnd == -1) {
                missingEnd = current;
            } else if (missingEnd != -1 && missingEnd+1 == current) {
                missingEnd = current;
            } else {
                System.out.println("Start: " + missingStart + "     End: " + missingEnd);
                missingStart = -1;
                missingEnd = -1;
            }


        }

        return output;
    }

    public static int findElementExists(int [] nums, int element, int startIndex, int endIndex) {

        int middle = (startIndex + endIndex) / 2;

        if (startIndex > endIndex)
            return -1;

        if (element == nums[middle]) {
            return middle;
        } else if (element < nums[middle]) {
            return findElementExists(nums, element, startIndex, middle - 1);
        } else if (element > nums[middle]) {
            return findElementExists(nums, element, middle + 1,  endIndex);
        }

        return  -1;
    }

}
