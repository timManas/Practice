package Strings.SmallestPanlindromicReArrangement;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SmallestPanlindromicReArrangement {
    public static void main(String [] args) {
        String [] input = {"z", "babab", "daccad", "daccadd", "yey"};
        for (String val : input)
            System.out.println("SmallestPal: " + smallestPalindrome(val) + "\n");
    }

    public static String smallestPalindrome(String input) {

        String [] charArr = input.split("");
        Arrays.sort(charArr);
        System.out.println("CharrArray: " + Arrays.toString(charArr) );

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();

        for (int i=0; i<charArr.length; i++) {
            String current = charArr[i];
            String next = i+1 >= charArr.length ? "" : charArr[i+1];

            if (current.equalsIgnoreCase(next)) {
                firstHalf.append(current);
                secondHalf.append(next);
                ++i;
            } else {
                firstHalf.append(current);
            }
        }

        System.out.println("firstHalf: " + firstHalf);
        System.out.println("secondHalf: " + secondHalf);

        return firstHalf.toString() + secondHalf.reverse();
    }
}
