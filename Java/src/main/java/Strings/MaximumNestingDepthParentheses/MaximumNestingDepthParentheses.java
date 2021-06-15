package Strings.MaximumNestingDepthParentheses;

import java.util.Stack;

public class MaximumNestingDepthParentheses {
    public static void main(String [] args) {
        String [] inputs = {"(1+(2*3)+((8)/4))+1", "(1)+((2))+(((3)))", "1+(2*3)/(2-1)", "1"};
        for (String word : inputs)
            System.out.println("Max Depth: " + maxDepth(word));
    }

    public static int maxDepth(String sentence) {

        // Step1 - Create output variable
        int depth = 0;

        // Step2 - Create stack to keep track of the paranethesis
        Stack<Character> stack = new Stack<>();

        // Step3 - Traverse sentence one character at a time
        for (int i=0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            // Step4 - If '(', add to stack and determine the depth
            // If ')', we remove the top '('
            // Ignore all numbers and digits
            if (character == '(') {
                stack.add(character);
                depth = depth < stack.size() ? stack.size() : depth;
            } else if (character == ')') {
                stack.pop();
            }
        }

        return depth;
    }
}

/**
 Note
 - Not as simple as it sounds

 Trick:
 - Ignore all letters, numbers and expressions
 - Focus only on paranthesis
 - Create stack to keep track of the expression
 - Since each sentence is GUARANTEED to be VSP (valid parentheses string ) then
 the top is "(" after a ")"

 Solution
 1. Create stack
 2. Traverse letter one by one
 3. For each letter check if either "(" or ")", ignore all others
 4. If "(" we add to stack and recheck the size of the stack
 5. Return the largest stack size
 */
