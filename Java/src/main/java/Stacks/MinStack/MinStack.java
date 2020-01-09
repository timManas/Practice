package Stacks.MinStack;

import java.util.ArrayList;

class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> sortedList;

    public MinStack() {
        stack = new ArrayList<Integer>();
        sortedList = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        int top = (!stack.isEmpty()) ? stack.get(stack.size() - 1) : 0;
        return top;
    }

    public int getMin() {
        int min = !stack.isEmpty() ? stack.get(0) : 0;
        for (int element : stack) {
            if (min > element)
                min = element;
        }
        return min;
    }
}

/**

    Design a STACK !
    -  Use an ArrayList which allows us to monitor the smallest value
        > But ...it constantly needs to look at  the array again for the smallest element =( O(n) time
    - Use an ArrayList with a TreeSet which monitors the element from smallest to largest
        > But what if theres duplicates ?


 */
