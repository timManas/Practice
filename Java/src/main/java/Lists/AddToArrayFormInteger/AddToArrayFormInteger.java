package Lists.AddToArrayFormInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormInteger {
    public static void main(String [] args) {
        int [] num = {1,2,0,0};
        int k = 34;
        System.out.println("Add to Array form: " + addToArrayForm(num, k) + "\n");

        int [] num1 = {2,7,4};
        int k1 = 181;
        System.out.println("Add to Array form: " + addToArrayForm(num1, k1) + "\n");

        int [] num2 = {2,1,5};
        int k2 = 806;
        System.out.println("Add to Array form: " + addToArrayForm(num2, k2) + "\n");

        int [] num3 = {9,9,9,9,9,9,9,9,9,9};
        int k3 = 1;
        System.out.println("Add to Array form: " + addToArrayForm(num3, k3) + "\n");

        int [] num4 = {0};
        int k4 = 23;
        System.out.println("Add to Array form: " + addToArrayForm(num4, k4) + "\n");
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        System.out.println("Original num: " + Arrays.toString(num));
        // Step1 - Create output variable
        List<Integer> numList = new ArrayList<>();

        // Step2 - Increase the size of num if it is smaller than k. The point is both to be roughly the same size
        String kStr = String.valueOf(k);
        if (num.length < kStr.length()) {
            int [] temp = new int[kStr.length()];
            Arrays.fill(temp, 0);
            int tempIndex = temp.length - 1;
            for (int i=num.length-1; i >= 0; i--) {
                temp[tempIndex--] = num[i];
            }
            num = temp;
            System.out.println("num: " + Arrays.toString(num));
        }

        // Step3 - Create k array
        int [] arrK = new int[num.length];
        int index = num.length - 1;
        for (int i=kStr.length()-1; i >= 0; i--) {
            int number = Character.getNumericValue(kStr.charAt(i));
            arrK[index--] = number;
        }
        System.out.println("arrK:" + Arrays.toString(arrK));

        // Step4 - Create remainder array
        int [] remainder = new int[num.length];
        Arrays.fill(remainder, 0);
        System.out.println("remainder:" + Arrays.toString(remainder));

        // Step5 - Perform the Addition
        for (int i=num.length-1; i >=0; i--) {
            int currentNum = num[i];
            int currentK = arrK[i];
            int rem = remainder[i];

            int total = currentNum + currentK + rem;
            int nextRem = total > 9 ? 1 : 0;

            numList.add(total % 10);

            if (i == 0) {
                if (nextRem == 1)
                    numList.add(nextRem);
            } else {
                remainder[i - 1] = nextRem;
            }
        }
        Collections.reverse(numList);
        System.out.println("Addition: " + numList);

        return numList;
    }

}
