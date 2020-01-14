package Queues.ImplementQueueUsingStack;

public class ImplementQueueMain {

    public static void main(String [] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.empty()); // returns false
    }

}
