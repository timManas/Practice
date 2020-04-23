package Trees.FindElementsInContaminatedBT;

public class FindElementsInContaminatedBT {


    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(-1);
        TreeNode treeNode2 = new TreeNode(-1);
        TreeNode treeNode3 = new TreeNode(-1);
        TreeNode treeNode4 = new TreeNode(-1);
        TreeNode treeNode5 = new TreeNode(-1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;


        int target = 10;

        FindElements obj = new FindElements(treeNode1);
        System.out.println("Target: " + obj.find(target));
    }



}
