package Trees.BinaryTreeTilt;

import java.util.ArrayList;
import java.util.List;
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

        List<Integer> list = new ArrayList<>();
        traverseTree(root, list);
        for (int i : list)
            tilt += i;


        return tilt;
    }

    private static int traverseTree(TreeNode node, List<Integer> list) {

        if (node == null)
            return 0;

        int left = traverseTree(node.left, list);
        int right = traverseTree(node.right, list);

        list.add(Math.abs(left - right));

        System.out.println("Node: " + node.val  + "     list: " + list);

        return node.val + left + right;
    }
}
