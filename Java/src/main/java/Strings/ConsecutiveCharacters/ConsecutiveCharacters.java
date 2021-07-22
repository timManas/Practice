package Strings.ConsecutiveCharacters;

public class ConsecutiveCharacters {
    public static void main(String [] args) {
        String [] input = {"xx", "leetcode", "abbcccddddeeeeedcba", "triplepillooooow", "hooraaaaaaaaaaay", "tourist"};
        for (String s : input)
            System.out.println("Max Power: " + maxPower(s));
    }

    public static int maxPower(String s) {
        int max = 1;        // MaxPower
        int currentMax = 1;     // current power of the consectutive Words

        // Step1 - Traverse the string one character at a time
        for (int i=1; i < s.length(); i++) {
            char letter = s.charAt(i);

            // Step2 - Check if the previous letter matches
            if (s.charAt(i-1) == letter) {
                currentMax++;
            } else {
                currentMax = 1;
            }

            // Step3 - Update the max
            max = max < currentMax ? currentMax : max;
        }

        return max;
    }
}
