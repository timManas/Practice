package Strings.FindCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String [] args) {
        String [] input = {"bella","label","roller"};
//        String [] input = {"cool","lock","cook"};
        List <String> output = commonChars(input);
        System.out.println(output);

    }

    public  static List<String> commonChars(String[] input) {
        List<String> list = new ArrayList<String>();

        // Step1 - Find the longest String
        String longestStr = "";
        for (String str : input) {
            if (str.length() > longestStr.length())
                longestStr = str;
        }
        System.out.println("Longest: " + longestStr);

        // Step2 - Convert Longest Str to Char Array to Traverse
        char [] lngCharArr = longestStr.toCharArray();

        // Step3 - Traverse each letter in lognest String
        // For each letter, traverse all words in input file
        // If match occurs in all letters in input array, then we replace those with '\u0000'
        // Add character to list
        charLoop:
        for (char character : lngCharArr) {

            // Step 3b - Traverse each word in input Array
            wordLoop:
            for (String word : input) {
                if (word.indexOf(character) == -1) {            // If character does not exists, we move on
                    continue charLoop;
                }
            }

            System.out.println("CommonString: " + character);
            list.add(String.valueOf(character));

            for (int i=0; i < input.length; i++) {
                input[i] = input[i].replaceFirst(String.valueOf(character), "\u0000");
                System.out.println("Replaced: " + input[i]);
            }

        }

        return list;
    }
}
