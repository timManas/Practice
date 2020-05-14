package Trees.TwoSumBST;

public class TwoSumBST {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);

        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(3);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        int target = 5;

        System.out.println("Two Sum BST Exists: " + twoSumBSTs(treeNode1, treeNode4, target));
    }

    public static boolean twoSumBSTs(TreeNode node1, TreeNode node2, int target) {

        if (node1 == null)
            return false;

        int diff = target - node1.val; 

        return twoSumBSTs(node1.left, node2, target) || twoSumBSTs(node1.right, node2, target);



    }

}
