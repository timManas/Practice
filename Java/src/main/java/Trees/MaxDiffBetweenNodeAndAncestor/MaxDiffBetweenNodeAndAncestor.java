package Trees.MaxDiffBetweenNodeAndAncestor;

public class MaxDiffBetweenNodeAndAncestor {
    public static void main(String [] args) {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(14);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(13);

        node1.left = node1;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        node5.left = node7;
        node5.right = node8;
        node6.left = node9;

        System.out.println("Max Ancestor Diff: " + maxAncestorDiff(node1));
    }

    public static int maxAncestorDiff(TreeNode root) {
        return 0;
    }
}
