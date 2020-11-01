package Trees.SerializeAndDeserializeBinaryTree;

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
        return null;
    }
}
