package Lists.RearrangeElementsBySign;

import java.util.*;

public class RearrangeElementsBySign {
    public static void main(String [] args) {
        int [][] input ={{3,1,-2,-5,2,-4}, {-1,1}};
        for (int [] i : input) {
            System.out.println("ReArranged Array: " + Arrays.toString(rearrangeArray(i)));
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int [] output = new int [nums.length];

        // Step1 - Create Queue
        Deque<Integer> positiveQ = new LinkedList<>();
        Deque<Integer> negativeQ= new LinkedList<>();

        // Step2 - Populate Queue
        for (int i : nums) {
            if (i > 0)
                positiveQ.addFirst(i);
            else
                negativeQ.addFirst(i);
        }

        // Step3 - Populate the output array
        for (int i=0; i < output.length; i++) {
            if (i % 2 == 0) {
                output[i] = positiveQ.removeLast();
            } else {
                output[i] = negativeQ.removeLast();
            }
        }
        return output;
    }
}
