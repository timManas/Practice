package Trees.LowestCommonAncestorDeepestLeaves;

import java.util.concurrent.atomic.AtomicInteger;

public class LowestCommonAncestorDeepestLeaves {

    // Private Variables
    private static TreeNode lcaNode;

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

//        treeNode3.left = treeNode6;
//        treeNode3.right = treeNode7;

        TreeNode deepestLeavesNode = lcaDeepestLeaves(treeNode1);
        System.out.println("LCA of DeepestLeaves: " + deepestLeavesNode.val);

    }

    private static TreeNode lcaDeepestLeaves(TreeNode node) {
        return customTreeTraversal(node);
    }

    private static TreeNode customTreeTraversal(TreeNode node) {

        // Step1 - Check if node is null
        if (node == null)
            return null;

        // Step2 - Find height for left and Right
        int leftHeight = findHeight(node.left, 0);
        int rightHeight = findHeight(node.right, 0);

        // Step3 - return node which had bigger height
        // If leftHeight == rightHeight, node IS the common ancestor
        if (leftHeight > rightHeight)
            return customTreeTraversal(node.left);
        else if (leftHeight < rightHeight)
            return customTreeTraversal(node.right);

        return node;        // At this point leftHeight == rightHeight
    }

    // Fetch the height from node to the most bottom leaf
    // Uses post Order traversal
    private static int findHeight(TreeNode node, int level) {
        if (node == null)
            return level;

        int leftHeight = findHeight(node.left, level + 1);
        int rightHeight = findHeight(node.right, level + 1);

        return Math.max(leftHeight, rightHeight);
    }
}


/**
 Notes:
 - Not my solution =(
 - Very very tricky though
 - This is DFS BUT ...this is not pre, in or post order travreal
 - Find the Height is using POST Order

 Solution
 - Basically we traverse LEVEL BY LEVEL
 - Traverse the child node which has the LARGER Height
 - At the very bottom of the leaf node ...
    > The leaf NODE lefthHeight and rightHeight SHOULD Be the same
    > Hence for [1,2,3,4] we return 4

 Steps
 1. Find the height for both left and right
 2. Traverse larger values between left and right
 3. If left == right, then this is the lca
 4. Otherwise, keep going until we reach the end
 */
