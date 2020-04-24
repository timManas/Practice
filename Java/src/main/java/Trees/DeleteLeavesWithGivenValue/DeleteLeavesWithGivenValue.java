package Trees.DeleteLeavesWithGivenValue;

public class DeleteLeavesWithGivenValue {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(4);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;

        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;

        int target = 3;

        TreeNode result = removeLeafNodes(treeNode1, target);
        System.out.print("Result: " + result.val);
    }

    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        traverseTree(root, target);
        return root;
    }

    // Traverse Tree using Post Order BFS since we want to go from Lead to Root (Bottom Up approach)
    private static void traverseTree(TreeNode node, int target) {

        if (node == null)
            return;

        traverseTree(node.left, target);
        traverseTree(node.right, target);

        // If Leaf Node
        if (node.left == null && node.right == null) {

            if (node.val == target)
                node = null;

        }

    }
}
