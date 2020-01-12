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
        TreeNode subTreeNode11 = new TreeNode(1);

        subTreeNode4.left = subTreeNode1;
        subTreeNode4.right = subTreeNode2;
        subTreeNode2.left = subTreeNode11;

        System.out.println("IsSubTree: " + isSubtree(treeNode3, subTreeNode4));

    }

    public static boolean isSubtree(TreeNode tree, TreeNode subTree) {
        Boolean isSubTree = true;

        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        Stack<TreeNode> subTreeNodeStack = new Stack<TreeNode>();


        // Pushing Head Node
        treeNodeStack.push(tree);

        // Traverse Tree Iteratively instead of Recursively
        while (!treeNodeStack.isEmpty()) {

            TreeNode currentTreeNode = treeNodeStack.pop();

            if (currentTreeNode.val == subTree.val && subTreeNodeStack.isEmpty()) {
                subTreeNodeStack.push(subTree);
            }

            TreeNode subTreeNode = subTreeNodeStack.isEmpty() ? null : subTreeNodeStack.pop();
            System.out.println("CurrentNode: " + currentTreeNode.val + "   SubTreeNode: " + (subTreeNode == null ? null: subTreeNode.val));

            if (currentTreeNode.right != null) {
                treeNodeStack.push(currentTreeNode.right);

                if (subTreeNode != null && currentTreeNode.val == subTreeNode.val) {
                    if (subTreeNode.right != null) {
                        subTreeNodeStack.push(subTreeNode.right);
                    } else {
                        return false;
                    }
                }
            }

            if (currentTreeNode.left != null) {
                treeNodeStack.push(currentTreeNode.left);

                if (subTreeNode != null && currentTreeNode.val == subTreeNode.val) {
                    if (subTreeNode.left != null) {
                        subTreeNodeStack.push(subTreeNode.left);
                    } else {
                        return false;
                    }
                }
            }

        }


        return isSubTree;
    }



}
