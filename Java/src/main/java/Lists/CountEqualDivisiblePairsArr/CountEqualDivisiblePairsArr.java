package Lists.CountEqualDivisiblePairsArr;

public class CountEqualDivisiblePairsArr {
    public static void main(String [] args) {
        int [] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println("Count Pairs: " + countPairs(nums, k) + "\n");

        int [] nums1 = {1,2,3,4};
        int k1 = 0;
        System.out.println("Count Pairs: " + countPairs(nums1, k1) + "\n");

        int [] nums2 = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        int k2 = 0;
        System.out.println("Count Pairs: " + countPairs(nums2, k2) + "\n");
    }

    public static int countPairs(int[] nums, int k) {
        int count = 0;

        for (int i=0; i < nums.length-1; i++) {
            int current = nums[i];
            for (int j=i+1; j < nums.length; j++) {
                int next = nums[j];

                if (current == next && (i * j)%k == 0) {
                    System.out.println("current: " + current + "    next: " + next);
                    ++count;
                }

            }

        }

        return count;
    }
}
