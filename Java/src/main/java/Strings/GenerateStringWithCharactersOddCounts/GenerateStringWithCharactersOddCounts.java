package Strings.GenerateStringWithCharactersOddCounts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class GenerateStringWithCharactersOddCounts {

    public static void main(String [] args) {

        System.out.println("String: " + generateTheString(4));
    }

    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        int count = n;
        char letter = 'a';


        // Step 1 - Check if Odd or even
        if (n % 2 == 1) {       // Odd

            // Step1b - If odd - Append until last element
            while (count > 0) {
                sb.append(letter);
                --count;
            }


        } else {                // Even

            // Step 1b - If even - Append till second last then add 'b'
            while (count > 1) {
                sb.append(letter);
                --count;
            }

            // Step2 - Add new character 'b'
            sb.append(++letter);
        }

        
        return sb.toString();
    }

}

/**
 Solution:
 1. I hate this problem
 2. Find if Odd or Even
    > Odd - append to Stringbuilder
    > Even - append until second last element , then add 'b'
 3. Return
 */
