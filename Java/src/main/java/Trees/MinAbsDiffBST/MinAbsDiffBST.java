package Trees.MinAbsDiffBST;

import java.util.ArrayList;
import java.util.List;

public class MinAbsDiffBST {
    public static void main(String [] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println("Min Difference: " + getMinimumDifference(node1) + "\n");

        TreeNode node6 = new TreeNode(1);
        TreeNode node7 = new TreeNode(0);
        TreeNode node8 = new TreeNode(48);
        TreeNode node9 = new TreeNode(12);
        TreeNode node10 = new TreeNode(49);

        node6.left = node7;
        node6.right = node8;
        node8.left = node9;
        node8.right = node10;
        System.out.println("Min Difference: " + getMinimumDifference(node6) + "\n");
    }

    public static int getMinimumDifference(TreeNode node) {
        MinDiff min = new MinDiff(Integer.MAX_VALUE);   // Set the minValue
        List<Integer> list = new ArrayList<>();         // Create list to store values in ascending order
        traverseTree(node, min, list);                  // Traverse Tree

        System.out.println("List: " + list);
        return min.getMin();
    }

    // Traverse InOrder
    public static void traverseTree(TreeNode node, MinDiff min, List<Integer> list) {

        // Step1 - Check if node exist
        if (node == null)
            return ;

        // Step2 - Traverse Left
        traverseTree(node.left, min, list);

        // Step3 - Check for min Value
        System.out.println("Node: " + node.val);
        if (!list.isEmpty() && Math.abs(node.val - list.get(list.size()-1)) < min.getMin()) {
            min.setMin(Math.abs(node.val - list.get(list.size()-1)));
        }
        // Step4 - Add current node value to list
        list.add(node.val);

        // Step5 - Traverse Right
        traverseTree(node.right, min, list);
    }

    public static class MinDiff {
        private int min;

        public MinDiff(int min) {
            this.min = min;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }




}
