package Lists.LargestOddNumInString;

import java.text.NumberFormat;

public class LargestOddNumInString {

    public static void main(String [] args) {
        String [] input = {"239537672423884969653287101"};
        for (String i : input)
            System.out.println("LargestOddNumber: " + largestOddNumber(i));
    }

    public static String largestOddNumber(String num) {

        double largestOddNumber = -1;

        int start = 0;
        int end = num.length() - 1;

        while (start < num.length() && end >= 0) {
            double left = Double.parseDouble(num.substring(start, num.length()));
            double right = Double.parseDouble(num.substring(0, end + 1));

            System.out.println("left: " + left + "    right: " + right);

            if (left % 2 == 1)
                largestOddNumber = largestOddNumber < left ? left : largestOddNumber;
            if (right % 2 == 1)
                largestOddNumber = largestOddNumber < right ? right : largestOddNumber;


            if (largestOddNumber != -1) {
                String output = String.format("%.0f", largestOddNumber);

                return output;
            }
            start++;
            end--;
        }


        return "";
    }
}
