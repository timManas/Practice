package Math.PalindromNumber;

public class PalindromeNumber {

    public static void main(String [] args) {
        int input = 12321;
        System.out.println("IsPalindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(int num) {
        boolean isPalindrome = true;

        // Solution #1
        String inputStr = String.valueOf(num);
        char [] charArr = inputStr.toCharArray();
        int forwardIndex = 0;
        int backwardIndex = charArr.length - 1;
        while (forwardIndex < backwardIndex) {

            if (charArr[forwardIndex] != charArr[backwardIndex])
                return false;

            forwardIndex++;
            backwardIndex--;

        }

        return isPalindrome;
    }
}
