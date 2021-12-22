package Lists.MinDiffBetweenHighLowScore;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MinDiffBetweenHighLowScore {
    public static void main(String [] args) {

        int [] nums2 = {87063,61094,44530,21297,95857,93551,9918};
        int k2 = 6;
        System.out.println("Min Diff: " + minimumDifference(nums2, k2) + "\n");

        int [] nums1 = {9,4,1,7};
        int k1 = 2;
        System.out.println("Min Diff: " + minimumDifference(nums1, k1) + "\n");

        int [] nums = {90};
        int k = 1;
        System.out.println("Min Diff: " + minimumDifference(nums, k) + "\n");




    }

    public static int minimumDifference(int[] nums, int k) {
        // Step0 - If k=1, then just return 0
        if (k == 1)
            return 0;

        // Step1 - Sort nums array in ascending order
        Arrays.sort(nums);
        for (int i=0; i < nums.length; i++)
            System.out.print(nums[i] +",");
        System.out.println();

        // Step2 - Create Deqeue to keep track of high and low
        Deque<Integer> queue = new LinkedList<>();
        int low = 0;
        int high = 0;
        int minDiff = Integer.MAX_VALUE;

        // Step4 - Traverse the nums and populate the queue
        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            if (queue.size() < k){
                queue.addLast(current);
            } else if (queue.size() >= k) {
                // Get rid of the bottom element
                queue.pop();

                // Update Queue
                queue.addLast(current);
            }

            // Check 4b- Check if the queue size == k, then update the minDiff
            if (queue.size() == k) {
                low = queue.getFirst();
                high = current;
                minDiff = minDiff > Math.abs(high - low) ? Math.abs(high - low) : minDiff;
            }
            System.out.println("nums[i]:" + nums[i] + "     queue: " + queue + "");
        }

        return minDiff;
    }
}
