package Misc.ZigzagConversion.Misc;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String [] args) {
       String s = "PAYPALISHIRING";
       int numRows = 3;
       System.out.println("Converted: " + convert(s, numRows));

        String s1 = "PAYPALISHIRING";
        int numRows1 = 4;
        System.out.println("Converted: " + convert(s1, numRows1));
    }

    public static String convert(String s, int numRows) {

        List<List<String>> list = new ArrayList<>();

        for (char letter : s.toCharArray()) {

        }

        return "";
    }
}
