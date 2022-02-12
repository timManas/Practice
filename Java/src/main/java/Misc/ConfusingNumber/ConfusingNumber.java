package Misc.ConfusingNumber;

public class ConfusingNumber {
    public static void main(String [] args) {
        int [] input = {12, 6, 89, 11};
        for (int i : input)
            System.out.println("Confusing Number: " + confusingNumber(i) + "\n");
    }

    public static boolean confusingNumber(int n) {
        // Step1 - Convert n to string value
        String strNum = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        // Step2 - Traverse string one by one
        for (int i=0; i<strNum.length();i++) {
            char digit = strNum.charAt(i);
            if (digit == '2' || digit == '3' || digit == '4' || digit == '5' || digit == '7')
                return false;

            switch (digit) {
                case '0': {
                    sb.append('0');
                    break;
                }
                case '1': {
                    sb.append('1');
                    break;
                }
                case '6': {
                    sb.append('9');
                    break;
                }
                case '8': {
                    sb.append('8');
                    break;
                }
                case '9': {
                    sb.append('6');
                    break;
                }
            }
        }


        // Flip the string builder to find the 180 degree flip
        return !strNum.equalsIgnoreCase(sb.reverse().toString());
    }
}
