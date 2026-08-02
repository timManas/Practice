package Trees.BinaryTreeTilt;

import java.util.Stack;

public class BinaryTreeTilt {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(21);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(14);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(2);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;
        treeNode4.right = treeNode9;

        System.out.println("Tilt: " + findTilt(treeNode1));

    }

    public static int findTilt(TreeNode root) {
        int tilt = 0;

//        Stack<TreeNode> stack = new Stack<>();
        traverseTree(root);


        return tilt;
    }

    private static void traverseTree(TreeNode node) {

        if (node == null)
            return;

        traverseTree(node.left);
        traverseTree(node.right);
        System.out.println("Node: " + node.val);
    }
}
