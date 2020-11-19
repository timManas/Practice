package Queues.DesignCircularQueue;

import java.util.LinkedList;

class MyCircularQueue {

    private LinkedList<Integer> circularQueue;
    private int MAX = 0;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.MAX = k;
        circularQueue = new LinkedList<>();
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (circularQueue.size() < MAX) {
            circularQueue.addLast(value);
            return true;
        }

        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (circularQueue.size() <= 0)
            return false;

        circularQueue.removeFirst();
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (circularQueue.size() > 0)
            return circularQueue.peekFirst();

        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (circularQueue.size() > 0)
            return circularQueue.peekLast();

        return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (circularQueue.size() == 0);
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (circularQueue.size() >= MAX);
    }
}