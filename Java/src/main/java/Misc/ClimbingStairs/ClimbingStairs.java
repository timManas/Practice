package Misc.ClimbingStairs;

import java.util.*;

public class ClimbingStairs {
    public static void main(String [] args) {
        int [] input = {5, 2, 3};
        for (int i : input)
            System.out.println("ClimbStairs: " + climbStairs(i) + "\n");
    }

    public static int climbStairs(int n) {
        // Step1 - Create Map to cache the number of child elements
        Map<Integer, Integer> map = new TreeMap<>();

        // Step2 - Traverse the tree from n > 0
        int numUnique = traverseStairs(n, map);
        System.out.println("Map: " + map);
        return numUnique;
    }

    private static int traverseStairs(int n, Map<Integer, Integer> map) {

        // Step1 - Check if n is positive, return 0 otherwise
        if (n < 0)
            return 0;
        else if (n == 0 )
            return 1;   // We set this as 1 because we Need to have 1 have 1

        System.out.println(n);

        // Step2 - Check if map has n, if not recursively traverse down
        int left = map.containsKey(n-1) ? map.get(n-1) : traverseStairs(n-1, map);
        int right = map.containsKey(n-2) ? map.get(n-2) : traverseStairs(n-2, map);

        // Step3 - Add the left and right results and place in map for future reference
        int numRoutes = left + right;
        if (!map.containsKey(n))
            map.put(n, numRoutes);

        return numRoutes;
    }


    // =================================================================================================

    public static int climbStairs_Naive(int n) {
        int numUnique = 0;

        // Create Tree
        Node root = new Node(n);
        createTree_Naive(root);

        // Traverse Tree
        System.out.println("\nTraversing Tree");
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack();
        traverseTree_Naive(root, list, stack);

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


    private static void traverseTree_Naive(Node node, List<String> list, Stack<Integer> stack) {

        if (node == null) {
            return;
        }

        // Add current to stack
        stack.push(node.value);
//        System.out.println(stack.toString());

        if (node.value == 0)
            list.add(stack.toString());

        // Traverse Left Node
        traverseTree_Naive(node.subtractOne, list, stack);
        // Pop only if child left Node is not null
        if (node.subtractOne != null)
            stack.pop();

        // Traverse Right Node
        traverseTree_Naive(node.subtractTwo, list, stack);
        // Pop only if child right Node is not null
        if (node.subtractTwo != null)
            stack.pop();
    }

    private static void createTree_Naive(Node node) {

        if (node == null) {
            return;
        }

        int current = node.value;
//        System.out.println("Current: " + current);

        Node nodeSubTractOne = current - 1 >= 0 ? new Node(current - 1) : null;
        Node nodeSubTractTwo = current - 2 >= 0 ? new Node (current - 2) : null;

        node.subtractOne = nodeSubTractOne;
        node.subtractTwo = nodeSubTractTwo;

        createTree_Naive(nodeSubTractOne);
        createTree_Naive(nodeSubTractTwo);
    }
}
