package Lists.PartitionArrayAccordingPivot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArrayAccordingPivot {
    public static void main(String [] args) {
        int [] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println("Pivot Array: " + Arrays.toString(pivotArray(nums, pivot)));

        int [] nums1 = {-3,4,3,2};
        int pivot1 = 2;
        System.out.println("Pivot Array: " + Arrays.toString(pivotArray(nums1, pivot1)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        // Step1 - Create output array
        int[] output = new int[nums.length];

        // Step2 - Create List to store smaller, larger, equal numbers
        List<Integer> smallerList = new ArrayList<>();
        int count = 0;
        List<Integer> largerList = new ArrayList<>();

        // Step3 - Populate list
        for (int i : nums) {
            if (i == pivot)
                count++;
            else if (i < pivot)
                smallerList.add(i);
            else
                largerList.add(i);
        }

        // Create OutputList
        // Step4 - Add Smaller List
        int index = 0;
        for (int i : smallerList) {
            output[index++] = i;
        }

        // Step5 - Add pivot
        while (count > 0) {
            output[index++] = pivot;
            count--;
        }

        // Step6 - Add Larger List
        for (int i : largerList) {
            output[index++] = i;
        }

        return output;
    }
}
