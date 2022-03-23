package Strings.CheckIfBinaryStringHasAtMostOneSegmentOfOnes;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String [] args) {
        String [] input = {"1001", "110", "1", "10"};
        for (String i : input)
            System.out.println("Check Ones Segment: " + checkOnesSegment(i) + "\n");
    }

    public static boolean checkOnesSegment(String s) {

        // Step1 - If length is 1
        if (s.length() == 1) {
            return s.equalsIgnoreCase("1");
        }

        // Step2 - Find if continguous
        boolean hasOneSegment = false;
        for (int i=1; i<s.length(); i++) {
            char current = s.charAt(i);
            System.out.println("Current: " + current);

            // Step3 - Check if letter is 1 or 0
            // If letter is 0 after the one. We know there already exist atleast one
            // Then we check if there are more 1. If there are, we return zero
            if (current == '1') {
                if (hasOneSegment) {
                    return false;
                }
            } else {
                hasOneSegment = true;
            }


        }

        return true;
    }
}
