package Strings.ReverseDegreeString;

import java.nio.charset.StandardCharsets;

public class ReverseDegreeString {

    public static void main(String [] args) {
        String [] input = {"abc", "zaza", "m", "n"};
        for (String i : input)
            System.out.println("reverseDegree: " + reverseDegree(i) + "\n");
    }

    public static int reverseDegree(String s) {
        int reverseDeg = 0;

        for (int i=0; i < s.length(); i++) {
            char character = s.charAt(i);
            int charLetter = (int) character - 96;
            int inverse = 27 - charLetter;
            System.out.println("character: " + character + "    charLetter: " + charLetter + "      inverse: " + inverse);

            reverseDeg += inverse *  (1+i);

        }

        return reverseDeg;
    }
}

 /*
26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1
 a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
 1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26


  */