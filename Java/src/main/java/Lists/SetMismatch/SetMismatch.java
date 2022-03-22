package Lists.SetMismatch;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetMismatch {
    public static void main(String [] args) {
        int [] nums = {1,2,2,4};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums)) + "\n");

        int [] nums1 = {1,1};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums1))+ "\n");

        int [] nums2 = {2,2};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums2))+ "\n");

        int [] nums3 = {3,2,3,4,6,5};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums3))+ "\n");

        int [] nums4 = {1,5,3,2,2,7,6,4,8,9};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums4))+ "\n");
    }

    public static int[] findErrorNums(int[] nums) {

        // Step1 - Sort the input array
        Arrays.sort(nums);
        System.out.println("input: " + Arrays.toString(nums));

        // Step2 - Create output array
        int [] output = new int [2];

        // Step3 - Create Set to store all found characters
        Set<Integer> set = new TreeSet<>();
        int count = 1;
        int missing = -1;
        int repeating = -1;
        boolean hasFoundRepeating = false;

        // Step4 - Find the repeating number
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];

            if (set.contains(current)) {
                repeating = current;
            }

            set.add(current);
            count++;
        }

        // Step5 - Find the missing number
        count = 1;
        while (count <= nums.length) {
            if (!set.contains(count)) {
                missing = count;
            }
            count++;
        }

        // Step6 - Build the array
        output[0] = repeating;
        output[1] = missing;



        return output;
    }
}
