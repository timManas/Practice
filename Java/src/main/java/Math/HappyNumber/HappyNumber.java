package Math.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String [] args) {
        System.out.println("IsHappyNum: " + isHappy(12));
    }

    public static boolean isHappy(int n) {

        // Step1 - Create a set to keep track of al the total values
        Set<Integer> set = new HashSet<>();

        // Step2 - Create a var to keep track of the current Calculated value
        int currentVal = n;


        // Step3 - Traverse through list
        outerLopp:
        while (true) {

            // Step4 - Initialize total to zero
            int total = 0;

            // Step5 - Convert number to single digit and travesrse
            String[] arr =  String.valueOf(currentVal).split("");
            for (String letter : arr) {
                // Ccaluclate the total
                total += Math.pow(Integer.valueOf(letter), 2);
            }
            System.out.println(total);

            // If total already exists in the set, we are stuck in an infinite loop
            if (set.contains(total))
                break;

            // Add total to set
            set.add(total);

            // Step 6 - Set new currentValue to total
            currentVal = total;
        }

        // If set contains 1, means it is happy number
        // wHY ? Loop will always go to one if Happy number
        return set.contains(1);
    }


}
