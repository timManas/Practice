package Strings.StringCompression;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String [] args) {
//        char [] input = {'a','a','b','b','c','c','c'};
//        char [] input = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] input = {'a','a','a','b','b','a','a'};          // ["a","3","b","2","a","2"]
        int output = compress(input);
        System.out.println("Size: " + output);
    }

    public static int compress(char[] inputArr) {
        int total = 0;
        if (inputArr.length == 1)
            return 1;



        return  total - 1;
    }
}
