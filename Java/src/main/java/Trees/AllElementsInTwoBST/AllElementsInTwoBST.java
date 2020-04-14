package Trees.AllElementsInTwoBST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBST {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;



        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode22 = new TreeNode(0);
        TreeNode treeNode33 = new TreeNode(3);
        TreeNode treeNode44 = new TreeNode(4);
        TreeNode treeNode55 = new TreeNode(7);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
//        treeNode22.right = treeNode44;
//        treeNode33.right = treeNode55;

        List<Integer> list = getAllElements(treeNode1, treeNode11);
        System.out.println(list);
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        // Step1 - Create list to be returned;
        List<Integer> list = new ArrayList<>();

        // Step2 - Traverse Tree1 and Tree2
        traverseList(root1, list);
        traverseList(root2, list);

        // Step3 - Sort
        Collections.sort(list);

        return list;
    }

    // Traverse using PreOrder Traversal ... but tbh it doesent matter which way you traverse
    private static void traverseList(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        traverseList(node.left, list);
        traverseList(node.right, list);
    }

}
