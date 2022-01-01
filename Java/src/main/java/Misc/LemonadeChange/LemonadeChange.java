package Misc.LemonadeChange;

import java.util.Map;
import java.util.TreeMap;

public class LemonadeChange {
    public static void main(String [] args) {
        int [][] input = {{5,5,5,10,20}, {5,5,10,10,20}};
        for (int[] i : input)
            System.out.println("Lemonade Change: "  + lemonadeChange(i));
    }

    public static boolean lemonadeChange(int[] bills) {
        int cost = 5;

        Map<Integer, Integer> ledgerMap = new TreeMap<>();
        for (int i=0; i<bills.length; i++) {
            int payment = bills[i];
            int change = payment - cost;






        }

        return true;
    }
}
