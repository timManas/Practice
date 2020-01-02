package Strings.Easy_ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {



    public static void main(String [] args) {

        String test = "()[]{}";
        System.out.println("Is String valid: " + test + "   Result: " + isValid(test));

    }

    public static boolean isValid(String target) {
        HashMap<String, String> bracketMap = new HashMap<String, String>();
        bracketMap.put("{", "}");
        bracketMap.put("[", "]");
        bracketMap.put("(", ")");
        Stack<String> stack = new Stack<String>();



        // Traverse the Target
        // Check if element is opening or closing
        // If closing bracket, check the top of the Stack
            // If match, then pop it off the stack
            // Not Match, display Error
        // After traversing all elements and stack is empty, then return true



        return true;
    }
}
