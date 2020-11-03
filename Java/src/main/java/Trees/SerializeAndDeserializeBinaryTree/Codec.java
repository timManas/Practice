package Trees.SerializeAndDeserializeBinaryTree;

import java.util.*;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode node) {

        // Step1 - Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Step2 - Serialize using PreOrder Traversal
        serializeTree(node, sb);
        System.out.println("Serialized: " + sb.toString());
        return sb.toString();
    }

    private void serializeTree(TreeNode node, StringBuilder sb) {

        // Step1 - Append "X" if we run into a Null node
        if (node == null) {
            sb.append("X,");
            return;
        }

        // Step2 - Append current Value to the String Builder
        System.out.println("Node: " + node.val);
        sb.append(node.val + ",");

        // Step3 - Serialize the left and right Node
        serializeTree(node.left, sb);
        serializeTree(node.right, sb);
    }

    public TreeNode deserialize(String data) {

        // Step1 - Split data by ","
        String[] letters = data.split(",");

        // Step2 - Create and populate queue
        Deque<String> queue = new ArrayDeque<>();
        queue.addAll(Arrays.asList(letters));

        // Step3 - Create Tree using PreOrderTraversal
        TreeNode root = createTree(queue);
        return root;
    }

    private TreeNode createTree(Deque<String> queue) {

        // Step1 - Fetch the first value from the queue
        String currentVal = queue.pop();

        // Step2 - Return null if we get "X"
        if (currentVal.equalsIgnoreCase("X"))
            return null;

        // Step3 - Create Node
        TreeNode currentNode = new TreeNode(Integer.valueOf(currentVal));

        // Step4 - Use recursion to find the left and Right
        currentNode.left = createTree(queue);
        currentNode.right = createTree(queue);

        return currentNode;
    }
}

/**
 Note
 - This was HARD AF
 - Serilization & Deserialization requires use of PreOrder Traversal

 Serilization Solution:
 1. Create a StringBuilder
 2. Traverse the Tree:
    - If we encounter a null node, we append an X
    - Else - We append the node.val to the StringBuilder
 3. Return the StringBuilder

 Deserilization Solution:
 1. Split data by ","
 2. Create Queue and store all split data
 3. Create Tree
    - Pop the first value from the queue
    - Return if we encounter x
    - Else:
        - Create a Node
        - Use recursion to find the left and Right Values of the current Node

 */