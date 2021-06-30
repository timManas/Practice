package Trees.BinaryTreeInOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;

        System.out.println("InOrderTraversal: " + inorderTraversal(treeNode1));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getInOrderTraversal(root, list);
        return list;
    }

    private static void getInOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        getInOrderTraversal(node.left, list);
        System.out.println("Node: " + node.val);
        list.add(node.val);
        getInOrderTraversal(node.right, list);
    }
}
