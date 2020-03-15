package Math.SumOfDigits;

public class SumOfDigits {
    public static void main(String [] args) {
//        int [] input = {99,77,33,66,55};
        int [] input = {34,23,1,24,75,33,54,8};
        System.out.println("SumOfDigitsBoolean: " + sumOfDigits(input));
    }

    public static int sumOfDigits(int[] A) {
        int smallest = Integer.MAX_VALUE;

        // Fetch the smallest value
        for (int number : A) {
            smallest = Math.min(smallest, number);
        }

        String numStr = String.valueOf(smallest);
        int count = 0;
        for (int i=0; i < numStr.length(); i++) {
            count += Integer.valueOf(numStr.charAt(i));
        }

        return count % 2 == 0 ? 1 : 0;
    }
}
