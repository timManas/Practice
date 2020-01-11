package Stacks.MaxStack;

public class MaxStackMain {

    public static void main(String [] args) {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        System.out.println("Top: " + stack.top()); //-> 5
        System.out.println("PopMax: " + stack.popMax()); //-> 5
        System.out.println("Top: " + stack.top()); //-> 1
        System.out.println("PeepMax:" + stack.peekMax()); //-> 5
        System.out.println("Pop:" + stack.pop()); //-> 1
        System.out.println("Top: " + stack.top()); //-> 5
    }

}
