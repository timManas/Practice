package Lists.SummaryRange;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String [] args) {
        int [][] input = {{0,1,2,4,5,7}, {0,2,3,4,6,8,9}};
        for (int [] i : input)
            System.out.println("Summary Range: " + summaryRanges(i) + "\n");
    }

    public static List<String> summaryRanges(int[] nums) {
        // Step1 - Create output varaible
        List<String> output = new ArrayList<>();

        // Step2 - Check if nums is not empty
        if (nums.length == 0)
            return output;

        // Step3 - Traverse the input array one by one
        // Compare the  hypothetical 'next' with the current value
        // If different, we reset the start & end indexes. Otherwise, we increment the end index
        int start = 0;
        int end = 0;
        for (int i=1; i<nums.length; i++) {
            int prev = nums[i-1];
            int hypothetical_next = prev + 1;
            int current = nums[i];

            // Step4 - Check if the hypothetical_next is same as current
            System.out.println("prev: " + prev + "      hypothetical_next: " + hypothetical_next +  "      current: " + current);
            if (hypothetical_next == current) {
                end = i;
            } else {

                addToList(output, nums, start, end);

                // Step4b - Reset counters
                start = i;
                end = i;
            }
        }
        // Dont forget to add the last section
        addToList(output,nums, start, end);

        return output;
    }

    private static void addToList(List<String> output, int[] nums, int start, int end) {
        System.out.println("X --- start: " + nums[start] + "  end: " + nums[end]);
        if (start == end) {
            output.add(String.valueOf(nums[start]));
        } else {
            output.add(nums[start] + "->" + nums[end]);
        }
    }
}
