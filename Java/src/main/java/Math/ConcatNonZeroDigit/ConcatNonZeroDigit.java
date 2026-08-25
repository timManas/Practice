package Math.ConcatNonZeroDigit;

import java.math.BigDecimal;

public class ConcatNonZeroDigit {

    public static void main(String [] args) {
        int [] input = {10203004, 1000, 0, 65463628};
        for (int i : input)
            System.out.println("Sum: " + sumAndMultiply(i) + "\n");
    }

    public static long sumAndMultiply(int n) {
        int sum = 0;
        StringBuilder strVal = new StringBuilder();

        if (n == 0)
            return n;

        for (char num : String.valueOf(n).toCharArray()) {
            int digit = Character.getNumericValue(num);
            System.out.println(digit);
            if (digit > 0) {
                strVal.append(num);
                sum += digit;
            }
        }


        long total = (long) sum * Long.valueOf(strVal.toString());
        return total;
    }
}
