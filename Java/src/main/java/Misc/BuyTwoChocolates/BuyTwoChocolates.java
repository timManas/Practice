package Misc.BuyTwoChocolates;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main (String [] args) {
        int [] prices = {1,2,2};
        int money = 3;
        System.out.println("Remainder: " + buyChoco(prices, money) + "\n");


        int [] prices1 = {3,2,3};
        int money1 = 3;
        System.out.println("Remainder: " + buyChoco(prices1, money1) + "\n");

        int [] prices3 = {98,54,6,34,66,63,52,39};
        int money3 = 62;
        System.out.println("Remainder: " + buyChoco(prices3, money3) + "\n");

    }

    public static int buyChoco(int[] prices, int money) {
        int maximum = -1;
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

        for (int i=0; i<prices.length-1; i++) {
            int current = prices[i];
            int remainder = money - current;
            System.out.println("current: " + current + "    remainder: " + remainder);

            if (remainder < 0)
                break;


             for (int j=i+1; j < prices.length; j++) {
                int next = prices[j];
                System.out.println("    next: " + next);

                 if (next > remainder)
                    break;


                 maximum = maximum < money - (next + current) ? money - (next + current) : maximum;
                 System.out.println("       maximum: " + maximum);

             }

        }

        return maximum == -1 ? money : maximum;
    }
}
