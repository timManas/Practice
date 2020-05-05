package Queues.DesignBoundedBlockQueue;

public class DesignBoundedBlockQueue {

    public static void main(String [] args) throws InterruptedException {
        BoundedBlockingQueue queue = new BoundedBlockingQueue(2);   // initialize the queue with capacity = 2.

        queue.enqueue(1);   // The producer thread enqueues 1 to the queue.
        System.out.println(queue.dequeue());    // The consumer thread calls dequeue and returns 1 from the queue.
        System.out.println(queue.dequeue());    // Since the queue is empty, the consumer thread is blocked.
        queue.enqueue(0);   // The producer thread enqueues 0 to the queue. The consumer thread is unblocked and returns 0 from the queue.
        queue.enqueue(2);   // The producer thread enqueues 2 to the queue.
        queue.enqueue(3);   // The producer thread enqueues 3 to the queue.
        queue.enqueue(4);   // The producer thread is blocked because the queue's capacity (2) is reached.
        System.out.println(queue.dequeue());    // The consumer thread returns 2 from the queue. The producer thread is unblocked and enqueues 4 to the queue.
        System.out.println(queue.size());       // 2 elements remaining in the queue. size() is always called at the end of each test case.
    }
}

/**
 Note:
 - This main class does nothing ... You would need two threads to test this
 - In order to see it working, you need to go on Leetcode and run this.


 */
