package Stacks.ImplementStacksUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> queue;
    Queue<Integer> tempQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
        tempQueue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue.isEmpty()) {
            queue.add(x);
            return;
        }

        tempQueue = new LinkedList<Integer>(queue);
        queue.clear();
        queue.add(x);

        while (!tempQueue.isEmpty()) {
            int top = tempQueue.poll();
            queue.add(top);
        }
        System.out.println();
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}