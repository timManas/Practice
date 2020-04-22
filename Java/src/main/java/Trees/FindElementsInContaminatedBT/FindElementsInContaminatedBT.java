package Trees.FindElementsInContaminatedBT;

public class FindElementsInContaminatedBT {


    public static void main() {

        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(19);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        int target = 2;

        FindElements obj = new FindElements(treeNode1);
        boolean param_1 = obj.find(target);
    }



}
