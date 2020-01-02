package Strings.Easy_ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {



    public static void main(String [] args) {

//        String test = "()[]{}";
        String test = "(])";
        System.out.println("Is String valid: " + test + "   Result: " + isValid(test));

    }

    public static boolean isValid(String target) {

        // Traverse the Target
        // Check if element is opening or closing
        // If closing bracket, check the top of the Stack
        // If match, then pop it off the stack
        // Not Match, display Error
        // After traversing all elements and stack is empty, then return true

        HashMap<String, String> bracketMap = new HashMap<String, String>();
        bracketMap.put("}", "{");
        bracketMap.put("]", "[");
        bracketMap.put(")", "(");
        Stack<String> stack = new Stack<String>();

        char [] strArray = target.toCharArray();
        for (int i=0; i < strArray.length; i++) {
            String character = String.valueOf(strArray[i]);
            System.out.println(character);

            // Check if Element is opening vs closing
            if (bracketMap.containsKey(character)) {    // Closing Bracket


                // Check if there are no elements and we get a closing bracket
                if (stack.isEmpty())
                    return false;

                // Check if its a match, if not, Fail it !
                String top = stack.peek();
                if (!bracketMap.get(character).equals(top)) {
                    return false;
                }

                String removed = stack.pop();
                System.out.println("Popping off: " + removed);

            } else if (bracketMap.containsValue(character)){    // Opening Bracket
                stack.push(character);

            } else {
                System.out.println("Unknown: " + character);
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }
}
