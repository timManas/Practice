package Strings.SumDigitsStrungAfterConvert;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SumDigitsStrungAfterConvert {

    public static void main(String [] args) {
        String s = "iiii";
        int k = 1;
        System.out.println("Get Lucky: " + getLucky(s, k) + "\n");

        s = "leetcode";
        k = 2;
        System.out.println("Get Lucky: " + getLucky(s, k) + "\n");

        s = "zbax";
        k = 2;
        System.out.println("Get Lucky: " + getLucky(s, k) + "\n");
    }

    public static int getLucky(String s, int k) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String [] strArr = s.split("");
        StringBuilder sb = new StringBuilder();

        // Convert to numeric value
        for (int i=0; i<strArr.length; i++) {
            sb.append(str.indexOf(s.charAt(i)) + 1);
        }
        System.out.println(sb);


        int total = 0;
        while (k > 0) {
            total = 0;
            for (int i=0; i<sb.length(); i++) {
                int number = Character.getNumericValue(sb.charAt(i));
                total += number;
            }

            // Reset
            sb = new StringBuilder();
            sb.append(total);

            k--;
        }


        return total;
    }
}
