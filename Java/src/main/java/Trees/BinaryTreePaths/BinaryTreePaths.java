package Trees.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(9);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        binaryTreePaths(treeNode1);

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String>  list = new ArrayList<String>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        traverseTree(root, list, stack);
        return  list;
    }

    private static void traverseTree(TreeNode node, List<String> list, Stack<TreeNode> stack) {

        if (node == null) {
            if (!stack.isEmpty())
                stack.pop();
            return;
        }

        stack.push(node);
        System.out.print(node.val + " -> ");
        traverseTree(node.left, list, stack);
        traverseTree(node.right, list, stack);

    }

}
