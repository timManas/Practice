package Trees.MaximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTree {

    public static void main(String [] args ) {
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

        System.out.println("MaximumDepth: " + maxDepth(treeNode1));

    }

    public static int maxDepth(TreeNode root) {
        int count = 0;
        return getDepth(root, count);
    }

    private static int getDepth(TreeNode node, int count) {

        // Step 1 - Check if null exist. If not, then return current count
        if (node == null)
            return count;

        // Step 2 - Increase count if node exists
        count = count + 1;
        System.out.println(node.val);

        // Step 3 - Calculate the left and right count
        int left = getDepth(node.left, count);
        int right = getDepth(node.right, count);

        // Step4 - Compare left and right count
        int max = Math.max(left, right);
        System.out.println("Max: " + max + "    Left: " + left + "      Right: " + right);


        return max;
    }

}


/**
 Solution
 1. Use DFS - PreOrder Traversal
 2. Use BFS
 */