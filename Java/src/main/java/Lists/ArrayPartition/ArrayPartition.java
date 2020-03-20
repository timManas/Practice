package Lists.ArrayPartition;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String [] args) {
        int [] nums = {1,4,3,2};

        System.out.println("PairSum: " + arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {

        int total = 0;

        // Step1 - Sort Nums List
        Arrays.sort(nums);

        // Step2 - Traverse nums list and add
        for (int i=0; i < nums.length; i+=2) {
            int firstNum = nums[i];
            int secondNum = nums[i+1];
            total += Math.min(firstNum, secondNum);
        }

        return total;
    }

}
