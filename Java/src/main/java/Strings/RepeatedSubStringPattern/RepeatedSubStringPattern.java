package Strings.RepeatedSubStringPattern;

import java.util.Deque;
import java.util.LinkedList;

public class RepeatedSubStringPattern {
    public static void main(String [] args) {

        String [] input = {"bab bab bab bab bab","ababababab","abac","ababab","abab", "aba", "abcabcabcabc"};
        for (String i : input)
            System.out.println("Repeated SubString: " + repeatedSubstringPattern(i) + "\n");


    }

    public static boolean repeatedSubstringPattern(String input) {

        // Step1 - Traversde input Array
        for (int i=input.length() / 2; i > 0; i--) {
            String copyS = input;            // Make a copy, for checking purposes

            // Step2 - Check if we can evenly divide the input size with i
            if (copyS.length() % i != 0)
                continue;

            // Step3 - Get the SubString
            String subString = copyS.substring(0, i);
            System.out.println("i:" + i + "     SubString: " + subString);

            // Step4 - Split into even sizes, if size == 0. We have a repeated pattern
            String subStringList = copyS.replace(subString, "");
            if (subStringList.trim().length() == 0)
                return true;
        }



        return false;
    }
}
