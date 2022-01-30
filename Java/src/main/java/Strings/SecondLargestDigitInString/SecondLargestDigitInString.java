package Strings.SecondLargestDigitInString;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestDigitInString {
    public static void main(String [] args) {
        String [] input = {"dfa12321afd", "abc1111"};
        for (String i : input)
            System.out.println("SecondHighest: " + secondHighest(i));
    }

    public static int secondHighest(String s) {

        // Step1 - Create set to store the digits
        Set<Integer> set = new TreeSet<>();

        // Step2 - Traverse the string character by character
        for (int i=0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (!Character.isDigit(character))
                continue;

            set.add(Character.getNumericValue(character));
        }

        // Find the the secondHighest from the list
        List<Integer> list = new ArrayList<>(set);
        System.out.println("list: " + list);

        return list.size() > 1 ? list.get(list.size() - 2) : -1;
    }
}
