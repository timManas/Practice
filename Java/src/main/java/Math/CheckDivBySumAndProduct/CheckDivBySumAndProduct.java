package Math.CheckDivBySumAndProduct;

import java.util.ArrayList;
import java.util.List;

public class CheckDivBySumAndProduct {
    public static void main(String [] args) {
        int [] input = {99, 23, 108};
        for (int i : input) {
            System.out.println("Check Div: " + checkDivisibility(i) + "\n");
        }
    }

    public static boolean checkDivisibility(int n) {

        String numStr = String.valueOf(n);
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < numStr.length(); i++){
            char letter = numStr.charAt(i);
            list.add(Character.getNumericValue(letter));
        }

        System.out.println("list: " + list);

        int sum = -1;
        int product = -1;
        for (int i : list) {
            sum = sum == -1 ? i : sum + i;
            product = product == -1 ? i : product * i;
        }

        System.out.println("sum: " + sum + "    product: " + product);

        return n % (sum + product) == 0;
    }
}
