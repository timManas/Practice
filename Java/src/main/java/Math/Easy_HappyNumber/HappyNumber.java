package Math.Easy_HappyNumber;

import java.util.*;

public class HappyNumber {

    public static void main(String [] args) {
        int input = 7;
        System.out.println("Happy Number: " + isHappy(input));
    }

    public static boolean isHappy(int num) {

        Set<Integer> hashSet = new HashSet<Integer>();
        return implementIsHappy(num, hashSet);
    }

    private static boolean implementIsHappy(int num, Set<Integer> hashSet) {
        int temp = num;

        // Step #1 - Fetch individual #
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        int total = 0;
        while (temp > 0) {
            int value = temp % 10;
            temp = temp / 10;
            System.out.println("Num: " + num + "    Digit:" + value);
            digitList.add(value);
        }

        for (int digit : digitList) {
            total = total + (int) Math.pow(digit, 2);
        }

        if (hashSet.contains(total))
            return false;

        hashSet.add(total);
        if (total == 1) {
            return true;
        }

        return implementIsHappy(total, hashSet);

    }
}
