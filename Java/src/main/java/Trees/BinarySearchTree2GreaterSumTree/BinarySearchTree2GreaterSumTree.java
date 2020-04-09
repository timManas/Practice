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

    public static TreeNode bstToGst(TreeNode node) {

        if (node == null)
            return null;

        bstToGst(node.right);
        System.out.println(node.val);
        bstToGst(node.left);


        return node;
    }

}
