package Strings.StringCompression;


import java.util.Arrays;

public class StringCompression {

    public static void main(String [] args) {
        char [] input = {'a','a','b','b','c','c','c'};
        int output = compress(input);
        System.out.println("Size:" + output);
    }

    public static int compress(char[] chars) {
        int total = 0;

        char[] temp = new char[]{'2'};
        chars = Arrays.copyOf(chars, 3);


//        System.arraycopy(temp,0, chars, 0, chars.length);
//
        System.out.println();

        return  total;
    }
}
