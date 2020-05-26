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

        // Step1 - Check if node is null
        if (node == null)
            return;

        // Step2 - Add current value to list
        list.add(node.val);
        System.out.println(list);

        // Step3 - Incrememnent total if a good #
        if (isLargest(list, node.val))
            total.getAndIncrement();

        // Step4 - Traverse Left and Right
        traverseTree(node.left, list, total);
        traverseTree(node.right, list, total);

        // Step5 - Removes the last element
        list.remove(list.size() - 1);

    }

    // Check if current value is largest of all the values in list
    private static boolean isLargest(List<Integer> list, int target) {

        for (int i : list) {
            if (i > target)
                return false;
        }

        return true;
    }

}


/**
 Notes
 - Room for improvement when checking if largest value in list
 - Traverse using DFS Pre order traversal

 Solution
 1. Create list to keep track of all values traversed
 2. Check if current value is the largest one in the list
    > If so, incrememnt the total
 3. Continue until we reach Leaf, then remove latest value in list
 4. Continue until we reach all values

 */