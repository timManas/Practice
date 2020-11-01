package Trees.SerializeAndDeserializeBinaryTree;

public class SerializeAndDeserializeBinaryTree {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;


        // Your Codec object will be instantiated and called as such:
        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(treeNode1));
        System.out.println("Deserialized: " + ans.val);
    }
}
