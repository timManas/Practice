package Trees.SubTreeOfAnotherTree;


import java.math.BigInteger;
import java.util.HashSet;
import java.util.Stack;

public class SubTreeOfAnotherTree {

    public static void main(String [] args) {

        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode0 = new TreeNode(0);

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        treeNode4.left = treeNode1;
        treeNode4.right = treeNode2;
//        treeNode2.left = treeNode0;

        TreeNode subTreeNode4 = new TreeNode(4);
        TreeNode subTreeNode1 = new TreeNode(1);
        TreeNode subTreeNode2 = new TreeNode(2);
//        TreeNode subTreeNode11 = new TreeNode(1);

        subTreeNode4.left = subTreeNode1;
        subTreeNode4.right = subTreeNode2;
//        subTreeNode2.left = subTreeNode11;

//        TreeNode treeNode3 = new TreeNode(0);
//        TreeNode subTreeNode4 = new TreeNode(1);

        System.out.println("IsSubTree: " + isSubtree(treeNode3, subTreeNode4));

    }


    // Working Solution
    public static boolean isSubtree (TreeNode treeNode, TreeNode subTreeNode)
    {
        boolean isSubTree = false;





        return isSubTree;
    }








}
