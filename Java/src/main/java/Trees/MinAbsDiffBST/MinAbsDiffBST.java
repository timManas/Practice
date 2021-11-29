package Trees.MinAbsDiffBST;

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
        System.out.println("Min Difference: " + getMinimumDifference(node6));
    }

    public static int getMinimumDifference(TreeNode node) {

        if (node == null)
            return 0;

        System.out.println("Node: " + node.val);


        int left = getMinimumDifference(node.left);
        int right = getMinimumDifference(node.right);

        return Math.min(left, right);
    }
}
