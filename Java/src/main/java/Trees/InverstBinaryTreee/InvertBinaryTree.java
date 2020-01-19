package Trees.InverstBinaryTreee;

import apple.laf.JRSUIUtils;

public class InvertBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(9);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode1 = invertTree(treeNode1);

        printInvertedNode(treeNode1);

    }



    public static TreeNode invertTree(TreeNode node) {

        // Step 1 - Check if Leaf Node
        if (node == null)
            return null;


        // Step 2 - Invert the Left & Right Node
        invertTree(node.left);
        invertTree(node.right);

        // Step 3 - After performing the inversion of the bottom node, invert the parent
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;

        // Step 4 - Return the parent Node
        return node;
    }

    private static void printInvertedNode(TreeNode node) {

        if (node == null)
            return;

        System.out.print(node.val + " > ");
        printInvertedNode(node.left);
        printInvertedNode(node.right);

    }

}


/**
 SOlution

 1. Use Post Order traversal to traverse the list
    why ? We want to get the bottom first them make the parent node switch the child nodes =)


 */