package Strings.BackspaceStringCompare;

import java.util.Stack;

public class BackSpaceStringCompare {

    public static void main(String [] args) {
        String s = "ab#c";
        String t = "ad#c";

        System.out.println("IsSame: " + backspaceCompare(s, t));

    }

    public static boolean backspaceCompare(String S, String T) {

        Stack<Character> stackS = fetchStackCompare(S);
        Stack<Character> stackT = fetchStackCompare(T);

        System.out.println("StackS: " + stackS.toString() + "      StackT: " + stackT.toString());
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        for (char letter : stackS)
            sbS.append(letter);

        for (char letter : stackT)
            sbT.append(letter);

        if (sbS.toString().equalsIgnoreCase(sbT.toString()))
            return true;

        return false;
    }

    private static Stack<Character> fetchStackCompare(String str) {

        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == '#') {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(character);
            }
        }

        return stack;
    }

}
