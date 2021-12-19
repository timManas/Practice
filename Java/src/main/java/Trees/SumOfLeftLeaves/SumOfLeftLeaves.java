package Trees.SumOfLeftLeaves;

import java.util.Map;
import java.util.TreeMap;

public class SumOfLeftLeaves {
    public static void main(String [] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        System.out.println("Sum Left Leaves: " + sumOfLeftLeaves(node1));
    }

    public static int sumOfLeftLeaves(TreeNode node) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("sum", 0);
        traverseTree(node,map);

        return map.get("sum");
    }

    private static void traverseTree(TreeNode node, Map<String, Integer> map) {

        // Step1 - Check if node is null
        if (node == null)
            return;

        // Step2 - Check if node left child is a leaf
        if (node.left != null && node.left.left == null && node.left.right == null) {
            map.put("sum", map.get("sum") + node.left.val);
        }

        System.out.println("Current: " + node.val);

        // Step3 - Traverse tree using preOrder traversal
        traverseTree(node.left, map);
        traverseTree(node.right, map);

    }
}
