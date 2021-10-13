package Strings.ExcelSheetColumnNum;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNum {

    public static void main(String [] args) {
        // ABC=731
        // AAA=703
        String [] input = { "ABC", "FXSHRXW", "AB", "ZY"};
        for (String i : input)
            System.out.println("Title To Number: " + titleToNumber(i));

    }

    public static int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        map.put('I', 9);
        map.put('J', 10);
        map.put('K', 11);
        map.put('L', 12);
        map.put('M', 13);
        map.put('N', 14);
        map.put('O', 15);
        map.put('P', 16);
        map.put('Q', 17);
        map.put('R', 18);
        map.put('S', 19);
        map.put('T', 20);
        map.put('U', 21);
        map.put('V', 22);
        map.put('W', 23);
        map.put('X', 24);
        map.put('Y', 25);
        map.put('Z', 26);

        int num = 0;

        // Step1 - Traverse string from left to right
        for (int i=0; i < columnTitle.length(); i++) {
            char letter = columnTitle.charAt(i);
            int numericValue = map.get(letter);

            // Find num using formula
            // Formula: ABC = A(1X26X26) + B(2X26) + C(3) = 731
            num += numericValue * Math.pow(26, (columnTitle.length() - 1) - i);


            System.out.println("letter: " + letter + "  num: " + num);
        }

        return num;
    }
}
