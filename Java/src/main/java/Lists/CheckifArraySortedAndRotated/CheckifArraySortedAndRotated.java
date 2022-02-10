package Lists.CheckifArraySortedAndRotated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckifArraySortedAndRotated {

    public static void main(String [] args) {
        //{3,4,5,1,2}, {2,1,3,4}, {1,2,3}, {7,9,1,1,1,3},
        int [][] input = {{1,4,1,2,3,5}};
        for (int [] i : input)
            System.out.println("Check: " + check(i));
    }



    public static boolean check(int[] nums) {

        // Step1 - Create List & Find the smallest element
        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);
        int min = Collections.min(list);
        System.out.println("Min: " + min);

        // Step2 - Traverse starting from the min to the largest
        int index = 0;
        int currentIndex = list.lastIndexOf(min);
        boolean hasHitMin = false;
        while (index < nums.length - 1) {
            int current = nums[currentIndex];
            int next = currentIndex == nums.length - 1 ? nums[0] : nums[currentIndex + 1];
            System.out.println("Current: " + current + "    next: " + next);

            // Check if we already hit the minimum
            // If true, The remaining elements needs to the minimum as well...
            // Otherwise, it is NOT ordered
            if (hasHitMin) {
                if (next != min) {
                    return false;
                }
            }

            // Step3 - Check if the current is smaller the next.
            if (current > next) {
                if (next == min) {
                    hasHitMin = true;
                } else {
                    return false;
                }
            }


            // Steo4 - Update Counters
            currentIndex = currentIndex == nums.length -1 ? 0 : currentIndex + 1;
            ++index;
        }

        return true;
    }
}
