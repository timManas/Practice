package Trees.LowestCommonAncestorDeepestLeaves;

import java.util.concurrent.atomic.AtomicInteger;

public class LowestCommonAncestorDeepestLeaves {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(0);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(9);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode5.left = treeNode8;
        treeNode5.right = treeNode9;

        TreeNode deepestLeavesNode = lcaDeepestLeaves(treeNode1);
        System.out.println("LCA of DeepestLeaves: " + deepestLeavesNode);

    }

    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        TreeNode lcaNode = null;
        AtomicInteger count = new AtomicInteger(0);
        AtomicInteger deepestNode = new AtomicInteger(0);
        traverseTree(root, lcaNode, count, deepestNode);

        return lcaNode;
    }

    private static int traverseTree(TreeNode node, TreeNode lcaNode, AtomicInteger count, AtomicInteger deepestNode) {

        if (node == null)
            return count.get();

        count.set(count.get() + 1);
        int leftCount = traverseTree(node.left, lcaNode, count, deepestNode);
        int rightCount = traverseTree(node.right, lcaNode, count, deepestNode);
        
        if (count.get() > deepestNode.get()) {

            // Check parent of LeafNode



        }

        return Math.max(leftCount, rightCount);


    }

}
