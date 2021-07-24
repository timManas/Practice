package Lists.CheckIfAll1sAreKlength;

public class CheckIfAll1sAreKlength {
    public static void main(String [] args) {
       int [] nums = {1,0,0,0,1,0,0,1};
       int k = 2;
       System.out.println("KLengthApart: " + kLengthApart(nums, k));

        int [] nums2 = {1,0,0,1,0,1};
        int k2 = 2;
        System.out.println("KLengthApart: " + kLengthApart(nums2, k2));

        int [] nums3 = {1,1,1,1,1};
        int k3 = 0;
        System.out.println("KLengthApart: " + kLengthApart(nums3, k3));

        int [] nums4 = {0,1,0,1};
        int k4 = 1;
        System.out.println("KLengthApart: " + kLengthApart(nums4, k4));

        int [] nums5 = {1,1,0,1};
        int k5 = 1;
        System.out.println("KLengthApart: " + kLengthApart(nums5, k5));
    }

    public static boolean kLengthApart(int[] nums, int k) {

        // Step1 - Create counter to store number of 0's between 1's
        boolean isOneFound = false;
        int counter = 0;

        // Step2 - Traverse digit by digit
        for (int i=0; i<nums.length;i++) {
            int digit = nums[i];

            // Step3 - Check if equal to one
            if (digit == 1) {

                if (isOneFound && counter < k)      // Check if the counter is greater than k, return false otehrwise
                    return false;

                // Step3b - Reset counters
                counter = 0;
                isOneFound = true;

            } else {

                // Step4 - Increase counter
                if (isOneFound) {
                    counter++;
                }

            }
        }

        return true;
    }
}
