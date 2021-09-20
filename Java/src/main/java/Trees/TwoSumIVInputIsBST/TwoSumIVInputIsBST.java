package Trees.TwoSumIVInputIsBST;

public class TwoSumIVInputIsBST {
    public static void main(String [] args) {
//        TreeNode treeNode1 = new TreeNode(5);
//        TreeNode treeNode2 = new TreeNode(3);
//        TreeNode treeNode3 = new TreeNode(6);
//
//        TreeNode treeNode4 = new TreeNode(2);
//        TreeNode treeNode5 = new TreeNode(4);
//        TreeNode treeNode6 = new TreeNode(7);
//
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//        treeNode3.right = treeNode6;
//
//        int target = 9;

        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;


        int target = 4;

        System.out.println("Found Target ? " + findTarget(treeNode1, target));

        target = 28;
        System.out.println("Found Target ? " + findTarget(treeNode1, target));
    }

    public static boolean findTarget(TreeNode root, int target) {
        return traverseNode(root, root, target);
    }

    private static boolean traverseNode(TreeNode root, TreeNode node, int target) {

        // Step1 - Check if current node is null
        if (node == null)
            return false;

        // Step2 - Traverse InOrder. Hence traverse left, middle, right
        if (traverseNode(root, node.left, target))
            return true;


        // Step3 - Traverse Middle
        System.out.println("Current Node: " + node.val);
        int numToFind = target - node.val;

        // Check if numToFind is not current node
        if (numToFind == node.val)
            return false;

        if (findNumber(root, numToFind))
            return true;

        // Step3 - Traverse Right.
        if (traverseNode(root, node.right, target))
            return true;



        return false;
    }

    // Find the Number using Preorder traversal
    private static boolean findNumber(TreeNode node, int numToFind) {
        if (node == null)
            return false;

        if (node.val == numToFind) {
            System.out.println("Number Found: " + node.val);
            return true;
        }

        boolean left = findNumber(node.left, numToFind);
        boolean right = findNumber(node.right, numToFind);

        return left || right;
    }
}
