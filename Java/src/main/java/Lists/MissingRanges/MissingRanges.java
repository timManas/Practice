package Lists.MissingRanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    public static void main(String args []) {
        int [] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;

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

        List<String> missingRanges = findMissingRanges(nums, lower, upper);
        System.out.println("Missing Ranges: " + missingRanges);
    }

    public static List<String> findMissingRanges(int [] nums, int lower, int upper) {
        List<String> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);

        int missingStart = Integer.MIN_VALUE;
        int missingEnd = Integer.MIN_VALUE;

        for (int current=lower; current <= upper; current++) {

            boolean ifExists = list.contains(current);
            if (ifExists) {
                System.out.println("MATCH FOUND: current: " + current + "   Start: " + missingStart + "     End: " + missingEnd);
                if (getStartEnd(missingStart, missingEnd) != null) {
                    output.add(getStartEnd(missingStart, missingEnd));
                }
                missingStart = Integer.MIN_VALUE;
                missingEnd = Integer.MIN_VALUE;
                continue;
            }

            if (missingStart == Integer.MIN_VALUE) {
                missingStart = current;
            } else if (missingEnd == Integer.MIN_VALUE) {
                missingEnd = current;
            } else if (missingEnd != Integer.MIN_VALUE && missingEnd+1 == current) {
                missingEnd = current;
            } else {
                System.out.println("Start: " + missingStart + "     End: " + missingEnd);
                if (getStartEnd(missingStart, missingEnd) != null) {
                    output.add(getStartEnd(missingStart, missingEnd));
                }
                missingStart = Integer.MIN_VALUE;
                missingEnd = Integer.MIN_VALUE;
            }


        }
        System.out.println("Start: " + missingStart + "     End: " + missingEnd);
        if (getStartEnd(missingStart, missingEnd) != null) {
            output.add(getStartEnd(missingStart, missingEnd));
        }

        return output;
    }

    private static String getStartEnd(int missingStart, int missingEnd) {
        if (missingStart == Integer.MIN_VALUE && missingEnd == Integer.MIN_VALUE)
            return null;

        if (missingEnd == Integer.MIN_VALUE)
            return String.valueOf(missingStart);

        return (missingStart + "->" + missingEnd);
    }



}
