package Math.MaximumProd3Numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class MaximumProduct3Nums {

    public static void main(String [] args) {
        int [] nums = {-1,-2,1,2,3};
        System.out.println("MaxProduct: " + maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : nums)
            list.add(i);

        Collections.sort(list);
        Collections.reverse(list);

        BigInteger bigInteger = BigInteger.valueOf(list.get(0));
        for (int i=1; i < 3; i++) {
            BigInteger currentInteger = BigInteger.valueOf(list.get(i));
            bigInteger = bigInteger.multiply(currentInteger);
        }

        return Integer.valueOf(bigInteger.toString());
    }
}
