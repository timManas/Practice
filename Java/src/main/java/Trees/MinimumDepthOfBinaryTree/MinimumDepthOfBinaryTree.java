package Trees.MinimumDepthOfBinaryTree;

import com.sun.org.apache.regexp.internal.RE;

public class MinimumDepthOfBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(0);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        System.out.println("MinDepth: " + minDepth(treeNode1));

    }

    public static int minDepth(TreeNode root) {
        return findMinDepth(root);
    }

    private static int findMinDepth(TreeNode root) {
        if (root == null)
            return 0;

        System.out.println(root.val);
        // Step 2 - Find left and right Depth
        int leftDepth = findMinDepth(root.left);
        int rightDepth = findMinDepth(root.right);

        // Note at this point - We are technically going back to the Parent Node

        // Step 3 - If left or Right is 0 (i.e Node is null) then we take the largerst one since it is NOT a leaf node
        if (leftDepth == 0 || rightDepth == 0) {
            return Math.max(leftDepth, rightDepth) + 1;
        }


        // Step 3b - If both left and right are not null, means we are at a parent Node
        return Math.min(leftDepth, rightDepth) + 1;
    }


}

/** Solution 1: DFS
 * Key point:
 * if a node only has one child -> MUST return the depth of the side with child, i.e. MAX(left, right) + 1
 * if a node has two children on both side -> return min depth of two sides, i.e. MIN(left, right) + 1
 * */
