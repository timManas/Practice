package Lists.MaximumAvgSubArrayI;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumAvgSubArrayI {
    public static void main(String [] args) {
//        int [] nums = {1,12,-5,-6,50,3};
//        int k = 4;
//        System.out.println("FinxMax Avg: " + findMaxAverage(nums, k) + "\n");

//        int [] nums1 = {-1};
//        int k1 = 1;
//        System.out.println("FinxMax Avg: " + findMaxAverage(nums1, k1)+ "\n");

        int [] nums2 = {-6662,5432,-8558,-8935,8731,-3083,4115,9931,-4006,-3284,-3024,1714,-2825,-2374,-2750,-959,6516,9356,8040,-2169,-9490,-3068,6299,7823,-9767,5751,-7897,6680,-1293,-3486,-6785,6337,-9158,-4183,6240,-2846,-2588,-5458,-9576,-1501,-908,-5477,7596,-8863,-4088,7922,8231,-4928,7636,-3994,-243,-1327,8425,-3468,-4218,-364,4257,5690,1035,6217,8880,4127,-6299,-1831,2854,-4498,-6983,-677,2216,-1938,3348,4099,3591,9076,942,4571,-4200,7271,-6920,-1886,662,7844,3658,-6562,-2106,-296,-3280,8909,-8352,-9413,3513,1352,-8825};
        int k2 = 90;
        System.out.println("FinxMax Avg: " + findMaxAverage(nums2, k2) + "\n");
    }

    public static double findMaxAverage(int[] nums, int k) {

        // Step1 - Set Max as the lowest possible negative value.
        // Note we use Integer.Min_VALUE instead of DOUBLE.MIN_VALUE is because Double is NOT a negative value
        double max = Integer.MIN_VALUE;
        Deque<Integer> queue = new LinkedList<>();
        double total = 0;

        // Step2 - Traverse the nums array, one by one
        for (int num : nums) {

            // Step3 - If queue size is equal greater than k, we remove the first one
            if (queue.size() >= k) {
                int removed = queue.removeFirst();
                System.out.println("Removing: " + removed);
                total -= removed;
            }

            // Step4 - Add a new items to the queue
            queue.addLast(num);
            total += num;

            // Step5 - Calculate max only when queue size is k
            if (queue.size() == k)
                max = max < (total/k) ? (total/k) : max;

            System.out.println("Queue: " + queue);
        }
        System.out.println("Max: " + max);

        return max;
    }
}
