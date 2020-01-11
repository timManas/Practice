package Stacks.MaxStack;

import java.util.*;

public class MaxStack {

    Stack <Integer> stack;
    ArrayList<Integer> orderList;


    public MaxStack() {
        stack = new Stack<Integer>();
        orderList = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        orderList.add(x);
        Collections.sort(orderList);
    }

    public int pop() {
        int pop = stack.pop();
        orderList.remove(orderList.indexOf(pop));
        return pop;
    }

    public int top() {
        return  stack.peek();
    }

    public int peekMax() {
        return orderList.get(orderList.size() - 1);
    }

    public int popMax() {
        Stack tempStack = new Stack();
        int max = orderList.get(orderList.size() - 1);
        orderList.remove(orderList.indexOf(max));
        boolean isMax = false;

        int currentTopValue;
        while (!isMax) {
            currentTopValue = stack.pop();

            if (currentTopValue == max)
                break;

            tempStack.push(currentTopValue);
        }

        while (!tempStack.isEmpty())
            stack.push((Integer) tempStack.pop());

        return max;

    }

}
