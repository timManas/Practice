package Strings.CountElemStrictSmallLarger;

import java.util.Arrays;

public class CountElements {
    public static void main(String [] args) {
        int [][] input = {{11,7,2,15}, {-3,3,3,90}, {-71,-71,93,-71,40}, {-89,39,39,-89,39,39}};
        for (int [] i : input)
            System.out.println("countElements: " + countElements(i) + "\n");
    }

    public static int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        out:
        for (int i=1; i<nums.length-1;i++) {
            int current = nums[i];
            int prev = nums[i-1];
            int next = nums[i+1];

            System.out.println("prev : " + prev + "    current: " + current + "  next: " + next);

            int j=i;
            while (current == prev) {
                if (j <= 0)
                    continue out;

                prev = nums[j-1];
                System.out.println("    prev: " + prev);
                j--;


            }

            j=i;
            while (current == next) {
                if (j >= nums.length-1)
                    continue out;

                next = nums[j+1];
                System.out.println("    next: " + next);
                j++;
            }

            ++count;
        }

        return count;
    }
}
