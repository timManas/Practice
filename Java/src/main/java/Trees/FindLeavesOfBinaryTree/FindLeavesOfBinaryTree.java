package Trees.FindLeavesOfBinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>();
        while (root != null) {
            List<Integer> leafList = new ArrayList<>();

            fetchLeaves(root, leafList, set);

            if (leafList.size() == 0) {
                leafList.add(root.val);
                root = null;
            }

            list.add(leafList);
            set.clear();
        }




        return list;
    }

    private static void fetchLeaves(TreeNode node, List<Integer> list, Set<Integer> set) {

        if (node == null)
            return;


        fetchLeaves(node.left, list, set);
        fetchLeaves(node.right, list, set);

//        if (node.left == null && node.right == null) {
//            System.out.println("Leaf: " + node.val);
//            set.add(node.val);
//        }

        boolean isParent = false;

        if (node.left != null && node.left.left == null && node.left.right == null) {


            if (!set.contains(node.left.val)) {
                System.out.println("Leaf: " + node.left.val);
                list.add(node.left.val);
                node.left = null;
                isParent = true;
            }


        }

        if (node.right != null && node.right.left == null && node.right.right == null) {


            if (!set.contains(node.right.val)) {
                System.out.println("Leaf: " + node.right.val);
                list.add(node.right.val);
                node.right = null;
                isParent = true;
            }

        }

        if ((node.left == null || node.right == null) && isParent) {
            set.add(node.val);
        }

    }
}
