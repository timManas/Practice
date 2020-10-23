package Math.MaximumProd3Numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumProduct3Nums {

    public static void main(String [] args) {
        int [] nums = {-1,-2,1,2,3};
//        int [] nums = {1,2,3};
//        int [] nums = {-1,-2,-3};
//        int [] nums = {1,0,100};
        System.out.println("MaxProduct: " + maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {


        int max = 1;
        int remaining = 3;
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        List<Integer> posStack = new ArrayList<>();
        List<Integer> negStack = new ArrayList<>();

        for (int num : nums)
            if (num >= 0)
                posStack.add(num);
            else
                negStack.add(num);
        Collections.sort(posStack);
        Collections.sort(negStack);



        while (remaining != 0) {

            int leftNum = Math.abs(list.get(leftIndex));
            int rightNum = Math.abs(list.get(rightIndex));

            if (leftNum == 0) {
                leftIndex += 1;
                Math.abs(list.get(leftIndex));
            } else if (rightNum == 0) {
                rightIndex -= 1;
                Math.abs(list.get(rightIndex));
            }

            if (max < 0) {
                max *= list.get(leftIndex);
                leftIndex += 1;
            } else if (leftIndex == rightIndex) {
                max *= list.get(rightIndex);
                break;

            } else if (leftNum < rightNum) {
                max *= list.get(rightIndex);
                rightIndex -= 1;

            } else if (leftNum > rightNum) {
                max *= list.get(leftIndex);
                leftIndex += 1;
            } else if (leftNum == rightNum) {
                max += list.get(rightIndex);
                rightIndex -= 1;
            }

            remaining -= 1;
        }

        return max;
    }

//    public static int maximumProduct(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for (int i : nums)
//            list.add(i);
//
//        Collections.sort(list);
//        Collections.reverse(list);
//
//        BigInteger bigInteger = BigInteger.valueOf(list.get(0));
//        for (int i=1; i < 3; i++) {
//            BigInteger currentInteger = BigInteger.valueOf(list.get(i));
//            bigInteger = bigInteger.multiply(currentInteger);
//        }
//
//        return Integer.valueOf(bigInteger.toString());
//    }
}
