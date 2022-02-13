package Lists.AddToArrayFormInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormInteger {
    public static void main(String [] args) {
        int [] num = {1,2,0,0};
        int k = 34;
        System.out.println("Add to Array form: " + addToArrayForm(num, k));

        int [] num1 = {2,7,4};
        int k1 = 181;
        System.out.println("Add to Array form: " + addToArrayForm(num1, k1));

        int [] num2 = {2,1,5};
        int k2 = 806;
        System.out.println("Add to Array form: " + addToArrayForm(num2, k2));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        String intNum = Arrays.toString(num);
        System.out.println(intNum);


        return list;
    }

}
