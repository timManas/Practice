package Trees.ConstructBSTFromPreOrderTraversal;

import Trees.MaxDepthNaryTree.Node;

public class ConstructBSTFromPreOrderTraversal {

    public static void main(String [] args) {
        int [] preOrder = {8,5,1,7,10,12};
        TreeNode root = bstFromPreorder(preOrder);
        System.out.println("Root: " + root.val);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {

        // Step1 - Check if preorder array has element
        if (preorder.length <= 0)
            return null;

        // Step2 - Set Root Node
        TreeNode node = new TreeNode(preorder[0]);

        // Step3 - Traverse Array
        for (int i=1; i < preorder.length; i++) {
            traverseTree(preorder[i], node);
        }

        return node;
    }

    // Do two things: 1.) Traverse to the node before it hits null ...2.) Create a new node there
    private static void traverseTree(int value, TreeNode node) {

        // Step4 - Check if Node is null...Do nothing and return
        if (node == null) {
            return;

        } else if (value < node.val) {          // Step5- Check if node is smaller, traverse Left
            traverseTree(value, node.left);

            if (node.left == null)                      // Step6 - Create a new Node
                node.left = new TreeNode(value);

        } else if (value > node.val) {              //Step5b - Check if node is larger, traverse right
            traverseTree(value, node.right);

            if (node.right == null)                     // Step6b - Create a new Node
                node.right = new TreeNode(value);
        }
    }
}

/**
    Solution
    1. Search the node right before it hits null ...ie Parent before we insert new Node
    2. Insert new Node at this spot
 */
