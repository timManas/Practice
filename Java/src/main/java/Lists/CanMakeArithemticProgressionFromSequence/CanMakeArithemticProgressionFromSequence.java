package Lists.CanMakeArithemticProgressionFromSequence;

import java.util.Arrays;

public class CanMakeArithemticProgressionFromSequence {
    public static void main (String [] args) {
        int [][] input = {{3,5,1}, {1,2,4}};
        for (int [] arr : input)
            System.out.println("Can make Aritmethic Progression: " + canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {

        // Step1 - Sort the array
        Arrays.sort(arr);

        // Step2 - Find the diff
        int diff = arr[1] - arr[0];

        // Step3 - Go through Array
        // Return false if the diff doesent match arr[i] - arr[i-1]
        for (int i=1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != diff)
                return false;
            diff = arr[i] - arr[i-1];   // Update diff
        }

        return true;
    }
}

/**
 Notes
 - My solution =)
 - Easy but needs some thinking

 Soltuion
 1. Sort input array
 2. Find the diff
 3. Traverse the array and compare current and current-1 with the diff
    - If different, return false

 */