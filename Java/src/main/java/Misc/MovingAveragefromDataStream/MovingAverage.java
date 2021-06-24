package Misc.MovingAveragefromDataStream;

import java.util.Deque;
import java.util.LinkedList;

public class MovingAverage {

    private int size;
    private double total;
    private Deque<Integer> queue;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        this.total = 0;
        queue = new LinkedList<>();
    }

    public double next(int val) {

        // Step1 - If Queue size is smaller
        if (queue.size() < size) {
            queue.addLast(val);
            total += val;

            return  total / queue.size();
        }

        // Step2 - If Queue size is bigger, remove the first element then insert new one
        int removed = queue.removeFirst();
        total -= removed;

        queue.addLast(val);
        total += val;

        return total / size;
    }
}
