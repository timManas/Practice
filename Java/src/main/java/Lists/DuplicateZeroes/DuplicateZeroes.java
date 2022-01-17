package Lists.DuplicateZeroes;

import java.util.Stack;

public class DuplicateZeroes {
    public static void main(String [] args) {
        int [][] input = {{8,4,5,0,0,0,0,7},{0,1,7,6,0,2,0,7},{1,0,2,3,0,4,5,0}, {1,2,3}};
        for (int [] x : input) {
            duplicateZeros(x);
            System.out.println("Output: ");
            for (int i : x) System.out.print(i + ",");
            System.out.println("\n");
        }

    }

    public static void duplicateZeros(int[] arr) {
        // Step1 - Create stack to add new elements
        Stack<Integer> stack = new Stack<>();

        // Step2 - Traverse input array
        for (int i=0; i<arr.length; i++) {
            int current = arr[i];

            // Step3 - If current is zero, add and additional zero to stack
            // Dont forget to check for length
            if (current == 0) {
                stack.push(current);
                if (stack.size() == arr.length)
                    break;
            }

            // Step4 - Add current number to stack
            stack.push(current);
            if (stack.size() == arr.length)
                break;
        }

        // Step5 - Repopulate input arr with stack values
        for (int i=arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
    }
}
