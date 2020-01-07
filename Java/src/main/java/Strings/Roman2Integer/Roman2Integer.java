package Strings.Roman2Integer;

import java.util.ArrayList;
import java.util.HashMap;

public class Roman2Integer {

    public static void main(String [] args) {
//        String input = "MCMXCIV";
//        String input = "IV";
        String input = "VIII";

        System.out.println("Integer: " + romanToInt(input));
    }

    public static int romanToInt(String roman) {
        int integer = 0;
        HashMap<Character, Integer> symbolMap = new HashMap<Character, Integer>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
        ArrayList<String> numberList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        // Step #1 - Get the different groups of roman numerals
        char [] charArr = roman.toCharArray();
        char prev = 0;
        for (int i=0; i < charArr.length; i++) {
            char character = charArr[i];

            if (prev != 0 && isPrevLarger(symbolMap, prev, character)) {
                numberList.add(sb.toString());
                sb = new StringBuilder(character);       // Restart it again
            }

            sb.append(character);
            prev = character;
        }
        numberList.add(sb.toString());      // Dont forget the last one


        // Step #2 - Add up the Total
        System.out.println("Numberlist: " + numberList);
        for (String romanNums : numberList) {
            integer += getInteger(symbolMap, romanNums);
        }

        return integer;
    }


    private static int getInteger(HashMap<Character, Integer> symbolMap, String romanNums) {
        int number = 0;
        char [] romanArr = romanNums.toCharArray();
        char prevRoman = 0;
        for (char letter : romanArr) {


            if (prevRoman == 0) {
                number += symbolMap.get(letter);
            } else {
                if (isPrevLarger(symbolMap, prevRoman, letter))
                    number += symbolMap.get(letter);
                else
                    number -= symbolMap.get(letter);
            }

            prevRoman = letter;
        }
        System.out.println("Romannum: " + romanNums + "     Number: " + number);
        if (number < 0) {
            number = Math.abs(number);
        }
        return number;

    }

    private static boolean isPrevLarger(HashMap<Character, Integer> symbolMap, char prev, char character) {
        if (symbolMap.get(character) <= symbolMap.get(prev))
            return true;

        return false;
    }
}
