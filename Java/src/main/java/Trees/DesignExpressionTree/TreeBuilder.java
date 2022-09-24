package Trees.DesignExpressionTree;

import java.util.Stack;

public class TreeBuilder {
    Node buildTree(String[] postfix) {
        /**
            This is tricky, we need to start backwards

         */

        Stack<String> stack = new Stack<>();
        for (String i : postfix) {
            if (i.equalsIgnoreCase("+") ||
                    i.equalsIgnoreCase("-") ||
                    i.equalsIgnoreCase("*") ||
                    i.equalsIgnoreCase("/")) {

                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                System.out.println("num1: " + num1 + "      num2: " + num2 + "      total: " + (num1 + num2));

            } else {
               stack.push(i);
            }



        }
        return null;
    }
}
