package Strings.LongerContinguousSegementsofOnesZeroes;

public class LongerContinguousSegementsofOnesZeroes {

    public static void main(String [] args) {
        String [] inputs = {"011000111", "10"};
        for (String i : inputs)
            System.out.println("string: " + i + "   checkZeroesOnes: " + checkZeroOnes(i));
    }

    public static boolean checkZeroOnes(String input) {

        if (input.equalsIgnoreCase("1"))
            return true;
        if (input.equalsIgnoreCase("0"))
            return false;

        int longestOneLen = 0;
        int longestZerolen = 0;

        int currentLengthOnes = 1;
        int currentLengthZeroes = 1;
        for (int i=1; i<input.length();i++) {
            char prev = input.charAt(i-1);
            char letter = input.charAt(i);

            // Check if they are the same
            if (prev != letter) {
                if (prev =='0') {
                    longestZerolen = currentLengthZeroes > longestZerolen ? currentLengthZeroes : longestZerolen;
                    currentLengthZeroes = 1;
                } else if (prev == '1') {
                    longestOneLen = currentLengthOnes > longestOneLen ? currentLengthOnes : longestOneLen;
                    currentLengthOnes = 1;
                }
                continue;
            }

            if (letter == '1')
                currentLengthOnes++;
            if (letter == '0')
                currentLengthZeroes++;

            if (i == input.length()-1) {
                longestZerolen = currentLengthZeroes > longestZerolen ? currentLengthZeroes : longestZerolen;
                longestOneLen = currentLengthOnes > longestOneLen ? currentLengthOnes : longestOneLen;
            }
        }

        if (longestOneLen > longestZerolen)
            return true;

        return false;
    }
}
