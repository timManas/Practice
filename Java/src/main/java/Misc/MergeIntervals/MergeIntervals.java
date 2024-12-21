package Misc.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String [] args) {

        int [][] intervals2 = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        System.out.println("Merged:" + Arrays.toString(merge(intervals2)) + "\n");

        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println("Merged:" + Arrays.toString(merge(intervals)) + "\n");

        int [][] intervals1 = {{1,4},{4,5}};
        System.out.println("Merged:" + Arrays.toString(merge(intervals1)) + "\n");
    }

    public static int[][] merge(int[][] intervals) {
        // Step 1 - Sort Array by first
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step2 - Create Stack
        Stack<int []> stack = new Stack<>();
        stack.push(intervals[0]);

        // Step3 - Travere Intervals
        for (int i=1; i<intervals.length; i++) {
            int [] current = intervals[i];
            int [] prev = stack.pop();
            System.out.println("Prev: " + Arrays.toString(prev) + " | Current: " + Arrays.toString(current));

            // If No OverLap with Continue
            if (!isOverlap(prev, current)) {
                stack.push(prev);
                stack.push(current);
                continue;
            }

            // Create New Interval and put it in Stack
            int [] newInterval = {Math.min(prev[0], current[0]), Math.max(prev[1], current[1])};
            stack.push(newInterval);
            System.out.println("    Overlapped: " + Arrays.toString(newInterval));
        }

        // Step4 - Convert to int[][]
        int [][] result = new int[stack.size()][];
        for (int i=0; stack.size() > 0; i++) {
            result[i] = stack.pop();
            System.out.println(Arrays.toString(result[i]));
        }

        return result;
    }

    private static boolean isOverlap(int[] prev, int[] current) {

        if (prev[0] <= current[0] && current[0] <= prev[1]) {
            return true;
        }
        if (current[0] <= prev[1] && prev[1] <= current[1]) {
            return true;
        }
        if (prev[0] <= current[1] && current[1] <= prev[1]) {
            return true;
        }
        if (current[0] <= prev[0] && prev[0] <= current[1]) {
            return true;
        }

        return false;
    }
}
