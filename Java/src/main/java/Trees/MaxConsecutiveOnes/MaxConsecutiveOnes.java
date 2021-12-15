package Trees.MaxConsecutiveOnes;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxConsecutiveOnes {
    public static void main(String [] args) {
        int [][] input = {{1,1,0,1,1,1}, {1,0,1,1,0,1}, {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}};
        for (int [] i : input)
            System.out.println("Find Max Consecutive Ones: " + findMaxConsecutiveOnes(i) + "\n");
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        // Step1 - Create variable for maxLength and currentLength
        int maxLength = 0;
        int currentLength = 0;
        int prev = -1;

        // Step2 - Traverse array front to back
        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            // Step3 - Check if 1 or 0
            if (nums[i] == 1) {

                // Check if prev and current are both 1's
                if (prev == current) {
                    ++currentLength;
                } else {
                    currentLength = 1;
                }
            } else {
                // Reset counters
                maxLength =  maxLength < currentLength ? currentLength : maxLength;
                currentLength = 0;
            }

            prev = current;
        }

        maxLength =  maxLength < currentLength ? currentLength : maxLength;


        return maxLength;
    }

}
