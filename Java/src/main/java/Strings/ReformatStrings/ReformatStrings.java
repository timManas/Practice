package Strings.ReformatStrings;

import java.util.Stack;

public class ReformatStrings {
    public static void main(String [] args) {
        String [] input = {"a0b1c2", "leetcode", "1229857369", "covid2019", "ab123"};
        for (String i : input) {
            System.out.println("Reformat: " + reformat(i));
        }
    }

    public static String reformat(String input) {

        // Step1 - Check input
        if (input.length() == 1)
            return input;

        // Step2 - Create Stack to store letters and numbers seperately
        StringBuilder sb = new StringBuilder();
        Stack<Character> letters = new Stack<>();
        Stack<Character> numbers = new Stack<>();

        // Step3 - Populate
        for (int i=0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (Character.isAlphabetic(character))
                letters.push(character);
            else if (Character.isDigit(character))
                numbers.push(character);
        }

        System.out.println("Letters: " + letters + "    Numbers: " + numbers);


        // Step4 - Check if this is even possible ...LOL
        if ((letters.size() == 0 || numbers.size() == 0))
            return "";

        // Check if the difference between them is more than 1
        if (Math.max(letters.size(), numbers.size()) - Math.min(letters.size(), numbers.size()) > 1 )
            return "";


        // Step5 - It is possible and create the reformatted string
        while (!letters.isEmpty() || !numbers.isEmpty()) {

            // Based on which stack is bigger, it goes first
            if (letters.size() > numbers.size()) {
                if (!letters.isEmpty())
                    sb.append(letters.pop());

                if (!numbers.isEmpty())
                    sb.append(numbers.pop());
            } else {

                if (!numbers.isEmpty())
                    sb.append(numbers.pop());

                if (!letters.isEmpty())
                    sb.append(letters.pop());
            }
        }

        return sb.toString();
    }
}
