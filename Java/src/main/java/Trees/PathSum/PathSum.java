package Trees.PathSum;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public static void main(String [] args) {

        int sum = 22;

        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;

        node3.left = node5;
        node3.right = node6;

        node4.left = node7;
        node4.right = node8;

        node6.right = node9;

        System.out.println("HasPathSum: " + hasPathSum(node1, 22));

    }

    public static boolean hasPathSum(TreeNode root, int sum) {

        List<Integer> list = new ArrayList<Integer>();
        traverseTree(root, list, 0);
        System.out.println(list);

        if (list.contains(sum))
            return true;


        return false;
    }

    private static void traverseTree(TreeNode node, List<Integer> list, int total) {

        // Step1- Check if null ..If null return and go back
        if (node == null)
            return;

        // Step2 - Traverse Left and Right tree
        traverseTree(node.left, list,  total + node.val);
        traverseTree(node.right, list, total + node.val);

        // Step3 - If Leaf (Left and Right null) then add the total to the list
        if (node.left == null && node.right == null) {
            list.add(total + node.val);
        }
    }

}
