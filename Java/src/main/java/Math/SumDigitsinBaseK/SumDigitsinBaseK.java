package Math.SumDigitsinBaseK;

public class SumDigitsinBaseK {
    public static void main (String [] args) {
        int n = 34;
        int k = 6;

        System.out.println("Sum Base: " + sumBase(n, k));
    }

    public static int sumBase(int n, int k) {
        int sum = 0;
        String number = Integer.toString(n, k);
        for (int i=0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        return sum;
    }
}
