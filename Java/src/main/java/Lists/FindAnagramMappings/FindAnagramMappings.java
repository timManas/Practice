package Lists.FindAnagramMappings;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FindAnagramMappings {
    public static void main(String [] args) {
        int [] A = {12, 28, 46, 32, 50};
        int [] B = {50, 12, 32, 46, 28};
        int [] C = anagramMappings(A, B);

        for (int i : C)
            System.out.println(i);
    }

    public static int[] anagramMappings(int[] A, int[] B) {
        int [] result = new int [A.length];
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Initialize Mapping for B
        for (int number : B) {
            list.add(number);
        }

        // Add to result
        for (int i=0; i < A.length; i++) {
            int number = A[i];
            result[i] = list.indexOf(number);

            // Modify number to prevent from being used again
            list.set(list.indexOf(number), -1);
        }

        return result;
    }
}

/**

 Solution
 - Add to list
    why ? So we can use list.indexOf
 - Add to result array
 - Change list value to -1 to avoid being used again
 - Repeat until we reach end of the Array A
 */
