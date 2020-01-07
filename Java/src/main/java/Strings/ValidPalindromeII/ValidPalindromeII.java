package Strings.ValidPalindromeII;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ValidPalindromeII {
    public static void main(String [] args) {

//        String input = "eedede";
//        String input = "aba";
        String input = "abca";
//        String input = "baac";
//        String input = "deee";
        System.out.println("Valid Palindrome: " + validPalindrome(input));
    }

    public static boolean validPalindrome(String inputStr) {
        boolean isValid;

        char [] inputCharArr = inputStr.toCharArray();
        if (inputCharArr.length > 50000)
            return false;

        int forwardIndex = 0;
        int backwardIndex = inputCharArr.length - 1;

        boolean hasDeleted = false;

        isValid = validateArray(inputCharArr, forwardIndex, backwardIndex, hasDeleted);



        return isValid;
    }

    private static boolean validateArray(char[] inputCharArr, int forwardIndex, int backwardIndex, boolean hasDeleted) {

        int newFI = forwardIndex;
        int newBI = backwardIndex;



        while (newFI < newBI) {

            if (inputCharArr[newFI] != inputCharArr[newBI]) {

                if (hasDeleted) {
                    return false;
                }

                hasDeleted = true;
                boolean search1 = validateArray(inputCharArr, newFI + 1, newBI, hasDeleted);
                boolean search2 = validateArray(inputCharArr, newFI, newBI - 1, hasDeleted);



                return search1 || search2;
            }

            ++newFI;
            --newBI;
        }


        return true;
    }

}
