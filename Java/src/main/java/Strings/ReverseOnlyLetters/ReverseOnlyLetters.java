package Strings.ReverseOnlyLetters;

public class ReverseOnlyLetters {
    public static void main(String [] args) {
//        "ab-cd", "a-bC-dEf-ghIj",
        String [] input = {"Test1ng-Leet=code-Q!"};
        for (String i : input)
            System.out.println("Reverse: " + reverseOnlyLetters(i));
    }

    public static String reverseOnlyLetters(String input) {

        // Step1 - Create Stringbuilder to build the reverse Letters
        StringBuilder sb = new StringBuilder();

        // Step2 - Create indexes for traversing backwards
        int reverseIndex = input.length();
        char reverseLetter = '\n';

        // Step3 - Traverse input front to back
        // Why ? because we want to see take into account the NON alphabetic chars
        // But we add the reversed letter
        for (int i=0; i < input.length(); i++) {
            char letter = input.charAt(i);

            // Step4 - Check if alphabetic
            if (!Character.isAlphabetic(letter)) {
                sb.append(letter);
                continue;
            }

            // Step5 - Reset the reverseIndexes
            reverseIndex--;
            reverseLetter =  input.charAt(reverseIndex);

            // Step6 - Make sure the reverseLetter is Also Alphabetic only
            while (!Character.isAlphabetic(reverseLetter)) {
                reverseIndex--;
                reverseLetter = input.charAt(reverseIndex);
            }

            sb.append(reverseLetter);
        }

        return sb.toString();
    }
}
