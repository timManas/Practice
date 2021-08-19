package Misc.LargestPerimeterTriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String [] args) {
        int [][] input = {{2,1,2}, {1,2,1}, {3,2,3,4}, {3,6,2,3} };
        for (int[] i : input)
            System.out.println("\nLargest Perimeter: " + largestPerimeter(i));
    }

    public static int largestPerimeter(int[] nums) {
        // Step1 - Sort the input array
        Arrays.sort(nums);

        // Step2 - Traverse backwards to find the largest perimeter
        for (int i=(nums.length) - 3; i >= 0; i--) {
            System.out.println("Current: " + nums[i]);
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            // Step3 - Check if triangle possible
            // If so, return perimeter
            // Why does this work ? Because when we sort, we get the largest values
            if ((a + b > c) && (a+c>b) && (b+c>a))
                return (a+b+c);
        }

        return 0;
    }
}
