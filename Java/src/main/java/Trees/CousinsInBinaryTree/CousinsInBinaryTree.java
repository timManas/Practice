package Trees.CousinsInBinaryTree;

public class CousinsInBinaryTree {

    public static void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;

        treeNode3.right = treeNode5;

        treeNode5.right = treeNode6;

        int x = 4;
        int y = 5;
        System.out.println("IsCousins: " + isCousins(treeNode1, x, y));

    }

    public static boolean isCousins(TreeNode node, int x, int y) {

        int xLevel = 0;
        int yLevel = 0;

        int xParentNodeVal = 0;
        int yParentNodeVal = 0;

        

        return true;
    }

}
