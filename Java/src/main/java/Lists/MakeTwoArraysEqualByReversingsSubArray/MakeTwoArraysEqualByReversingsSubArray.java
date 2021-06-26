package Lists.MakeTwoArraysEqualByReversingsSubArray;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingsSubArray {
    public static void main (String [] args) {
        int [] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println("CanBe Equal: " + canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {

        // Check lengths
        if (target.length != arr.length)
            return false;

        // Sort both of the arrays
        Arrays.sort(target);
        Arrays.sort(arr);

        // Check both arrays are equal to each other
        for (int i=0; i < target.length; i++) {
            if (target[i] != arr[i])
                return false;
        }

        return true;
    }
}
