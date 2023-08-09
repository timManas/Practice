package Lists.FindClosetNumToZero;

public class FindClosetNumToZero {
    public static void main(String [] args) {
        int [] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums) + "\n");

        int [] nums1 = {2,-1,1};
        System.out.println(findClosestNumber(nums1) + "\n");
    }

    public static int findClosestNumber(int[] nums) {
        int closetNum = Integer.MIN_VALUE;
        int smallestDiff = Integer.MAX_VALUE;

        // Step1 - Travese each element
        for (int i=0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println("num: " + num);

            // Step2 - Find the Absolute diff. Should be positive
            int diff = Math.abs(num) - 0;
            if (smallestDiff > diff) {
                smallestDiff = diff;
                closetNum = num;
            } else if (smallestDiff == diff) {
                closetNum = closetNum < num ? num : closetNum;      // Pick only the larger value of the diffs are the same
            }

            System.out.println("closetNum: " + closetNum + "       smallestDiff: " + smallestDiff);

        }

        return closetNum;
    }
}
