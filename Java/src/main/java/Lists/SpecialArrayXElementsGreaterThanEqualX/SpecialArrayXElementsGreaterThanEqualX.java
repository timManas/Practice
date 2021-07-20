package Lists.SpecialArrayXElementsGreaterThanEqualX;

import java.util.Arrays;

public class SpecialArrayXElementsGreaterThanEqualX {

    public static void main(String [] args) {

        System.out.println("Special Array: " + specialArray(new int[]{3,5}));
        System.out.println("Special Array: " + specialArray(new int[]{0,0}));
        System.out.println("Special Array: " + specialArray(new int[]{0,0,3,4,4}));
        System.out.println("Special Array: " + specialArray(new int[]{3,6,7,7,0}));
    }

    public static int specialArray(int[] nums) {
        int x = nums.length;

        // Sort the array for easier parsing
        Arrays.sort(nums);

        // Step2 - Start from num.length till 0
        // Every step, we compare with each value of nums
        outLoop:
        while (x > 0) {
            innerLoop:
            for (int i=0; i<nums.length;i++) {

                // Step3 - If x is smaller than the current Element
                // We check if its a special array: True, we break out of the outerloop, False we continue by decrementing x
                if (x <= nums[i]) {
                    int numElementsEqualGreater = nums.length - i;

                    // Check if special array
                    if (x == numElementsEqualGreater)
                        break outLoop;

                    break innerLoop;        // Break if NOT special array
                }
            }
            x--;
        }
        return x == 0 ? -1 : x;
    }
}

/**
 Note
 - Tricky as FUCK but i got it !!
 - Trick is to work backwards from length of array to 0

 Solution
 1. Sort the input array. Helps with determining how many elements are bigger than current
 2. Create while loop to traverse from nums.lengh to 0
 3. Create inner loop to traverse each element in array
 4. Check if special array:
    True: We break out of the Enter loop and return x
    False: We stop inner loop and continue decrementing x
 5. Return x if found and -1 if not found

 */
