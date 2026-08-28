package Lists.FindMissingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {

    public static void main(String [] args) {
        int [][] input = {{1,4,2,5}, {7,8,6,9}, {5,1}};
        for (int [] row : input) {
            System.out.println("Find Missing Elements: " + findMissingElements(row) + "\n");
        }
    }

    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> output = new ArrayList<>();

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        int current = min + 1;
        while (current < max) {
            if (Arrays.binarySearch(nums, current) < 0) {
                output.add(current);
            }

            ++current;
        }


        return output;
    }


}
