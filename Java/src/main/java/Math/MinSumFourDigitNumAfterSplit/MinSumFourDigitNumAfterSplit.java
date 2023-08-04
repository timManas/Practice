package Math.MinSumFourDigitNumAfterSplit;

import java.util.Arrays;

public class MinSumFourDigitNumAfterSplit {
    public static void main(String [] args) {
        int [] num = {2932, 4009};
        for (int i : num)
            System.out.println("Min Sum: " + minimumSum(i) + "\n");
    }

    public static int minimumSum(int num) {
        int sum = 0;

        // Split Number
        String numStr = String.valueOf(num);
        char [] numCharArr = numStr.toCharArray();

        // Sort number by value
        Arrays.sort(numCharArr);
        System.out.println("Sorted: " + numCharArr);

        // Place in proper Sequence
        int firstNum = Integer.parseInt(String.valueOf(numCharArr[0])) * 10 + Integer.parseInt(String.valueOf(numCharArr[2]));
        int secondNum = Integer.parseInt(String.valueOf(numCharArr[1])) * 10 + Integer.parseInt(String.valueOf(numCharArr[3]));

        // Find Min sum
        sum = firstNum + secondNum;

        return sum;
    }
}
