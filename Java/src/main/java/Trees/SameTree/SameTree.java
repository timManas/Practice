package Trees.SameTree;

public class SameTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(0);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;


        TreeNode treeNode11 = new TreeNode(3);
        TreeNode treeNode22 = new TreeNode(4);
        TreeNode treeNode33 = new TreeNode(5);
        TreeNode treeNode44 = new TreeNode(1);
        TreeNode treeNode55 = new TreeNode(2);
        TreeNode treeNode66 = new TreeNode(0);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode22.left = treeNode44;
        treeNode22.right = treeNode55;
        treeNode33.right = treeNode66;

        System.out.println("IsSameTree: " + isSameTree(treeNode1, treeNode11));
    }

    public static boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {

        // Step 1 - Check TreeNode1 & TreeNode2 is NOT null
        if (treeNode1 == null && treeNode2 != null) {
            return false;
        } else if (treeNode1 != null && treeNode2 == null) {
            return false;
        } else if (treeNode1 == null && treeNode2 == null) {
            return true;
        }

        // Step2 - Check if they match
        if (!isMatch(treeNode1, treeNode2)) {
            return false;
        }

        return isSameTree(treeNode1.left, treeNode2.left) && isSameTree(treeNode1.right, treeNode2.right);

    }

    private static boolean isMatch(TreeNode treeNode1, TreeNode treeNode2) {

        // Step 1 - Check TreeNode1 & TreeNode2 is NOT null
        if (treeNode1 == null && treeNode2 != null) {
            return false;
        } else if (treeNode1 != null && treeNode2 == null) {
            return false;
        } else if (treeNode1 == null && treeNode2 == null) {
            return true;
        }

        if (treeNode1.val != treeNode2.val)
            return false;

        if (!isMatch(treeNode1.left, treeNode2.left))
            return false;

        if (!isMatch(treeNode1.right, treeNode2.right))
            return false;

        return true;
    }

}
