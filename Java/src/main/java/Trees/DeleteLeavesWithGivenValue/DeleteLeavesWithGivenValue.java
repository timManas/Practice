package Trees.DeleteLeavesWithGivenValue;

public class DeleteLeavesWithGivenValue {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(4);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;

        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;

        int target = 2;

        TreeNode result = removeLeafNodes(treeNode1, target);
        System.out.print("Result: " + result.val);
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {

        // Step1 - Traverse Tree
        traverseTree(root, target);

        // StepX - Final Check to see if root is equal to target
        if (root.val == target && root.left == null && root.right == null)
            return null;


        return root;
    }

    // Traverse Tree using Post Order BFS since we want to go from Lead to Root (Bottom Up approach)
    private static void traverseTree(TreeNode node, int target) {

        // Step1 - Check if node is null ...return and do nothing
        if (node == null)
            return;

        // Step2 - Traverse left and right ...why ? Because we need to do post order traverasl
        traverseTree(node.left, target);
        traverseTree(node.right, target);

        // Step3 - Check the left node
        // Remember ... we only delete the node is LEAF and Equal to target
        if (node.left != null) {

            // Check if the child is leaf
            if (node.left.left == null &&
                    node.left.right == null &&
                    node.left.val == target)
                node.left = null;
        }

        // Step3b - Check the right node
        // Remember ... we only delete thenode is LEAF and equal to target
        if (node.right != null) {

            // Check if the child is leaf
            if (node.right.left == null &&
                    node.right.right == null &&
                    node.right.val == target)
                node.right = null;

        }
    }
}


/**
 Solution
 - We use DFS Post order traversal to traverse bottom to top
 - If node is a LEAF && equal to target to remove the reference to that node
 - Once we finish, we also need to check the root node if LEAF and equal to target ..remove that too
 */