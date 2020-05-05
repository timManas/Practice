package Queues.DesignBoundedBlockQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBlockingQueue {

    private ReentrantLock lock = new ReentrantLock();
    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    private Deque<Integer> queue;
    private int maxCapaxity;

    public BoundedBlockingQueue(int capacity) {
        this.queue = new LinkedList<>();
        this.maxCapaxity = capacity;
    }

    /**
     * We use lock/unlock to ensure only one thread happens at one time
     *
     */
    public void enqueue(int element) throws InterruptedException {
        lock.lock();

        try {
            while (size() == maxCapaxity) {
                notFull.await();
            }
            queue.add(element);
            notEmpty.signalAll();

        } finally {
            lock.unlock();
        }

    }

    public int dequeue() throws InterruptedException {
        lock.lock();
        int first;
        try {

            while (queue.size() == 0) {
                notEmpty.await();
            }
            first = queue.removeFirst();
            notFull.signalAll();


        } finally {
            lock.unlock();
        }

        return first;
    }

    public int size(){
        lock.lock();

        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }
}

/**
 Solution
 - Very very tricky ... Still did not solve it. Need alot of help on this one
 - We have a Reentrant lock which has two conditions inside of it ...notFull & notEmpty
    > When queue is empty, we block thread and add thread to empty waiting list
    > When queue is full, we block thread and add thread to full waiting list
    Why ??? So the order gets preserved of who gets to enqueue/dequeue when they are blocked

 */
