package Lists.AddToArrayFormInteger;

import java.util.ArrayList;
import java.util.Arrays;
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
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> numList = new ArrayList<>();
        // Create remainder array
        int [] remainder = new int[num.length];
        Arrays.fill(remainder, 0);
        System.out.println("remainder:" + Arrays.toString(remainder));

        // Create k array
        int [] arrK = new int[remainder.length];
        String kStr = String.valueOf(k);
        int index = remainder.length - 1;
        for (int i=kStr.length()-1; i >= 0; i--) {
            int number = Character.getNumericValue(kStr.charAt(i));
            arrK[index--] = number;
        }
        System.out.println("arrK:" + Arrays.toString(arrK));

        return numList;
    }

}
