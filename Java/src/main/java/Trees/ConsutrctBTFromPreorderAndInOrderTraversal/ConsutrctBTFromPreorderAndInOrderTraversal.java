package Trees.ConsutrctBTFromPreorderAndInOrderTraversal;

public class ConsutrctBTFromPreorderAndInOrderTraversal {

    public static void main(String [] args) {
        int [] pre = {3,9,20,15,7};
        int [] post = {9,3,15,20,7};

        TreeNode output = buildTree(pre, post);
        System.out.println("Output: " + output.val);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

    }

}
