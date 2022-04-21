package Misc.MinNumOperationsMoveBallsToEachBox;

import java.util.*;

public class MinNumOperationsMoveBallsToEachBox {
    public static void main(String [] args) {
        String [] inputs = {"110", "001011" };
        for (String i : inputs)
            System.out.println("Min Operations: " + Arrays.toString(minOperations(i)) + "\n");
    }

    public static int[] minOperations(String boxes) {
        int [] output = new int[boxes.length()];

        // Step1 - Populate list
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<boxes.length();i++) {
            char character = boxes.charAt(i);
            if (character == '1') {
                list.add(i);
            }
        }
        System.out.println("list: " + list);

        // Step2 - Traverse each query
        for (int i=0; i<boxes.length(); i++) {

            // Step3 - Find the total by taking the Absolute value between i and list.get(x)
            int total = 0;
            for (int x=0; x<list.size(); x++) {
                total += Math.abs(list.get(x) - i);
            }
            System.out.println("Total: " + total);

            // Add to output array
            output[i] = total;
        }

        return output;
    }
}
