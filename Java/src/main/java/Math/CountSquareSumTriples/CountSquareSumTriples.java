package Math.CountSquareSumTriples;

import java.util.Deque;
import java.util.LinkedList;

public class CountSquareSumTriples {
    public static void main(String [] args) {
        int [] input = {5 , 10};
        for (int i : input)
            System.out.println("Count Triples: " + countTriples(i));
    }

    public static int countTriples(int n) {
        int count = 0;
        int current = 1;

        int sum = 0;
        Deque<Integer> queue = new LinkedList<>();
        while(current <= n) {
            // Remove the first Element
            if (queue.size() >= 3) {
                int last = queue.removeFirst();
                sum -= last*last;
            }

            queue.addLast(current);

            if (sum == (current * current)) {
                count += 2;
                System.out.println("SquareTripple Found: " + queue);
            }

            sum += (current * current);




            System.out.println("Current: " + current + "    sum: " + sum + "   Queue: " + queue);

            current++;
        }

        return count;
    }
}
