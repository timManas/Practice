package Misc.ClimbingStairs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ClimbingStairs {
    public static void main(String [] args) {
        int [] input = {5, 2, 3};
        for (int i : input)
            System.out.println("ClimbStairs: " + climbStairs(i) + "\n");
    }



    public static int climbStairs(int n) {
        int numUnique = 0;

        // Create Tree
        Node root = new Node(n);
        createTree(root);

        // Traverse Tree
        System.out.println("\nTraversing Tree");
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack();
        traverseTree(root, list, stack);

        System.out.println("List: " + list);
        numUnique = list.size();

        return numUnique;
    }


    static class Node {
        int value;
        Node subtractOne;
        Node subtractTwo;

        public Node(int value) {
            this.value = value;
        }
    }


    private static void traverseTree(Node node, List<String> list, Stack<Integer> stack) {

        if (node == null) {
            return;
        }

        // Add current to stack
        stack.push(node.value);
        System.out.println(stack.toString());

        if (node.value == 0)
            list.add(stack.toString());

        // Traverse Left Node
        traverseTree(node.subtractOne, list, stack);
        // Pop only if child left Node is not null
        if (node.subtractOne != null)
            stack.pop();

        // Traverse Right Node
        traverseTree(node.subtractTwo, list, stack);
        // Pop only if child right Node is not null
        if (node.subtractTwo != null)
            stack.pop();
    }

    private static void createTree(Node node) {

        if (node == null) {
            return;
        }

        int current = node.value;
        System.out.println("Current: " + current);

        Node nodeSubTractOne = current - 1 >= 0 ? new Node(current - 1) : null;
        Node nodeSubTractTwo = current - 2 >= 0 ? new Node (current - 2) : null;

        node.subtractOne = nodeSubTractOne;
        node.subtractTwo = nodeSubTractTwo;

        createTree(nodeSubTractOne);
        createTree(nodeSubTractTwo);
    }
}
