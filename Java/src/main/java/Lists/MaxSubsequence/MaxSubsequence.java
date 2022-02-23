package Lists.MaxSubsequence;

import java.util.*;

public class MaxSubsequence {
    public static void main(String [] args) {
        int [] nums = {2,1,3,3};
        int k=2;
        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums, k)) + "\n");

        int [] nums1 = {-1,-2,3,4};
        int k1=3;
        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums1, k1)) + "\n");

        int [] nums2 = {3,4,3,3};
        int k2=2;
        System.out.println("MaxSubSequence: " + Arrays.toString(maxSubsequence(nums2, k2)) + "\n");
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int [] output = new int[k];
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        Deque<Integer> queue = new LinkedList<>();
        int total = 0;
        for (int i=0; i < nums.length; i++) {
            if (queue.size() < k) {
                queue.add(nums[i]);
                total += nums[i];
            } else {
                int removed = queue.removeLast();
                total -= removed;
                System.out.println("Removed: " + removed);
                queue.addFirst(nums[i]);
                total += nums[i];
            }

            // Check if total is largest subsequence
            if (total > max) {
                list.clear();
                list.addAll(queue);
            }

            System.out.println("current: " + nums[i] + "    Total: " + total + "    Queue: " + queue);
        }

        // Convert to int array
        for (int i=0; i<list.size(); i++) output[i] = list.get(i);

        return output;
    }
}
