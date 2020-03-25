package Trees.UnivaluedBinaryTree;

public class UnivaluedBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;

        System.out.println("IsUniValue: " + isUnivalTree(treeNode1));


    }

    public static boolean isUnivalTree(TreeNode root) {
        return traverseTree(root);
    }

    private static boolean traverseTree(TreeNode node) {

        // Step1 - Check if parent is null
        if (node == null)
            return true;


        // Step2 - Check if node.left and node.right == node.val ...
        // If =\= .. then return false
        if (node.left != null && node.val != node.left.val) {
            return false;
        }
        if (node.right != null && node.val != node.right.val) {
            return false;
        }

        // At this point, BOTH Left and Right SHOULD EQUAL Node.val
        return traverseTree(node.left) && traverseTree(node.right);

    }

}
