package Trees.BalancedBinaryTree;

public class BalancedBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;

        System.out.println("IsBalanced: " + isBalanced(treeNode1));

    }

    static boolean isBalanced = true;

    public static boolean isBalanced(TreeNode root) {
        maxDepth(root);

        return isBalanced;
    }

    private static int maxDepth(TreeNode node) {

        // Step 1 - Return 0 if null
        if (node == null)
            return 0;

        // Step2 - Fetch  Left and Right Subtree Depth
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        // Step3 - Check both left and right subtree MaxDepth are not more than 1
        if (Math.abs(leftDepth - rightDepth) > 1)
            isBalanced = false;

        // Step4 - Fetch the larger depth and add 1 to include the current (parent) node
        return Math.max(leftDepth, rightDepth) + 1;

    }
}


/**
 Solution
 1. Use max depth to compare both left and right subtree depth
    - If diff between both is more than 1, then it is nOT balanced


 */



