package Trees.CountGoodNodesInBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountGoodNodesInBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;


        System.out.println("NumOfGoodNodes: " + goodNodes(treeNode1));
    }

    public static int goodNodes(TreeNode root) {

        // Step1 - Create variable to return
        AtomicInteger total = new AtomicInteger();

        // Step2 - Create list to keep track of element from root to leaf
        List<Integer> list = new ArrayList<>();

        // Step3 - Traverse tree using PreOrder Traversal
        traverseTree(root, list, total);
        return total.get();
    }

    private static void traverseTree(TreeNode node, List<Integer> list, AtomicInteger total) {

        if (node == null)
            return;

        list.add(node.val);
        System.out.println(list);

        // Traverse Left and Right
        traverseTree(node.left, list, total);
        traverseTree(node.right, list, total);

        // Removes the last element
        list.remove(list.size() - 1);

    }

}
