package Strings.FindLongestBalancedSubStrBinString;

public class FindLongestBalancedSubStrBinString {
    public static void main (String [] args) {
        String [] input = {"01000111", "00111", "111", "001011", "00010"};
        for (String i : input)
            System.out.println("LongestSubStr: " + findTheLongestBalancedSubstring(i) + "\n");
    }

    public static int findTheLongestBalancedSubstring(String s) {
        System.out.println("SubStr: " + s);

        // Step1 - Define starting and current indexes which will trasverse the String
        int longestSubStr = 0;
        int numZeroes = 0;
        int numOnes = 0;
        boolean containsOne;        // Create check if there exists a 1 in the string already

        // Step2 - Traverse start index
        for (int start=0; start < s.length() - 1; start++) {
            System.out.println("Start: " + s.charAt(start));
            numZeroes = 0;
            numOnes = 0;
            containsOne = false;

            if (s.charAt(start) == '0') {
                numZeroes++;
            } else {
                continue;
            }

            // Step3 - Traverse current Index using start + 1
            for (int current = start + 1; current < s.length(); current++) {
                System.out.println("    current: " + s.charAt(current));

                if (s.charAt(current) == '0') {

                    // If we already have a 1 and now hit 0, we go start over
                    if (containsOne) {
                        break;
                    }

                    numZeroes++;
                    continue;
                }

                // If 1's
                numOnes++;
                containsOne = true;

                // Step4 - Check if this is the longest Sub Str
                if (numZeroes == numOnes) {
                    longestSubStr = longestSubStr < (numOnes + numZeroes) ? (numOnes + numZeroes) : longestSubStr;
                    System.out.println("        currentLongest: " + longestSubStr);
                    break;
                }
            }

        }

        return longestSubStr;
    }
}
