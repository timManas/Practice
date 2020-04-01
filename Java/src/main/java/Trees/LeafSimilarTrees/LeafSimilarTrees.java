package Trees.LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(8);
        TreeNode treeNode8 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(4);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode5.left = treeNode8;
        treeNode5.right = treeNode9;


        TreeNode treeNode11 = new TreeNode(3);
        TreeNode treeNode22 = new TreeNode(5);
        TreeNode treeNode33 = new TreeNode(1);
        TreeNode treeNode44 = new TreeNode(6);
        TreeNode treeNode55 = new TreeNode(2);
        TreeNode treeNode66 = new TreeNode(9);
        TreeNode treeNode77 = new TreeNode(8);
        TreeNode treeNode88 = new TreeNode(7);
        TreeNode treeNode99 = new TreeNode(4);
        TreeNode treeNode00 = new TreeNode(10);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;

        treeNode22.left = treeNode44;
        treeNode22.right = treeNode55;

        treeNode33.left = treeNode66;
        treeNode33.right = treeNode77;

        treeNode55.left = treeNode88;
        treeNode55.right = treeNode99;

        treeNode99.left = treeNode00;

        System.out.println("LeafSimilar: " + leafSimilar(treeNode1, treeNode11));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {

        //Step1 - Create 2 list to keep track of the leaf values
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Step2 - Traverse each tree and populate respective list
        traverseTree(root1, list1);
        System.out.println("------");
        traverseTree(root2, list2);

        // Step3 - Check if both list are the same
        return isSame(list1, list2);
    }

    private static boolean isSame(List<Integer> list1, List<Integer> list2) {

        if (list1.size() != list2.size())
            return false;

        for (int i=0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }

        return true;
    }

    private static void traverseTree(TreeNode node, List<Integer> list) {

        // Step1 - Check if node is null
        if (node == null)
            return;

        // Step2 - Traverse Left
        traverseTree(node.left, list);

        // Step3 - Print middle Element
        System.out.println(node.val);
        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        // Step4 - Traverse Right 
        traverseTree(node.right, list);
    }


}
