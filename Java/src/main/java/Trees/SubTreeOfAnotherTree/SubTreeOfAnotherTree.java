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

        System.out.println("IsSubTree: " + isSubtree(subTreeNode4,  treeNode3));

    }


    // Working Solution
    public static boolean isSubtree (TreeNode t1, TreeNode t2)
    {
        if (t2 == null) // An empty subtree can always be found in any tree
            return true;

        if (t1 == null) // If no more tree is left to search, return false
            return false;

        // If there is a match, check the left and right nodes to match with
        // left and right subtrees
        if (t1.val == t2.val)
            return isSubtree(t1.left, t2.left) && isSubtree(t1.right, t2.right);

        // If there is no match, check left and right subtrees for a
        // match with current tree
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }

    public static boolean isSubtree_OLD(TreeNode tree, TreeNode subTree) {

        boolean isMatch = true;            // False until what ?
        boolean isSubTreeMatched = false;      // counter to check if Subtree stack was entered and Emptied

        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        Stack<TreeNode> subTreeNodeStack = new Stack<TreeNode>();

        // Pushing Head Node
        treeNodeStack.push(tree);

        // Traverse Tree Iteratively instead of Recursively
        while (!treeNodeStack.isEmpty()) {

            // Fetch Current Node and SubTreeNode
            TreeNode subTreeNode = null;
            TreeNode currentTreeNode = treeNodeStack.pop();

            // Check if Current Node is the same as SubTree Node
            if (checkNodesMatch(currentTreeNode, subTree)) {
                subTreeNodeStack.push(subTree);
                isSubTreeMatched = true;
            }

            subTreeNode = subTreeNodeStack.isEmpty() ? null : subTreeNodeStack.pop();
            System.out.println("CurrentNode: " + currentTreeNode.val + "   SubTreeNode: " + (subTreeNode == null ? null : subTreeNode.val));

            // Compare
            if (subTreeNode != null) {
                if (!checkNodesMatch(currentTreeNode, subTreeNode))
                    return false;
            }

            // Iterate to Next
            if (currentTreeNode.right != null) {
                treeNodeStack.push(currentTreeNode.right);

                if (subTreeNode != null)
                    subTreeNodeStack.push(subTreeNode.right);
            }

            if (currentTreeNode.left != null) {
                treeNodeStack.push(currentTreeNode.left);

                if (subTreeNode != null)
                    subTreeNodeStack.push(subTreeNode.left);
            }
        }

        if (!isSubTreeMatched || !subTreeNodeStack.isEmpty())
            return false;


        return isMatch;
    }

    private static boolean checkNodesMatch(TreeNode currentTreeNode, TreeNode subTreeNode) {

        // Left
        int curTreeValueLeft = currentTreeNode.left != null ? currentTreeNode.left.val : -1;
        int subTreeValueLeft = subTreeNode.left != null ? subTreeNode.left.val : -1;

        // Right
        int curTreeValueRight = currentTreeNode.right != null ? currentTreeNode.right.val : -1;
        int subTreeValueRight = subTreeNode.right != null ? subTreeNode.right.val : -1;

        if (currentTreeNode.val != subTreeNode.val)
            return false;

        if (curTreeValueLeft != subTreeValueLeft)
            return false;

        if (curTreeValueRight != subTreeValueRight)
            return false;

        return true;
    }

//    public static boolean isSubtree(TreeNode tree, TreeNode subTree) {
//        boolean isMatch = false;
//
//        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
//        Stack<TreeNode> subTreeNodeStack = new Stack<TreeNode>();
//
//        // Pushing Head Node
//        treeNodeStack.push(tree);
//
//        // Traverse Tree Iteratively instead of Recursively
//        while (!treeNodeStack.isEmpty()) {
//
//
//            TreeNode currentTreeNode = treeNodeStack.pop();
//
//            if (currentTreeNode.val == subTree.val && subTreeNodeStack.isEmpty()) {
//                subTreeNodeStack.push(subTree);
//            }
//
//            TreeNode subTreeNode = subTreeNodeStack.isEmpty() ? null : subTreeNodeStack.pop();
//            System.out.println("CurrentNode: " + currentTreeNode.val + "   SubTreeNode: " + (subTreeNode == null ? null : subTreeNode.val));
//
//
//            // Compare
//            if (subTreeNode != null) {
//                int curTreeValue = currentTreeNode.val;
//                int subTreeValue = subTreeNode.val;
//
//                // Check Current Node Exist
//                if (curTreeValue == subTreeValue)
//                    isMatch = true;
//                else
//                    isMatch=false;
//
//
//                // Check the Left Node Exist
//                int curTreeValueLeft = currentTreeNode.left != null ? currentTreeNode.left.val : -1;
//                int subTreeValueLeft = subTreeNode.left != null ? subTreeNode.left.val : -1;
//                if (curTreeValueLeft == subTreeValueLeft)
//                    isMatch =  true;
//                else
//                    isMatch = false;
//
//                // Check the Right Node Exist
//                int currTreeValueRight = currentTreeNode.right != null ? currentTreeNode.right.val : -1;
//                int subTreeValueRight = subTreeNode.right != null ? subTreeNode.right.val : -1;
//                if (currTreeValueRight == subTreeValueRight)
//                    isMatch = true;
//                else
//                    isMatch = false;
//
//            }
//
//            // Iterate to Next
//            if (currentTreeNode.right != null) {
//                treeNodeStack.push(currentTreeNode.right);
//
//                if (subTreeNode != null)
//                    subTreeNodeStack.push(subTreeNode.right);
//            }
//
//            if (currentTreeNode.left != null) {
//                treeNodeStack.push(currentTreeNode.left);
//
//                if (subTreeNode != null)
//                    subTreeNodeStack.push(subTreeNode.left);
//            }
//        }
//
//        return isMatch;
//    }


}
