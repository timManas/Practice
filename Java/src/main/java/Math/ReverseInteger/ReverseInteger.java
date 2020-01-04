package Math.ReverseInteger;

public class ReverseInteger {

    public static void main(String [] args) {
        int input = 1534236469;
//        int input = -120;
        System.out.println("Input: " + input + "    Reverse: " + reverse(input));
    }

    public static int reverse(int x) {

        int reversed;

        // Step 1 - Check with Limits
        if (x >= Integer.MAX_VALUE ||  x <= Integer.MIN_VALUE)
            return 0;

        System.out.println("MaxValue: " + Integer.MAX_VALUE);
        System.out.println("MinValue: " + Integer.MIN_VALUE);
        System.out.println("CurrntValue: " + x);


        String strX = String.valueOf(x);
        boolean hasNegativeSign = strX.contains("-");
        if (hasNegativeSign)
            strX = strX.substring(1, strX.length());
        StringBuilder sb = new StringBuilder(strX);
        String reversedStrX = (hasNegativeSign ? "-": "") + sb.reverse();

        try {
            reversed = Integer.valueOf(reversedStrX);
        } catch (Exception e) {
            reversed = 0;
        }


        return reversed;
    }
}

/**

 Algorithm
 1. Check if has negative value
 2. Convert int to String
 3. Convert String to String builder
 4. Reverse using String builder
 5. Add sign back on
 6. Convert back to int


 */