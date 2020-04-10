package Trees.BinarySearchTree2GreaterSumTree;

public class BinarySearchTree2GreaterSumTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(0);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode5.right = treeNode8;
        treeNode7.right = treeNode9;

        TreeNode gstNode = bstToGst(treeNode1);
        System.out.println("GstNode: " + gstNode.val);
    }

    static int count = 0;
    public static TreeNode bstToGst(TreeNode node) {
        traverseTree(node);
        return node;
    }

    private static void traverseTree(TreeNode node) {

        // Step1 - Check if node is null. Return nothing
        if (node == null)
            return;

        // Step2 - Traverse Right Node
        traverseTree(node.right);

        // Step3 - Add to Count
        count += node.val;

        // Step4 - Set new value to node.val
        node.val = count;
        System.out.println("Node: " + node.val + "  Count: " + count);

        // Step5 - Traverse Left Node
        traverseTree(node.left);
    }

}

/**
 Solution
 - Use Inorder Traversal BUT starting from the Right instead of starting from  Left
 - Everytime we get to the node, we incremenet the count which is a global variable
    > Why ? Because placing it as argument is a giant pain in the ass. And this solution is more intuitive
 */
