package Trees.SerializeAndDeserializeBinaryTree;

import java.util.Stack;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode node) {
        StringBuilder sb = new StringBuilder();
        traverseTree(node, sb);
        System.out.println("Serialized: " + sb.toString());

        return sb.toString();
    }

    private void traverseTree(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("X,");
            return;
        }

        System.out.println("Node: " + node.val);
        sb.append(node.val + ",");
        traverseTree(node.left, sb);
        traverseTree(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] letters = data.split(",");
        TreeNode root = null;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = null;
        TreeNode newNode = null;

        for (int i=0; i<letters.length; i++) {
            System.out.println("Letter: " + letters[i]);

            // Create Node
            if (letters[i].equalsIgnoreCase("X")) {

            } else {
                newNode = new TreeNode(Integer.valueOf(letters[i]));
            }

            // Fetch current Node
            if (stack.isEmpty()) {
                stack.add(newNode);

                continue;
            } else {

            }



            currentNode = stack.pop();
            System.out.println("Current Node: " + currentNode.val);

            
            // Add Node to current Node

            // If Left and Right are still Empty, add to stack
            // Else remove from stack
            System.out.println();
        }

        return root;
    }
}