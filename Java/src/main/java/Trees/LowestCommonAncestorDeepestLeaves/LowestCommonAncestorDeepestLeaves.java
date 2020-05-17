package Trees.LowestCommonAncestorDeepestLeaves;

import java.util.concurrent.atomic.AtomicInteger;

public class LowestCommonAncestorDeepestLeaves {

    // Private Variables
    private static TreeNode lcaNode;

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        TreeNode deepestLeavesNode = lcaDeepestLeaves(treeNode1);
        System.out.println("LCA of DeepestLeaves: " + deepestLeavesNode.val);

    }

    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        lcaNode = root;
        int count = 0;
        AtomicInteger deepestNode = new AtomicInteger(0);
        traverseTree(root, count, deepestNode);

        return lcaNode;
    }

    private static int traverseTree(TreeNode node, int count, AtomicInteger deepestNode) {

        if (node == null)
            return count;

        int leftCount = traverseTree(node.left, count + 1, deepestNode);
        int rightCount = traverseTree(node.right, count + 1, deepestNode);

        if (count  > deepestNode.get()) {

            if (node.left == null && node.right == null) {  // Leaf
                System.out.println("Leaf Hit: " + node.val);


            } else if (node.left != null && node.right == null) {   // Parent: Left Null
                if (node.left.left == null && node.left.right == null) // Left Child better be a leaf
                    setDeepestParentNode(node.left, count, deepestNode);

            } else if (node.left == null && node.right != null) {   // Parent: Right Null
                if (node.right.left == null && node.right.right == null)   // Right Child better be a leaf
                    setDeepestParentNode(node.right, count, deepestNode);


            } else if (node.left != null && node.right != null) {   // Parent
                if (node.left.left == null && node.left.right == null && node.right.left == null && node.right.right == null)
                    setDeepestParentNode(node, count, deepestNode);

            }
        }


        return Math.max(leftCount, rightCount);
    }

    private static void setDeepestParentNode(TreeNode node, int count, AtomicInteger deepestNode) {
        lcaNode = node;
        deepestNode.set(count);
        System.out.println("DeepParentNode: " + lcaNode.val + "     DeepNodeLevel: " + deepestNode.get());
    }

}
