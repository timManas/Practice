package Trees.TwoSumIVInputIsBST;

public class TwoSumIVInputIsBST {
    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(6);

        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;

        int target = 9;

        System.out.println("Found Target ? " + findTarget(treeNode1, target));

        target = 28;
        System.out.println("Found Target ? " + findTarget(treeNode1, target));
    }

    public static boolean findTarget(TreeNode root, int target) {
        return traverseNode(root, root, target);
    }

    private static boolean traverseNode(TreeNode root, TreeNode node, int target) {

        if (node == null)
            return false;


        boolean left = traverseNode(root, node.left, target);
        System.out.println("Current Node: " + node.val);
        if (findNumber(root, target - node.val))
            return true;
        boolean right = traverseNode(root, node.right, target);

        return left || right;
    }

    private static boolean findNumber(TreeNode node, int target) {
        if (node == null)
            return false;

        if (node.val == target) {
            System.out.println("Number Found: " + node.val);
            return true;
        }

        boolean left = findNumber(node.left, target);
        boolean right = findNumber(node.right, target);

        return left || right;
    }
}
