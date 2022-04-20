package Misc.MinNumOperationsMoveBallsToEachBox;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MinNumOperationsMoveBallsToEachBox {
    public static void main(String [] args) {
        String [] inputs = {"110", "001011" };
        for (String i : inputs)
            System.out.println("Min Operations: " + Arrays.toString(minOperations(i)) + "\n");
    }

    public static int[] minOperations(String boxes) {
        Set<Integer> set = new TreeSet<>();
        int [] output = new int[boxes.length()];

        // Populate Set
        int onesPositionTotal = 0;
        for (int i=0; i<boxes.length();i++) {
            char character = boxes.charAt(i);
            if (character == '1') {
                set.add(i);
                onesPositionTotal += i;
            }
        }
        System.out.println("Set: " + set);
        int numZeroes = boxes.length() - set.size();

        for (int i=0; i<boxes.length(); i++) {
            int total = onesPositionTotal - (numZeroes * i);
            System.out.println("Total: " + total);

            output[i] = total;
        }

        return output;
    }
}
