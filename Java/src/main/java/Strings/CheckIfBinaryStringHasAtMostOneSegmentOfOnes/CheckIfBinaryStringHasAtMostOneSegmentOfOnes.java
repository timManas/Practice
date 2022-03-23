package Strings.CheckIfBinaryStringHasAtMostOneSegmentOfOnes;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String [] args) {
        String [] input = {"1001", "110", "1", "10"};
        for (String i : input)
            System.out.println("Check Ones Segment: " + checkOnesSegment(i) + "\n");
    }

    public static boolean checkOnesSegment(String s) {

        if (s.length() == 1) {
            return s.equalsIgnoreCase("1");
        }

        char prev = s.charAt(0);
        for (int i=1; i<s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == '1' && prev == '1')
                return true;

            prev = letter;
        }

        return false;
    }
}
