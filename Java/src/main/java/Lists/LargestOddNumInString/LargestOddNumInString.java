package Lists.LargestOddNumInString;

import java.text.NumberFormat;

public class LargestOddNumInString {

    public static void main(String [] args) {
        String [] input = {"52", "4206", "35427", "239537672423884969653287101"};
        for (String i : input)
            System.out.println("LargestOddNumber: " + largestOddNumber(i));

//        System.out.println("LargestOddNumber: " + largestOddNumber("239537672423884969653287101"));
    }

    public static String largestOddNumber(String num) {

        // Step1 - Need this to check for ultra massive # like the one above
        if (!num.contains("1") && !num.contains("3") && !num.contains("5") && !num.contains("7") && !num.contains("9"))
            return "";

        // Step2 - Create variable to store float number and string of largestNumber
        float largestOddNumber = -1;
        String largestOddNumberString = "";

        // Step3 - Create iterators to traverse front and back
        int start = 0;
        int end = num.length() - 1;

        // Step4 - Traverse array from front and back
        while (start < num.length() && end >= 0) {

            // Step5 - Get the left and right substring
            String left = num.substring(start);
            String right = num.substring(0, end + 1);

            // Step6 - Get the float
            float floatLeft = Float.parseFloat(left);
            float floatRight = Float.parseFloat(right);

            // Step7 - Get the last digit of each string to check if odd or even
            int lastDigitLeft = left.charAt(left.length()-1);
            int lastDigitRight = right.charAt(right.length()-1);

            System.out.println("left: " + floatLeft + "    right: " + floatRight);

            // Step8 - Check Left and Right
            if (lastDigitLeft % 2 == 1 && largestOddNumber < floatLeft) {
                largestOddNumber = floatLeft;
                largestOddNumberString = left;

            }
            if (lastDigitRight % 2 == 1 && largestOddNumber < floatRight) {
                largestOddNumber = floatRight;
                largestOddNumberString = right;
            }

            // Step9 - Check if number changed, if so return that
            if (largestOddNumber != -1) {
                return largestOddNumberString;
            }
            start++;
            end--;
        }


        return "";
    }
}
