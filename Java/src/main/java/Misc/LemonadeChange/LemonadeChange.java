package Misc.LemonadeChange;

import java.util.*;

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

            // Return Change to customer
            List<Integer> billList = new ArrayList<>(ledgerMap.keySet());
            System.out.println("Bill List: " + billList);
            for (int j=billList.size()-1; j >= 0; j--) {
                change = ledgerMap[i] `
            }

            if (change != 0)
                return false;



            // Add Bill to Ledger
            if (ledgerMap.containsKey(payment))
                ledgerMap.put(payment, ledgerMap.get(payment) + 1);
            else
                ledgerMap.put(payment,1);
            System.out.println("Ledger: " + ledgerMap);






        }

        return true;
    }
}
