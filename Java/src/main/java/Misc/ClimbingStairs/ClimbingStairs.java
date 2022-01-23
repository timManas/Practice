package Misc.ClimbingStairs;

public class ClimbingStairs {
    public static void main(String [] args) {
        int [] input = {5, 2, 3};
        for (int i : input)
            System.out.println("ClimbStairs: " + climbStairs(i));
    }



    public static int climbStairs(int n) {
        int numUnique = 0;

        // Create Tree
        Node root = new Node(n);
        createTree(root);

        // Traverse Tree
        System.out.println("\nTraversing Tree");
        traverseTree(root);

        return numUnique;
    }

    private static void traverseTree(Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.value);
        traverseTree(node.subtractOne);
        traverseTree(node.subtractTwo);
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
