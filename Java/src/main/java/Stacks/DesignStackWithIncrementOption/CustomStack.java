package Stacks.DesignStackWithIncrementOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CustomStack {

    List<Integer> stack;
    int maxSize;
    int topIndex;

    public CustomStack(int maxSize) {
        stack = new ArrayList<>();
        this.maxSize = maxSize;
        topIndex = -1;                      // Set the topindex to -1;
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.add(x);
            topIndex++;                 // Dont forget to incrememnt the topIndex when we add
        }
    }

    public int pop() {

        if (stack.size() <= 0)
            return -1;

        int top = stack.remove(topIndex);
        topIndex--;                         // Dont forget to decremement the topIndex everytime we pop

        return top;
    }

    public void increment(int k, int val) {

        for (int i=0; i < stack.size(); i++) {

            // Check if index is Below # of elements to modify "k"
            // If Greater, we return
            if (k < i + 1)
                break;

            stack.set(i, stack.get(i) + val);
        }
    }
}
