package Lists.KeepMultiFoundValuesByTwo;

import java.util.Arrays;

public class KeepMultiFoundValuesByTwo {

    public static void main(String [] args) {
        int [] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println("find Find Value: " + findFinalValue(nums, original));

        int [] nums1 = {2,7,9};
        int original1 = 4;
        System.out.println("find Find Value: " + findFinalValue(nums1, original1));

    }

    public static int findFinalValue(int[] nums, int original) {
        int val = original;
        Arrays.sort(nums);

        while (true) {
            int i = Arrays.binarySearch(nums, val);
            if (i < 0)
                break;

            int current = nums[i];
            System.out.println("i: " + i + "    current: " + current);


            val = current * 2;
        }

        return val;
    }
}
