package Trees.MergeTwoBinaryTree;

public class MergeTwoBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(5);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;


        TreeNode treeNode11 = new TreeNode(2);
        TreeNode treeNode22 = new TreeNode(1);
        TreeNode treeNode33 = new TreeNode(3);
        TreeNode treeNode44 = new TreeNode(4);
        TreeNode treeNode55 = new TreeNode(7);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode22.right = treeNode44;
        treeNode33.right = treeNode55;

        TreeNode result = mergeTrees(treeNode1, treeNode11);
//        while (result != null) {
//            System.out.println(result.left);
//            System.out.println(result.val);
//            System.out.println(result.right);
//        }

    }

    public static TreeNode mergeTrees(TreeNode node1, TreeNode node2) {



    }

}
