package Trees.BalanceBST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        // Step1 - Travere Tree and populate List
        List<Integer> list = new ArrayList<>();
        traverseTree(root, list);

        // Step2 - Create balanaced Tree
        // We need the set to keep track of all the elements we visited
        TreeNode node = createTree(list, 0, list.size() - 1);

        return node;
    }

    // Step1b - Traverse Tree using In Order Traversal
    private static void traverseTree(TreeNode node, List<Integer> list) {

        // StepA - Return if node is null
        if (node == null)
            return;

        // StepB - Traverse Left Node
        traverseTree(node.left, list);

        // StepC - Add value to list .. why ? This will ensure values in list are in order
        list.add(node.val);
        System.out.println(node.val);

        // StepC - Traverse Right Node
        traverseTree(node.right, list);
    }

    // Step2B - Build the Balanced Binary Tree
    // Use recursive call
    private static TreeNode createTree(List<Integer> list, int startIndex, int endIndex) {

        // StepA - Check if indexes are valid
        if (startIndex > endIndex)
            return null;

        // StepB - Calculate the node value
        int middleIndex = (startIndex + endIndex) / 2;
        int middle = list.get(middleIndex);

        // StepD - Create Node, node.left & node.right
        // Make sure to adjust the index properly and NOT to include the middle Element
        TreeNode newNode = new TreeNode(middle);
        newNode.left = createTree(list, startIndex, middleIndex - 1);   // Notice we dont use middle
        newNode.right = createTree(list, middleIndex + 1, endIndex);    // Notice we dont use middle

        return newNode;
    }


}

/**
 Solution
 1. Create a list which stores values in order
 2. Create a binary Tree from the list


 Note:
 1. This solution will work even if there are duplicates
 2. We modify the start and end index and make sure NOT to include the middle index since we are creating the current node with that


 */
