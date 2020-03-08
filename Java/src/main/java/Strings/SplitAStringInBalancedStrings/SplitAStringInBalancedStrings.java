package Strings.SplitAStringInBalancedStrings;

import java.util.Stack;

public class SplitAStringInBalancedStrings {

    public static void main(String [] args) {
//        String input = "RLRRLLRLRL";     // 4
//        String input = "RLLLLRRRLR";    // 3
//        String input = "LLLLRRRR";     // 1
//        String input = "RLRRRLLRLL";       // 2

//        System.out.println("Input: " + input + "    BalancedString: " + balancedStringSplit(input));

        String [] input = {"RLRRLLRLRL", "RLLLLRRRLR", "LLLLRRRR", "RLRRRLLRLL"};
        for (String string : input) {
            System.out.println("Input: " + input + "    BalancedString: " + balancedStringSplit(string));
        }

    }

    public static int balancedStringSplit(String input) {
        int count = 0;

        // Step1 - Create two stacks
        Stack <Character> mainStack = new Stack<Character>();
        Stack <Character> tempStack = new Stack<Character>();

        // Step 2 - Traverse through the input
        for (int i=0; i < input.length(); i++) {
            char letter = input.charAt(i);

            // Step3 - If letter is the same as first letter -> Add to main Stack
            if (mainStack.isEmpty() || mainStack.peek() == letter) {
                mainStack.push(letter);
            } else {        // If letter is diff -> Add to temp stack

                // Add letter to temp stack
                tempStack.push(letter);

                // Step4 - Only if both stacks have the same size, we increase count and reset the stack
                if (mainStack.size() == tempStack.size()) {
                    ++count;
                    mainStack.removeAllElements();
                    tempStack.removeAllElements();
                }
            }
        }

        return count;
    }

}

/**
 Solution
 - Use two stacks
    1. Each stack to keep track of the same letter
    2. If both stack reach the same size, we increase count and empty the stacks out
    3. Repeat until we reach end of input string

 */
