package Misc.LemonadeChange;

import java.util.*;

public class LemonadeChange {
    public static void main(String [] args) {
        int [][] input = {{5,5,5,10,5,5,10,20,20,20},{5,5,5,10,5,20,5,10,5,20},{5,5,10,10,20}, {5,5,5,10,20}};
        for (int[] i : input)
            System.out.println("Lemonade Change: "  + lemonadeChange(i) + "\n");
    }

    public static boolean lemonadeChange(int[] bills) {
        int cost = 5;

        // Step1 - Create Map to store the bill count
        Map<Integer, Integer> ledgerMap = new TreeMap<>();

        // Step2 - Traverse through bills paid
        for (int i=0; i<bills.length; i++) {
            int payment = bills[i];
            int change = payment - cost;
            System.out.println("Initial Change: " + change);

            // Step3 - Check if there is change required to be given back to customer
            if (change > 0) {

                // Step4 - Traverse the billsList DESCENDING
                List<Integer> billList = new ArrayList<>(ledgerMap.keySet());
                for (int x=billList.size()-1; x >= 0; x--) {

                    // Step5 - Check if there are enough bills to do anything first
                    if (ledgerMap.get(billList.get(x)) <= 0) {
                        if (x == billList.size() - 1) {
                            return false;
                        } else {
                            continue;
                        }
                    }

                    int rounded = (change / billList.get(x)) * billList.get(x);
                    int billsUsed = (rounded / billList.get(x));
                    int remainingBills = ledgerMap.get(billList.get(x)) - billsUsed;

                    // Step6 - Check if remainingBills does NOT fall into the negative (i.e we dont have enough)
                    if (remainingBills < 0)
                        return false;

                    // Step7 - Update Ledger
                    ledgerMap.put(billList.get(x), remainingBills);
                    change = change - (billsUsed * billList.get(x));
                    System.out.println("Change: " + change);
                }
            }


            // Step8 - Add Bill to Ledger
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
