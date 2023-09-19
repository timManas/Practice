package Lists.MinRightShiftToSoryArray;

import java.util.ArrayList;
import java.util.List;

public class MinRightShiftToSoryArray {
    public static void main(String [] args) {
        int [][] input = {{3,4,5,1,2}, {1,3,5}, {2,1,4}};
        for (int [] arr : input) {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) list.add(i);
            System.out.println("minShift: " + minimumRightShifts(list) + "\n");
        }
    }

    public static int minimumRightShifts(List<Integer> nums) {
        if (nums.size() <= 1) return 0; // Default case

        int count = 0;
        boolean hasShift = false;

        // Step1 - Travers list from left to right
        for (int i=0; i<nums.size()-1; i++) {
            int current = nums.get(i);
            int next = nums.get(i+1);
            System.out.println("current: " + current + "    next: " + next);

            // Step2- Find out if ascending
            if (current < next) {

                if (hasShift)
                    count++;

            } else {
                hasShift = true;

                // Step3 - Check if count is big. Otherwise we return 0 since we already shifted
                if (count != 0)
                    return -1;
            }
        }

        // Check if all elements are ascending
        if (!hasShift) return 0;

        // Check last two elements
        if (nums.get(0) < nums.get(nums.size()-1))
            return -1;
        count++;

        return count;
    }
}
