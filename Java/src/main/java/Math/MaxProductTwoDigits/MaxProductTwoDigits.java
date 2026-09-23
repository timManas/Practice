package Math.MaxProductTwoDigits;

import java.util.Arrays;

public class MaxProductTwoDigits {
    public static void main(String [] args) {
        int [] input = {31, 22, 124};
        for (int i : input)
            System.out.println("maxProduct: " + maxProduct(i) + "\n");
    }

    public static int maxProduct(int n) {
        String [] digitArr = String.valueOf(n).split("");
        Arrays.sort(digitArr);

        return Integer.valueOf(digitArr[digitArr.length-1]) * Integer.valueOf(digitArr[digitArr.length-2]);
    }
}
