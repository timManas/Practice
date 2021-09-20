package Math.NthTribonacciNumber;

import java.util.ArrayList;
import java.util.List;

public class NthTribonacciNumber {

    public static void main(String [] args) {
        int [] input = {4,25};
        for (int i : input)
            System.out.println("Tribonacci Num: " + tribonacci(i));
    }

    public static int tribonacci(int n) {
        // Step1 - Initialize the list
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);

        // Step2 - Traverse list
        for (int i=3; i <= n; i++) {
            int lastElement = list.get(list.size()-1);
            int secondLastElement = list.get(list.size()-2);
            int thirdLastElement = list.get(list.size()-3);

            // Step3 - Add current tribonacci element to list
            list.add(lastElement + secondLastElement + thirdLastElement);
        }

        return list.get(n);
    }
}
