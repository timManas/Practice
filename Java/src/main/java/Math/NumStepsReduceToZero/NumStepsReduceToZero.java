package Math.NumStepsReduceToZero;

public class NumStepsReduceToZero {

    public static void main (String [] args) {
        int num = 8;
        System.out.println("NumSteps: " + numberOfSteps(num));
    }

    public static int numberOfSteps (int num) {
        int count = 0;
        while (num > 0) {
            ++count;
            // Even
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }

        return count;
    }

}


/**
 Solution
 - Just a while loop
 - keep a counter to track # of iterations
 - Reduce by checking if odd or even using modularator
 */
