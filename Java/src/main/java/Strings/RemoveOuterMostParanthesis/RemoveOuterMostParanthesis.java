package Strings.RemoveOuterMostParanthesis;

import java.util.Stack;

public class RemoveOuterMostParanthesis {

    public static void main(String [] args) {
        String[] input = {"(()())(())", "(()())(())(()(()))", "()()"};
        for (String i : input) {
            System.out.println("RemovedOuterParanthesis: " + removeOuterParentheses(i));
        }
    }

    public static String removeOuterParentheses(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (stack.isEmpty()) {
                stack.push(letter);
                continue;
            }


            if (stack.size() == 1) {    // Check here is element is outermost

                if (stack.peek() == '(' && letter == ')') {
                    stack.pop();
                    continue;
                }


            } else {
                if (stack.peek() == '(' && letter == ')') {
                    sb.append(stack.pop());
                    sb.append(letter);
                    continue;
                }
            }

            stack.push(letter);


        }

        return sb.toString();
    }

}
