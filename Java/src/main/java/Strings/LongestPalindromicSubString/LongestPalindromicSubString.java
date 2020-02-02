package Strings.LongestPalindromicSubString;

public class LongestPalindromicSubString {

    public static void main(String [] args) {
//        String input = "babad";
        String input = "acc";
        System.out.println("LongestPalindrome: " + longestPalindrome(input));
    }

    public static String longestPalindrome(String input) {

        if (input.equalsIgnoreCase("") || input.length() == 1)
            return input;

        int startIndex = 0;
        int endIndex = input.length() - 1;
        int longestStart = -1;
        int longestEnd = -1;

        while (startIndex < endIndex) {
            char leftChar = input.charAt(startIndex);
            char rightChar = input.charAt(endIndex);

            if (leftChar == rightChar) {

                if (longestStart == -1 && longestEnd == -1) {
                    longestStart = startIndex;
                    longestEnd = endIndex;
                }

            } else {
                longestStart = -1;
                longestEnd = -1;
            }


            ++startIndex;
            --endIndex;
        }

        if (longestStart == -1 && longestEnd == -1) {
            longestStart = 0;
            longestEnd = 0;
        }

        String longestSubstirng = input.substring(longestStart, longestEnd + 1);

        System.out.println("SubString: " +  longestSubstirng +"    Start: " + longestStart + "     End: " + longestEnd);



        return longestSubstirng;
    }

}
