package Strings.DetectCapital;

public class DetectCapital {
    public static void main(String [] args) {
        String [] input = {"USA", "FlaG", "ffffffffffffffffffffF"};
        for (String i : input) {
            System.out.println("Detect Capital: " + detectCapitalUse(i));
        }
    }

    public static boolean detectCapitalUse(String word) {

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        // Step1 - Check if every letter is ALL UpperCase or ALL LowerCase
        for (int i=0; i<word.length(); i++) {
            char letter = word.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper.append(letter);
            } else if (Character.isLowerCase(letter)) {
                lower.append(letter);
            }
        }

        // Step2 - Check if lengths matches
        if (upper.length() == word.length() || lower.length() == word.length())
            return true;

        // Step3 - Check if Only first letter is Uppercase...rest should all be lowercase
        StringBuilder sb = new StringBuilder(word);
        if (!Character.isUpperCase(sb.charAt(0)))
            return false;

        for (int i=1; i<word.length();i++) {
            char letter = sb.charAt(i);
            if (Character.isUpperCase(letter)) {
                return false;
            }
        }



        return true;
    }
}
