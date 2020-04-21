package Trees.BinaryTreePruning;

public class BinaryTreePruning {

    public static void main(String [] args) {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(0);
//        TreeNode treeNode3 = new TreeNode(1);
//        TreeNode treeNode4 = new TreeNode(0);
//        TreeNode treeNode5 = new TreeNode(0);
//        TreeNode treeNode6 = new TreeNode(0);
//        TreeNode treeNode7 = new TreeNode(1);
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//
//        treeNode3.left = treeNode6;
//        treeNode3.right = treeNode7;

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(1);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        TreeNode result = pruneTree(treeNode1);
        System.out.println(result.val);
    }

    public static TreeNode pruneTree(TreeNode root) {
        traverseTree(root);
        return root;
    }

    private static void traverseTree(TreeNode node) {

        // Step1 - Check if node is null
        if (node == null)
            return;

        // Step2 - Traverse Left and Right
        traverseTree(node.left);
        traverseTree(node.right);


        // Step3 - We check the child node
        if (node.left != null && node.left.val != 1) {

            // Step4 - Check the grand child node
            if (node.left.left == null && node.left.right == null)
                node.left = null;
        }

        // Step3 - We check the child node
        if (node.right != null && node.right.val != 1) {

            // Step4 - Check the grand child node
            if (node.right.left == null && node.right.right == null)
                node.right = null;

        }

    }

}

/**
 Solution
 - We use post order traversal since we want to start from the bottom up
 - After we traverse left and right, we check the node child and grand children
 - If the grandchildren have values, that means somewhere down the line, there is a one
 - If the grandchildren are null, we remove the child node

 Why ?
 - Because if there is a value at the grand child node, it means there is a one
 - Otherwise, it just empty and the child node is ZERO 


 */
