package Trees.IncreasingOrderSearchTree;

public class IncreasingOrderSearchTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(8);
        TreeNode treeNode7 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(9);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode6.left = treeNode8;
        treeNode6.right = treeNode9;




        TreeNode outputNode = increasingBST(treeNode1);
        System.out.println("InOrder Root: " + outputNode.val);

    }

    // Step1 - Create Global variables
    static TreeNode outputRoot = new TreeNode(-1);
    static TreeNode current = outputRoot;

    public static TreeNode increasingBST(TreeNode root) {

        // Step2 - Traverse BST
        fetchIncreasingBST(root);
        return outputRoot;
    }

    // We use In-order traversal to traverse Tree
    private static void fetchIncreasingBST(TreeNode node) {

        // Step1 - Check if current Node is null. Return nothing
        if (node == null)
            return;

        // Step2 - Traverse Left
        fetchIncreasingBST(node.left);

        // Step3 - Create new Node and assign current Node value to it
        System.out.println("Current Val: " + node.val);
        if (current.val == -1) {
            current.val = node.val;
        } else {
            current.right = new TreeNode(node.val);
            current = current.right;
        }

        // Step4 - Traverse Right node
        fetchIncreasingBST(node.right);
    }
}


/**
 Notes
 - Trickiest part is deciding on Static global variables
 - We use in order traversal (Left, Current, Right)

 Solution
 1. Check if node is null. Return if true
 2. Traverse left node
 3. Create new node and assign current node val to it
    > Update currentNode to the right child node
 4. Traverse Right Node

 */
