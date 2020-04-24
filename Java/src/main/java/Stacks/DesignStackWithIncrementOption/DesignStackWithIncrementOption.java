package Stacks.DesignStackWithIncrementOption;

public class DesignStackWithIncrementOption {

    public static void main(String [] args) {
        CustomStack customStack = new CustomStack(3); // Stack is Empty []
        customStack.push(1);                          // stack becomes [1]
        customStack.push(2);                          // stack becomes [1, 2]
        System.out.println(customStack.pop());                            // return 2 --> Return top of the stack 2, stack becomes [1]
        customStack.push(2);                          // stack becomes [1, 2]
        customStack.push(3);                          // stack becomes [1, 2, 3]
        customStack.push(4);                          // stack still [1, 2, 3], Don't add another elements as size is 4
        customStack.increment(5, 100);                // stack becomes [101, 102, 103]
        customStack.increment(2, 100);                // stack becomes [201, 202, 103]
        System.out.println(customStack.pop());                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        System.out.println(customStack.pop());                            // return 202 --> Return top of the stack 102, stack becomes [201]
        System.out.println(customStack.pop());                            // return 201 --> Return top of the stack 101, stack becomes []
        System.out.println(customStack.pop());                            // return -1 --> Stack is empty return -1.
    }

}


/**
 Solution
 - Really simple. Just use an array list  and keep track of the top Index
 - We only push of the length of stack is below max capacity
 - If list is empty, we return -1 for pop()
 - For Incremement, we use a for loop to start from bottom and replace index
 */