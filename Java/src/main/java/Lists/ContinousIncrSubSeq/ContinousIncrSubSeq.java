package Lists.ContinousIncrSubSeq;

public class ContinousIncrSubSeq {
    public static void main(String [] args) {
        int [][] input =  {{1,3,5,4,7}, {2,2,2,2,2}};
        for (int [] i : input)
            System.out.println("Find Length of LCIS: " + findLengthOfLCIS(i) + "\n");
    }

    public static int findLengthOfLCIS(int[] nums) {

        // Step1 - Create indexes to track the longest subsequence, start & end index
        int longest = 0;
        int start = 0;
        int end = 0;

        // Step2 - Traverse nums
        for (int i=0; i < nums.length; i++) {
            int current = nums[i];
            int next = i == nums.length - 1 ? nums[i] : nums[i + 1];
            System.out.println("current: " + current + "    next: " + next);

            // Check if the next is strictly larger..increment end if true
            // Otherwise, we reset indexes
            if (current < next) {
                ++end;
            } else {
                longest = Math.abs((end - start) + 1) > longest ? Math.abs((end - start) + 1) : longest;
                start = i;
                end = i;
            }
        }

        return longest;
    }
}
