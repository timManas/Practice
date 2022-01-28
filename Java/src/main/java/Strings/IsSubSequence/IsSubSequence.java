package Strings.IsSubSequence;

public class IsSubSequence {
    public static void main(String [] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("Is SubSequence: " + isSubsequence(s, t));

        String s1 = "axc";
        String t1 = "ahbgdc";
        System.out.println("Is SubSequence: " + isSubsequence(s1, t1));

        String s2 = "abc";
        String t2 = "ahbgdc";
        System.out.println("Is SubSequence: " + isSubsequence(s2, t2));
    }

    public static boolean isSubsequence(String s, String t) {

        // Step1 - Check if strings have right size
        if (s.length() == 0)
            return true;
        else if (t.length() == 0)
            return false;

        int indexS = 0;
        int indexT = 0;

        // Step2 - Traverse String t
        while (indexT < t.length() && indexS < s.length()) {
            char currentT = t.charAt(indexT);
            char currentS = s.charAt(indexS);
            System.out.println("currentS:" + currentS + "     currentT: " + currentT );

            // Step3 - If match, increment indexS
            if (currentS == currentT) {
                ++indexS;
            }

            ++indexT;
        }

        return indexS == s.length();    // indexS HAS to the same length as String s for a match
    }
}
