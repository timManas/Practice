package Trees.InsertIntoBST;

public class InsertIntoBST {

    public static void main() {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        int val = 5;

        TreeNode insertNode = insertIntoBST(treeNode1, val);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {

    }

}
