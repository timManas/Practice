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

        Stack<TreeNode> stack = new Stack<TreeNode>();

        System.out.println("---- Print from Root to each Leaf ----");
        List<String>  listRoot2Leaf = new ArrayList<String>();
        traverseTreeRoot2Leaf(root, stack, listRoot2Leaf, "");
        System.out.println(listRoot2Leaf);

        System.out.println("\n--- Print from Root to each Node ----");
        List<String>  listRoot2Node = new ArrayList<String>();
        traverseTreeRoot2Node(root, stack, listRoot2Node, "");
        System.out.println(listRoot2Node);

        return  listRoot2Leaf;
    }

    // Prints all from Root to each Leaf
    private static void traverseTreeRoot2Leaf(TreeNode node, Stack<TreeNode> stack, List<String> list, String path) {


        // Step 1 - Check if node null ...Go back
        if (node == null) {
            return;
        }

        stack.push(node);

        // Step2 - Traverse Left and Right tree
        traverseTreeRoot2Leaf(node.left, stack, list, path + node.val + "->");
        traverseTreeRoot2Leaf(node.right, stack, list, path + node.val + "->");

        // Step 3 - If both Left and Right are null
        // Then we are at leaf node ...Add to list
        if (node.left == null && node.right == null) {
            list.add(path + node.val);
        }
    }


    // Prints all from Root to each Node
    private static void traverseTreeRoot2Node(TreeNode node, Stack<TreeNode> stack, List<String> list, String path) {


        // Step 1 - Check if node null ...Go back
        if (node == null) {
            return;
        }

        stack.push(node);
        list.add(path + node.val);
        // Step2 - Traverse Left and Right tree
        traverseTreeRoot2Node(node.left, stack, list, path + node.val + "->");
        traverseTreeRoot2Node(node.right, stack, list, path + node.val + "->");
    }

    /**
     We dont need a Stack
     ... Only need it for graphs

     */


}
