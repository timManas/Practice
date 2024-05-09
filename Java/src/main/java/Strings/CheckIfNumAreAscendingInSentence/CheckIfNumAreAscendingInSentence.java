package Strings.CheckIfNumAreAscendingInSentence;

import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;

public class CheckIfNumAreAscendingInSentence {

    public static void main (String [] args) {
        String [] input = {"1 box has 3 blue 4 red 6 green and 12 yellow marbles",
                "hello world 5 x 5",
                "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"};
        for (String i : input)
            System.out.println("Are num asc: " + areNumbersAscending(i) + "\n");
    }

    public static boolean areNumbersAscending(String s) {
        boolean isAsc = true;
        String [] input = s.split(" ");

        int prev = -1;
        for (int i=0; i<input.length; i++) {
            String word = input[i];
            System.out.println("Current: " + word);
            try {
                int number = Integer.parseInt(word);
                if (prev >= number)
                    return false;

                prev = number;
            } catch (Exception e) {
            }

        }
        return isAsc;
    }
}
