package Math.CountSortedVowels;

import java.util.*;

public class CountSortedVowels {

    public static void main(String [] args) {
        int [] input = {1,2,33};
        for (int i : input)
            System.out.println("count vol String: " + countVowelStrings(i) + "\n");
    }

    public static int countVowelStrings(int n) {

        // Step1 - Create Dynamic array to store prev
        int [] d = new int[n+1];
        d[0] = 0;
        d[1] = 5;

        if (n == 1) return 5;


        // Step2 = Create queue to pull elements from
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addFirst(1);
        queue.addFirst(1);
        queue.addFirst(1);
        queue.addFirst(1);
        queue.addFirst(1);

        // Step3 - Create tempQueue to store values
        Deque<Integer> tempQueue = new ArrayDeque<>();

        // Step4 - Traverse from 2 to n
        for (int i=2; i<=n; i++) {
            System.out.println("i: " + i);

            // Get the prev value
            int prev = d[i-1];          // we set the value to the last dynamic array value of i
            tempQueue.addFirst(prev);

            // Step5 - Keep pulling from queue until only 1 left. We dont care about the 1
            int total = prev;
            while (queue.size() > 1) {
                int temp = prev - queue.removeFirst();
                prev = temp;
                tempQueue.addLast(temp);
                total += prev;
            }


            // Step6 - Reset the queues by making the tempQueue the mainQueue and clear
            queue = new ArrayDeque<>(tempQueue);
            tempQueue.clear();

            // Step7 - Keep track of the total to store in the dp for the next iteration
            d[i] = total;
        }


        return d[n];
    }
}
