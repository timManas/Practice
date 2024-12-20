package Misc.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String [] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println("Merged:" + Arrays.toString(merge(intervals)) + "\n");

        int [][] intervals1 = {{1,4},{4,5}};
        System.out.println("Merged:" + Arrays.toString(merge(intervals1)) + "\n");
    }

    public static int[][] merge(int[][] intervals) {
        List<int []> output = new ArrayList<>();

        int[] current;
        int [] prev;
        for (int i=1; i<intervals.length; i++) {
            current = intervals[i];
            prev = intervals[i-1];
            System.out.println("Prev: " + Arrays.toString(prev) + " | Current: " + Arrays.toString(current));

            boolean isOverlap = false;
            if (prev[0] <= current[0] && current[0] <= prev[1]) {
                isOverlap = true;
            }

            if (current[0] <= prev[1] && prev[1] <= current[1]) {
                isOverlap = true;
            }

            // No OverLap with Continue
            if (!isOverlap) {
                output.add(current);
                continue;
            }


            int [] newInterval = {Math.min(prev[0], current[0]), Math.max(prev[1], current[1])};
            output.add(newInterval);
            System.out.println("    Overlapped: " + Arrays.toString(newInterval));
        }

        // Conver to int[][]
        int [][] result = new int[output.size()][];
        for (int i=0; i<output.size(); i++)
            result[i] = output.get(i);

        return result;
    }
}
