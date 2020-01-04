package Strings.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String [] args) {

        int input = 15;
        System.out.println(fizzBuzz(input));
    }

    public static List<String> fizzBuzz(int input) {

        List<String> fizzBuzzList = new ArrayList<String>();

        for (int i=1; i <= input; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }

        return fizzBuzzList;
    }
}
