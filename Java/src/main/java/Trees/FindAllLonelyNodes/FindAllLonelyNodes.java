package Trees.FindAllLonelyNodes;

import java.util.ArrayList;
import java.util.List;

public class FindAllLonelyNodes {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(2);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode6.right = treeNode7;

        List<Integer> output = getLonelyNodes(treeNode1);
        System.out.println("Output: " + output);
    }

    public static List<Integer> getLonelyNodes(TreeNode node) {

        // Step1 - Create Output List
        List<Integer> outputList = new ArrayList<>();

        // Step2 - Traverse Tree
        traverseTree(outputList, node);
        return outputList;
    }

    private static TreeNode traverseTree(List<Integer> outputList, TreeNode node) {
        // Step1 - Check if Node is null
        if (node == null)
            return null;

        // Step2 - Find Left & Right Node
        TreeNode leftNode = traverseTree(outputList, node.left);
        TreeNode rightNode = traverseTree(outputList, node.right);

        // Step3 - Add if Lonely Node
        if (leftNode == null && rightNode != null)
            outputList.add(rightNode.val);
        else if (leftNode != null && rightNode == null)
            outputList.add(leftNode.val);

        return node;
    }
}

/**
 Notes
 - Fairly Simple
 - Uses DFS (Post Order Traversal)

 Solution
 1. Traverse Tree
 2. Check Left and Right Child Nodes
 3. Check if Only one Child exists
    > Add child Node value to the output list
 4. Continue until we reach the end


 */
