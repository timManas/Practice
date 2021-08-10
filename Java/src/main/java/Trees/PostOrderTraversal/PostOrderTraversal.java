package Trees.PostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
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

        System.out.println("PostOrderList: " + postorderTraversal(treeNode1));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> outputList = new ArrayList<>();
        outputList = fetchPostOrderList(outputList, root);

        return outputList;
    }

    private static List<Integer> fetchPostOrderList(List<Integer> outputList, TreeNode node) {
        if (node == null)
            return outputList;

        fetchPostOrderList(outputList, node.left);
        fetchPostOrderList(outputList, node.right);
        System.out.println("Current: " + node.val);
        outputList.add(node.val);


        return outputList;
    }
}
