package Lists.MinOperationsMakeArrayIncreasing;

public class MinOperationsMakeArrayIncreasing {

    public static void main(String [] args) {
        int [] nums1 = {1,1,1};
        int [] nums2 = {1,5,2,4,1};
        int [] nums3 = {8};

        System.out.println("Min Operations: " + minOperations(nums1));
        System.out.println("Min Operations: " + minOperations(nums2));
        System.out.println("Min Operations: " + minOperations(nums3));
    }

    public static int minOperations(int[] nums) {

        // Step1 - Check if legnth is bigger than 1
        if (nums.length == 1)
            return 0;

        // Step2- Traverse input array
        int count = 0;
        for (int i=1; i < nums.length; i++) {
            int current = nums[i];
            int prev = nums[i-1];

            // Step3 - Continue if Current is bigger than previous ...aka Increasing order is good
            if (prev < current) {
                continue;
            }

            // Currently Prev > Current
            // Step4- Calculate newCurrent - C
            int newCurrent = nums[i-1] + 1;

            // Step5 - Increment the count
            count += (newCurrent - current);

            // Step6 - Set current to the newCurrent (For increasing order)
            nums[i] = newCurrent;
        }

        return count;
    }
}
