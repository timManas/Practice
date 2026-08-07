package Lists.FindGreatestCommonDivisorArray;

import java.util.Arrays;

public class FindGreatestCommonDivisorArray {

    public static void main(String [] args) {
        int [][] input = {{2,5,6,9,10}, {7,5,6,8,3}, {3,3}, {6,7,9}};
        for (int [] i : input) {
            System.out.println("GCD: " + findGCD(i) + "\n");
        }
    }

    public static int findGCD(int[] nums) {
        System.out.println("nums: " + Arrays.toString(nums));

        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];

        int gcd = 0;
        int remainder;
        while (true) {
            System.out.println("largest: " + largest + "    smallest: " + smallest);
            remainder = largest % smallest;
            if (remainder == 0) {
                gcd = smallest;
                break;
            }

            largest = smallest;
            smallest = remainder;

        }

        return gcd;
    }
}
