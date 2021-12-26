package Misc.RangeSumQueryImmutable;

public class RangeSumQueryImmutable {
    public static void main(String [] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
        System.out.println(numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
        System.out.println(numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
    }


    static class NumArray {
        // Step1 - Create private nums array to store values
        int [] nums;

        // Step2 - Initialize NumArray
        public NumArray(int[] nums) {
            this.nums = nums;
        }

        // Step3 - Calculate range
        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i=left; i <= right; i++) {
                sum += nums[i];
            }

            return sum;
        }
    }


}


