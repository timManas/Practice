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

        if (node == null)
            return;

        traverseTree(node.left);
        traverseTree(node.right);

        if (node.left != null && node.left.val == 0)
            node.left = null;

        if (node.right != null && node.right.val == 0)
            node.right = null;


    }

}
