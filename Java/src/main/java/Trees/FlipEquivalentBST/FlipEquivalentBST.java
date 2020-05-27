package Trees.FlipEquivalentBST;

public class FlipEquivalentBST {

    public static void main() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        TreeNode treeNode11 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(1);
        TreeNode treeNode33 = new TreeNode(3);
        TreeNode treeNode44 = new TreeNode(4);
        TreeNode treeNode55 = new TreeNode(7);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode22.right = treeNode44;
        treeNode33.right = treeNode55;

        System.out.println("Is tree Flip Equivalent ? " + flipEquiv(treeNode1, treeNode11));
    }

    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {

        return true;
    }

}
