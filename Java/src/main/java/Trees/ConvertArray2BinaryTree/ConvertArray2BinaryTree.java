package Trees.ConvertArray2BinaryTree;

public class ConvertArray2BinaryTree {
    public static void main(String [] args) {
        int nums [] = {-10,-3,0,5,9};
        printTree(sortedArrayToBST(nums));
    }

    private static void printTree(TreeNode node) {
        if (node == null)
            return;

        System.out.println(node.val + " -> ");
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }
}
