package Trees.SymmetricTree;

public class SymmetricTree {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        System.out.println("IsSymmetric: " + isSymmetric(treeNode1));
    }

    public static boolean isSymmetric(TreeNode root) {

        // Step0 - Check if root is null or nothing is placed
        if (root == null) {
            return true;
        }

        // Step1 - Fetch Right Subtree and Reverse
        reverse(root.right);

        // Step 2 - Compare Left and Right Subtree
        return comapreLeftRightTree(root.left, root.right);
    }



    private static void reverse(TreeNode node) {
        if (node == null)
            return;

        reverse(node.left);
        reverse(node.right);

        // Back At Parent
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }

    private static boolean comapreLeftRightTree(TreeNode leftNode, TreeNode rightNode) {

        if (leftNode == null && rightNode != null)
            return false;
        else if (leftNode != null && rightNode == null)
            return false;
        else if (leftNode == null && rightNode == null)
            return true;


        if (!isMatch(leftNode, rightNode))
            return false;


        return comapreLeftRightTree(leftNode.left, rightNode.left) && comapreLeftRightTree(leftNode.right, rightNode.right);
    }

    private static boolean isMatch(TreeNode leftNode, TreeNode rightNode) {

        if (leftNode == null && rightNode != null)
            return false;
        else if (leftNode != null && rightNode == null)
            return false;
        else if (leftNode == null && rightNode == null)
            return true;


        // Compare Value
        if (leftNode.val != rightNode.val) {
            return false;
        }

        // Compare Left Value
        if (!isMatch(leftNode.left, rightNode.left)) {
            return false;
        }

        // Compare Right Value
        if (!isMatch(leftNode.right, rightNode.right)) {
            return false;
        }

        return true;

    }


}
