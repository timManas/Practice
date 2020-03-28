package Trees.CousinsInBinaryTree;

public class CousinsInBinaryTree {

    public static void main(String [] args) {
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
        int y = 6;
        System.out.println("IsCousins: " + isCousins(treeNode1, x, y));

    }

    public static boolean isCousins(TreeNode node, int x, int y) {

        int count = 0;

        Integer xLevel = 0;
        Integer yLevel = 0;

        Integer xParentNodeVal = 0;
        Integer yParentNodeVal = 0;

        traverseNode(node, x, y, count, xLevel, yLevel, xParentNodeVal, yParentNodeVal);
        System.out.println("xParentNodeVal: " + xParentNodeVal
                + "     xLevel: " + xLevel
                + "     yParentNodeVal: " + yParentNodeVal
                + "     yLevel: " + yLevel);
        return xLevel == yLevel && xParentNodeVal == yParentNodeVal;
    }

    private static void traverseNode(TreeNode node, int x, int y, int count, Integer xLevel, Integer yLevel, Integer xParentNodeVal, Integer yParentNodeVal) {

        if (node == null)
            return;


        if (node.left != null) {
            if (node.left.val == x) {
                xParentNodeVal = node.val;
                xLevel = count + 1;
                System.out.println("Found x: " + xParentNodeVal + "     Level: " + xLevel);
            } else if (node.left.val == y) {
                yParentNodeVal = node.val;
                yLevel = count + 1;
                System.out.println("Found y: " + yParentNodeVal + "     Level: " + yLevel);
            }
        }

        if (node.right != null) {
            if (node.right.val == x) {
                xParentNodeVal = node.val;
                xLevel = count + 1;
                System.out.println("Found y: " + xParentNodeVal + "     Level: " + xLevel);
            }
            if (node.right.val == y) {
                yParentNodeVal = node.val;
                yLevel = count + 1;
                System.out.println("Found y: " + yParentNodeVal + "     Level: " + yLevel);
            }
        }

        traverseNode(node.left, x, y, count + 1, xLevel, yLevel, xParentNodeVal, yParentNodeVal);
        traverseNode(node.right, x, y, count + 1, xLevel, yLevel, xParentNodeVal, yParentNodeVal);



    }

}
