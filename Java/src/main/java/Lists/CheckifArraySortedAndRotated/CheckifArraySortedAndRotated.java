package Lists.CheckifArraySortedAndRotated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckifArraySortedAndRotated {

    public static void main(String [] args) {
        int [][] input = {{3,4,5,1,2}, {2,1,3,4}, {1,2,3}, {7,9,1,1,1,3}};
        for (int [] i : input)
            System.out.println("Check: " + check(i));
    }



    public static boolean check(int[] nums) {

        // Find the smallest element
        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);
        int min = Collections.min(list);
        System.out.println("Min: " + min);

        int index = 0;
        int currentIndex = list.lastIndexOf(min);
        while (index < nums.length - 1) {
            int current = nums[currentIndex];
            int next = currentIndex == nums.length - 1 ? nums[0] : nums[currentIndex + 1];
            System.out.println("Current: " + current + "    next: " + next);

            if (current > next && next != min) {
                return false;
            }


            // Update Counters
            currentIndex = currentIndex == nums.length -1 ? 0 : currentIndex + 1;
            ++index;
        }

        return true;
    }
}
