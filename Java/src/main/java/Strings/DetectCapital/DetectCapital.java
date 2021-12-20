package Strings.DetectCapital;

public class DetectCapital {
    public static void main(String [] args) {
        String [] input = {"USA", "FlaG"};
        for (String i : input) {
            System.out.println("Detect Capital: " + detectCapitalUse(i));
        }
    }

    public static boolean detectCapitalUse(String word) {
        boolean hasEncounteredCapital = false;
        // Check if
        for (int i=0; i<word.length(); i++) {
            char letter = word.charAt(i);

            if (Character.isUpperCase(letter)) {

            } else if (Character.isLowerCase(letter)) {

            }
        }

        return true;
    }
}
