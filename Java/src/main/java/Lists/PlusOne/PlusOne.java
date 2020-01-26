package Lists.PlusOne;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {


    public static void main(String [] args) {
        int [] input = {9,8,7,6,5,4,3,2,1,0};
        int [] output = plusOne(input);
        for (int i : output)
            System.out.println(i);
    }

    public static int[] plusOne(int[] digits) {

        StringBuilder sb = new StringBuilder();
        for (int i : digits) {
            sb.append(i);
        }
        System.out.println("Input:" + sb.toString());
        BigInteger inputBN = new BigInteger(sb.toString());
        inputBN = inputBN.add(BigInteger.valueOf(1));
        System.out.println("Output:" + inputBN);
        sb = new StringBuilder(String.valueOf(inputBN));

        int [] plueOneArr = new int [sb.length()];
        for (int i=0; i < sb.length(); i++) {
            int number = Character.getNumericValue(sb.toString().charAt(i));
            plueOneArr[i] = number;
        }

        return plueOneArr;
    }

}
