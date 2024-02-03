package Trees.CountCompleteTreeNodes;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes {
    public static void main(String [] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;

        System.out.println("# Nodes: " + countNodes(node1));
    }

    public static int countNodes(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        traverseTree(root,nodeList);
        return nodeList.size();
    }

    private static void traverseTree(TreeNode node, List<Integer> nodeList) {
        if (node == null)
            return;

        System.out.println("Current Node: " + node.val);
        nodeList.add(node.val);

        traverseTree(node.left, nodeList);
        traverseTree(node.right, nodeList);
    }

    // We have to use Stack for DFS
}
