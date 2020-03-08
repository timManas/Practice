package Lists.Maximum69;

public class Maximum69 {

    public static void main(String [] args) {

        int [] numsList = {9669, 9996, 9999};
        for (int i : numsList)
            System.out.println("Num: " + i + "      Maximum Number: " + maximum69Number(i));

    }

    public static int maximum69Number (int num) {
        int max = num;
        String numStr = String.valueOf(num);
        StringBuilder stringBuilder;

        // Step2 - Traverse the num, for every single character
        for (int i=0; i < numStr.length(); i++) {

            // Step3 - Reset the sb to the original
            stringBuilder = new StringBuilder(numStr);

            // Step4 - fetch digit to modify
            char digit = stringBuilder.charAt(i);

            // Step5 - Flip the digit to 6 or 9
            String value = "";
            if (digit == '6')
                value = "9";
            else if (digit == '9')
                value = "6";

            // Step6 - Insert flipped value back to SB
            stringBuilder = stringBuilder.replace(i, i+1, value);

            // Step7 - Fetch new number with flipped
            int modifiedNum = Integer.valueOf(stringBuilder.toString());
            System.out.println("Original: " + num + "   Modfied: " + modifiedNum);

            // Check max
            max = Math.max(max, modifiedNum);
        }
        return max;
    }
}

/**
 Solution
 0. Traverse through num in the form of a string
 1. Use SB to fetch value on the string
 2. Flip respective character
 3. Get the new value
 4. compare it new value to the current max value
 5. return max value
 */
