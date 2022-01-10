package Strings.AddTwoStrings;

import java.util.Arrays;

public class AddTwoString {

    public static void main(String [] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));

        String num3 = "456";
        String num4 = "77";
        System.out.println(addStrings(num3, num4));

        String num5 = "0";
        String num6 = "0";
        System.out.println(addStrings(num5, num6));

        String num7 = "1";
        String num8 = "9";
        System.out.println(addStrings(num7, num8));
    }

    public static String addStrings(String num1, String num2) {

        // Step1 - Create outputArray and Carry Array and initialize to 0
        int [] output = new int [Math.max(num1.length(), num2.length()) + 1];
        int [] carry = new int[output.length];
        Arrays.fill(carry, 0);

        // Step2 - Create indexes
        int indexOutput = output.length - 1;
        int indexCarry = carry.length - 1;
        int index1 = num1.length() - 1;
        int index2 = num2.length() - 1;

        // Step3 - Traverse num1 and num2
        while (index1 >= 0 || index2 >= 0) {

            // Step4 - Take number individually and convert to int using " num1.charAt(x) - '0'"
            int num1Int = index1 >= 0 ? num1.charAt(index1) - '0' : 0;
            int num2Int = index2 >= 0 ? num2.charAt(index2) - '0' : 0;

            // Step5 - Calculate the total and the carryOver
            int total = num1Int + num2Int + carry[indexCarry];
            int carryOver = total >= 10 ? 1 : 0;

            // Step6 - Update the output and carry over Array
            output[indexOutput] = total >= 10 ? total - 10 : total;

            // Step7 - Check if index is within bounds
            if (indexCarry - 1 >= 0) {
                carry[indexCarry - 1] = carryOver;

                // Step6b - If there is a carry over, update the output array
                if (indexCarry - 1 == 0)
                    output[0] = carryOver;
            }



            System.out.println("num1: " + num1Int + "   num2: " + num2Int + "   Total: " + total  + "     carryOver: " + carryOver +  "   single: " + output[indexOutput]);
            // Step8 - Update counters
            --index1;
            --index2;
            --indexCarry;
            --indexOutput;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : output) sb.append(i);
        if (sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.toString();
    }

}


/**

 Solutions
    1. Have to use Traditional Addition


 */