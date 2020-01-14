package Queues.ImplementQueueUsingStack;

import java.util.Stack;

class MyQueue {

    Stack<Integer> mainStack;
    Stack<Integer> tempStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        mainStack = new Stack<Integer>();
        tempStack = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        if (mainStack.isEmpty()) {
            mainStack.push(x);
            return;
        }

        // Place everything in Main into Temp
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }

        // Push the Element
        tempStack.push(x);

        // Place temp back into Main
        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return mainStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        int peek = mainStack.peek();
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mainStack.isEmpty();
    }
}