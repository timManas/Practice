package Strings.RemoveOuterMostParanthesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOuterMostParanthesis {

    public static void main(String [] args) {
        String[] input = {"(()())(())", "(()())(())(()(()))", "()()"};
        for (String i : input) {
            System.out.println("RemovedOuterParanthesis: " + removeOuterParentheses(i));
        }
    }

    public static String removeOuterParentheses(String input) {

        // Step1 - Create String build to keep track of all the inner ()
        StringBuilder sb = new StringBuilder();

        // Step2 - Create list of Primitive decomposition
        List<String> primDecompList = fetchPrimitiveDecomposition(input);

        // Step3 - Traverse through List of Primitive decomposition
        // Fetch the inner () and append to stringbuilder
        for (String element : primDecompList) {
            sb.append(element.substring(1, element.length() - 1));
        }

        // Step4 - Return String of StringBuilder
        return sb.toString();
    }


    /**
     *
     * @param input
     * @return List
     *
     * The wat this works is that we keep track of the open and close brackets
     * Once the openCount and closeCount ARE THE SAME ...Then this is a PRIMITIVE Decompoistion
     *      > We then take the Substring from startIndex until i and put in List to be returned
     * If not the same, we incrememnt the open and close Count
     */
    private static List<String> fetchPrimitiveDecomposition(String input) {
        List<String> primDecompList = new ArrayList<>();
        int openCount = 0;
        int closeCount = 0;
        int startIndex = -1;


        for (int i=0; i < input.length(); i++) {
            char letter = input.charAt(i);

            if (startIndex == -1)
                startIndex = i;

            if (letter == '(')
                ++openCount;
            else if (letter == ')')
                ++closeCount;

            if (openCount != 0 && closeCount != 0 && openCount == closeCount) {
                primDecompList.add(input.substring(startIndex, i+1));
                openCount = 0;
                closeCount = 0;
                startIndex = -1;
            }
        }

        System.out.println("Primitive Decomposition List: " + primDecompList);
        return primDecompList;
    }
}


/**

 Notes
 - DEFINITELY NOT EASY AT ALL

 Solution
 1. Seperate String input into primitive decomposition
    How ?
    > We keep count of the Open and Close bracket
    > Once the open and close bracket are the same ... we take the Substring from startIndex till i
    > This is a primitive decompostion
 2. Once we have list of primitive decomposition:
    > We take inner brackets and place them in StringBuilder
 3. Return the String of StringBuilder


 */
