package Strings.ReplaceAllDigitswithCharacters;

public class ReplaceAllDigitswithCharacters {
    public static void main(String [] args) {
        String [] inputs = {"a1c1e1", "a1b2c3d4e"};
        for (String word : inputs) {
            System.out.println("Replaced Digits: " + replaceDigits(word));
        }
    }

    public static String replaceDigits(String word) {

        // Step1 - Create String builder
        StringBuilder sb = new StringBuilder();

        // Step2 - Traverse each letter in word
        for (int i=0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Step3 - Check if letter is char or digit
            // If Digit, get the previous word and increase the character + digit
            // Finally store in string builder
            if (Character.isDigit(letter)) {
                char prevLetter = word.charAt(i-1);
                char replaceLetter = (char)(prevLetter + Integer.parseInt(String.valueOf(letter)));
                System.out.println("Replace Letter: " + replaceLetter);
                sb.append(replaceLetter);

            } else {
                sb.append(letter);
            }
        }

        return sb.toString();
    }

}
