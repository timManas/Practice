package Trees.SearchInABinaryTree;

public class SearchInABinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;


        int val = 5;
        TreeNode subNode = searchBST(treeNode1, val);
        System.out.println("SubTreeNode: " + subNode.val);
    }

    public static TreeNode searchBST(TreeNode node, int val) {

        // Step1 - Check if node is null .. return nothing
        if (node == null)
            return null;

        // Step2 - Check if the current Node is equal to the target val .. Return it
        System.out.println("Node: " + node.val);
        if (node.val == val)
            return node;

        // Step3 - Check if the leftNode or right is equal to val. If it is, return that ...
        TreeNode subNodeLeft = searchBST(node.left, val);
        TreeNode subNodeRight = searchBST(node.right, val);
        if (subNodeLeft != null && subNodeLeft.val == val)
            return subNodeLeft;
        if (subNodeRight != null && subNodeRight.val == val)
            return subNodeRight;

        // Step4 - Return NULL if we didnt find the value we were looking for
        return null;

    }

}
