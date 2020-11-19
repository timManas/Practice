package Strings.ReverseWordsInString;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String [] args) {
        String [] inputString = {"the sky is blue", "  hello world  ", "a good   example"};
        for (String input : inputString) {
            System.out.println("Output: " + reverseWords(input));
        }
    }

    public static String reverseWords(String input) {
        System.out.println("Input: " + input);

        // Step1 - Create output variable
        StringBuilder sb = new StringBuilder();

        // Step2 - Trim and SPlit input String
        input = input.trim();
        String [] words = input.split(" ");

        // Step3 - Traverse the array starting from the end till the beginning
        for (int i=words.length - 1; i >= 0; i--) {
            String currentWord = words[i];
            if (currentWord.equalsIgnoreCase(""))
                continue;

            sb.append(currentWord + " ");       // Add to Stringbuilder only is current word is not ""
        }

        return sb.toString().trim();
    }

}

/**
 Notes
    - Easy as pie

 Solution
 1. Create a strinbuilder to store the words
 2. Split the input String by " " (spaces)
 3. Traverse the split array starting form the end till the beginning
    > If current word is " " (empty spaces), the move on
    > Else - Add to Strinbuilder
 4. Return String


 */
