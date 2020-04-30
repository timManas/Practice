package Trees.FindLeavesOfBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class FindLeavesOfBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        System.out.println("Leaves: " + findLeaves(treeNode1));
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        while (root != null) {
            List<Integer> leafList = new ArrayList<>();
            fetchLeaves(root, leafList);

            if (leafList.contains(root.val)) {
                root = null;
            }

            list.add(leafList);
        }


        return list;
    }

    private static void fetchLeaves(TreeNode node, List<Integer>list) {

        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if (node.left != null) {

            // Check if grandchild is null
            if (node.left.left == null && node.left.right == null) {
                list.add(node.left.val);
                node.left = null;
            }
        }

        if (node.right != null) {

            // Check if grandchild is null
            if (node.right.left == null && node.right.right == null) {
                list.add(node.right.val);
                node.right = null;
            }
        }

        System.out.println(node.val);

        fetchLeaves(node.left, list);
        fetchLeaves(node.right, list);

    }
}
