package Strings.BackspaceStringCompare;

public class BackSpaceStringCompare {

    public static void main(String [] args) {
//        String s = "ab#c";
//        String t = "ad#c";
//        String s = "ab##";
//        String t = "c#d#";
        String s = "a##c";
        String t = "#a#c";

        System.out.println("IsSame: " + backspaceCompare(s, t));

    }

    // Working Solution #2
    public static boolean backspaceCompare(String S, String T) {
        String strS = fetchString(S);
        String strT = fetchString(T);

        return strS.equalsIgnoreCase(strT);
    }

    private static String fetchString(String str) {
        StringBuilder sb = new StringBuilder(str);

        int index = 0;
        while (index < sb.length()) {
            char letter = sb.charAt(index);
            if (letter == '#') {

                if (index != 0) {
                    sb.replace(index - 1 , index + 1, "");

                } else {
                    sb.replace(0, 1, "");

                }
                index = 0;
                continue;
            }


            index++;
        }

        System.out.println(sb.toString());
        return sb.toString();
    }


    // Working Solution #1 - Naive Solution O(n)
//    public static boolean backspaceCompare(String S, String T) {
//
//        Stack<Character> stackS = fetchStackCompare(S);
//        Stack<Character> stackT = fetchStackCompare(T);
//
//        System.out.println("StackS: " + stackS.toString() + "      StackT: " + stackT.toString());
//        StringBuilder sbS = new StringBuilder();
//        StringBuilder sbT = new StringBuilder();
//
//        for (char letter : stackS)
//            sbS.append(letter);
//
//        for (char letter : stackT)
//            sbT.append(letter);
//
//        if (sbS.toString().equalsIgnoreCase(sbT.toString()))
//            return true;
//
//        return false;
//    }
//
//    private static Stack<Character> fetchStackCompare(String str) {
//
//        Stack<Character> stack = new Stack<Character>();
//
//        for (int i=0; i < str.length(); i++) {
//            char character = str.charAt(i);
//            if (character == '#') {
//                if (!stack.isEmpty())
//                    stack.pop();
//            } else {
//                stack.push(character);
//            }
//        }
//
//        return stack;
//    }

}
