package Lists.FindTargetIndicesAfterSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSort {
    public static void main(String [] args) {
        int [] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println("targetIndices: " + targetIndices(nums, target) + "\n");

        int [] nums2 = {1,2,5,2,3};
        int target2 = 3;
        System.out.println("targetIndices: " + targetIndices(nums2, target2) + "\n");

        int [] nums3 = {1,2,5,2,3};
        int target3 = 5;
        System.out.println("targetIndices: " + targetIndices(nums3, target3) + "\n");
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();

        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target)
                output.add(i);
        }

        return output;
    }
}
