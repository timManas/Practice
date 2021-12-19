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

        System.out.println("Sum Left Leaves: " + sumOfLeftLeaves(node1));
    }

    public static int sumOfLeftLeaves(TreeNode node) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("sum", 0);
        traverseTree(node,map);

        return map.get("sum");
    }

    private static void traverseTree(TreeNode node, Map<String, Integer> map) {

        if (node == null)
            return;

        traverseTree(node.left, map);
        traverseTree(node.right, map);

        if (node.left == null )

    }
}
