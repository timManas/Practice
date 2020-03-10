package Lists.ReplaceElementsWithGreatestElementOnRight;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElementsWithGreatestElementOnRight {

    public static void main(String [] args) {
        int [] arr = {17,18,5,4,6,1};       //[18,6,6,6,1,-1]
        int [] result = replaceElements(arr);

        for (int i : result)
            System.out.println(i);
    }

    public static int[] replaceElements(int[] arr) {
        int [] result = new int [arr.length];
        int max = -1;
        int temp;

        // Start from the Right
        for (int i=arr.length - 1; i >= 0; i--) {

            // Store the result temporarily to be compared for the next (previous ... --i) one
            temp = arr[i];

            // Set the value to be the max
            result[i] = max;

            // Update the max to be the biggest one
            max = Math.max(temp, max);
        }

        return result;
    }
}

/**
 Solution
 1. You will need to work backwards
    - Start from the end
    - Create a temp value to store the current value
    - Set the result[i] position to the maximum while IGNORE the current value
    - Update the max value by taking Math.max on the temp and max value
    - Repeat process until finished
 */
