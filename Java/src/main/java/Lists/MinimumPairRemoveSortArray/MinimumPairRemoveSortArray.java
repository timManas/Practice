package Lists.MinimumPairRemoveSortArray;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemoveSortArray {
    public static void main(String [] args) {
        int [][] input = {{5,2,3,1}, {1,2,2}};
        for (int [] arr : input)
            System.out.println("min pair removal: " + minimumPairRemoval(arr) + "\n");
    }

    public static int minimumPairRemoval(int[] nums) {
        int min = 0;

        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);
        while (!isSorted(nums)) {

        }


        return min;
    }

    private static boolean isSorted(int[] nums) {

        for (int i=0; i<nums.length-1;i++) {
            if (nums[i] <= nums[i+1])
                return false;
        }

        return true;
    }
}
