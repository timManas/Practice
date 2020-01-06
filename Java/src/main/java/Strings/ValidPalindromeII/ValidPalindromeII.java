package Strings.ValidPalindromeII;

public class ValidPalindromeII {
    public static void main(String [] args) {

        String input = "eedede";
        System.out.println("Valid Palindrome: " + validPalindrome(input));
    }

    public static boolean validPalindrome(String inputStr) {
        boolean isValid = true;

        char [] inputCharArr = inputStr.toCharArray();
        if (inputCharArr.length > 50000)
            return false;

        int forwardIndex = 0;
        int backwardIndex = inputCharArr.length - 1;

        boolean hasDeleted = false;
        while (forwardIndex <= backwardIndex) {

            if (inputCharArr[forwardIndex] != inputCharArr[backwardIndex]) {
                
                continue;
            }

            forwardIndex++;
            backwardIndex--;
        }


        return isValid;
    }
}
