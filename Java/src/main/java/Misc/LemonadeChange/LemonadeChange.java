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
            System.out.println("Initial Change: " + change);


            if (change > 0) {
                // Return Change to customer
                List<Integer> billList = new ArrayList<>(ledgerMap.keySet());
                for (int x=billList.size()-1; x >= 0; x--) {
                    int rounded = (change / billList.get(x)) * billList.get(x);
                    int billTotal = billList.get(x) * ledgerMap.get(billList.get(x));
                    int billsUsed = 0;
                    if (rounded > billTotal) {
                        billsUsed = (rounded / billList.get(x));
                    } else {
                        billsUsed = ledgerMap.get(billList.get(x));
                    }
                    ledgerMap.put(billList.get(x), billsUsed - 1);
                    change = change - (billsUsed * billList.get(x));
                    System.out.println("Change: " + change);
                }
            }


            // Add Bill to Ledger
            if (ledgerMap.containsKey(payment))
                ledgerMap.put(payment, ledgerMap.get(payment) + 1);
            else
                ledgerMap.put(payment,1);
            System.out.println("Ledger: " + ledgerMap);


            if (change != 0)
                return false;

        }

        return true;
    }
}
