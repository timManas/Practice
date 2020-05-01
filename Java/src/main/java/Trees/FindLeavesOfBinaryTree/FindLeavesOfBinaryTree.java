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

        // Step1 - Create list of list to be returnd
        List<List<Integer>> list = new ArrayList<>();

        // Step2 - Continous Traverse the array until the root is null
        while (root != null) {

            // Step3 - Create a temp list for evey run which will add to mainList 'list'
            List<Integer> leafList = new ArrayList<>();

            // Step4 - Traverse Tree and place leaves onto list
            root = fetchLeaves(root, leafList);

            // Step5 - Add temp list to main list
            list.add(leafList);
        }

        return list;
    }

    private static TreeNode fetchLeaves(TreeNode node, List<Integer> list) {

        // Step1 - Check if node is null
        if (node == null)
            return null;

        // Step2 - Check if node is parent of leaves
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return null;
        }

        // Step3 - Traverse left and traverse Right
        node.left = fetchLeaves(node.left, list);
        node.right = fetchLeaves(node.right, list);

        return node;
    }
}

/**
 Solution
 1. Unfortunately - this isnt my solution =(
 2. Solution was VERY Similar idea to mine but in the end, still couldnt solve it
    > Still got a long way to go unfortunately

 Notes
 1. Solution uses DFS 'PreOrder' Traversal
 2. The difference in my solution and this solution was to have a return type
    > That made the difference in keeping track of the parent since we WANT the parent to be untouched if child is leaf
 3. Seriously, this question was easy and I need to get better faster =/
    > Regardless, good job on the effort of constantly trying though ...Dont stop and dont give up


 */