package Math.ThreeDivisors;

public class ThreeDivisors {

    public static void main(String [] args) {
        int [] input = {13};
        for (int i : input)
            System.out.println("Has Three Divisors ? " + isThree(i));
    }

    public static boolean isThree(int n) {
        // Step1 - Check if number is less than 2
        if (n <= 2)
            return false;

        // Step2 - Create variables for left, right, numOfDivisors
        int numDivisors = 0;
        int leftElement = 1;
        int rightElement = n;

        // Step3 - Start from both sides until they meet in the middle
        while (leftElement < rightElement) {

            // Step4 - Check if num divisors is greater than 3
            if (numDivisors > 3)
                return false;

            // Step5 - Incmrent and Decrement counters
            if (n % leftElement == 0)
                numDivisors++;
            if (n % rightElement == 0)
                numDivisors++;

            leftElement++;
            rightElement--;
        }



        return numDivisors == 3;
    }
}
