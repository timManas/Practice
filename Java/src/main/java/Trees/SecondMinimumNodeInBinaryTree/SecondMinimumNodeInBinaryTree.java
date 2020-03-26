package Trees.SecondMinimumNodeInBinaryTree;

import java.util.*;

public class SecondMinimumNodeInBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(7);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        System.out.println("SecondMinimum: " + findSecondMinimumValue(treeNode1));

    }

    public static int findSecondMinimumValue(TreeNode node) {
        Set<Integer> set = new TreeSet<Integer>();
        traverseNode(node, set);
        List<Integer> list = new ArrayList<Integer>(set);

        if (list.size() == 0)
            return -1;

        return list.size() > 1 ? list.get(1) : -1; // Return the second last
    }

    private static void traverseNode(TreeNode node, Set<Integer> set) {
        if (node == null)
            return;

        set.add(node.val);
        traverseNode(node.left, set);
        traverseNode(node.right, set);
    }

}
