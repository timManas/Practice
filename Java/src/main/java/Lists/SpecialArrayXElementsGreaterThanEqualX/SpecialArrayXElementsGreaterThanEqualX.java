package Lists.SpecialArrayXElementsGreaterThanEqualX;

import java.util.Arrays;

public class SpecialArrayXElementsGreaterThanEqualX {

    public static void main(String [] args) {
//        int [][] input = {{3,5}, {0,0}, {0,0,3,4,4}, {3,6,7,7,0}};
//        for (int [] nums : input) {
//            System.out.println("Special Array: " + specialArray(nums));
//        }

        System.out.println("Special Array: " + specialArray(new int[]{3, 6, 7, 7, 0}));
    }

    public static int specialArray(int[] nums) {
        int x = nums.length;

        // Sort the array for easier parsing
        Arrays.sort(nums);

        while (x > 0) {
            if (x <= nums[nums.length - x]) {
                return x;
            }

            x--;
        }


        return -1;
    }

}
