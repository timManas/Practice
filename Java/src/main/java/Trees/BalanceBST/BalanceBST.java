package Trees.BalanceBST;

import java.util.ArrayList;
import java.util.List;

public class BalanceBST {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);


        treeNode1.right = treeNode2;
        treeNode2.right = treeNode3;
        treeNode3.right = treeNode4;


        System.out.println("IsBalanced: " + balanceBST(treeNode1));
    }


    public static TreeNode balanceBST(TreeNode root) {
        TreeNode node = null;
        List<Integer> list = new ArrayList<>();

        // Travere Tree
        traverseTree(root, list);

        // Create balanaced Tree
        createTree(node, list);

        return node;
    }

    private static void traverseTree(TreeNode root, List<Integer> list) {
    }

    private static void createTree(TreeNode node, List<Integer> list) {
    }


}
