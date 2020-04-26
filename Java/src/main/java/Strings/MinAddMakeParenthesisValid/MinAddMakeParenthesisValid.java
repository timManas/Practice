package Strings.MinAddMakeParenthesisValid;

import java.util.Stack;

public class MinAddMakeParenthesisValid {

    public static void main(String [] args) {
        String [] array = {"())", "(((", "()", "()))(("};
        for (String i :  array)
            System.out.println(i + ": " + minAddToMakeValid(i));
    }

    public static int minAddToMakeValid(String input) {

        // Step1 - Create Stack to keep track of elements
        Stack<Character> stack = new Stack<>();

        // Step2 - Traverse input String
        for (int i=0; i < input.length(); i++) {

            // Step3 - Fetch each letter in string
            char letter = input.charAt(i);

            // Step4 - Compare with the top element in stack ... if they are ( & ), we remove it from stack
            if (!stack.isEmpty() && stack.peek() == '(' && letter == ')') {
                stack.pop();
                continue;
            }

            // Step4b - We add letter to stack
            stack.push(letter);
        }

        // Step5 - Return Stack size
        return stack.size();
    }
}

/**
 Solution
 - Super easy .. just use a stack to keep track if the elements match
 - We use a Stack to keep track of the elements are getting closed properly
 - Then lastly, we count the size of the stack. This value is the # of elements which do not have closed or open bracket
 */
