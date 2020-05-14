package Trees.TwoSumBST;

public class TwoSumBST {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);

        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(3);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        int target = 5;

        System.out.println("Two Sum BST Exists: " + twoSumBSTs(treeNode1, treeNode4, target));
    }

    // Step1 - Create a recursive call to traverse First Tree
    public static boolean twoSumBSTs(TreeNode node1, TreeNode node2, int target) {


        if (node1 == null)
            return false;

        // Step2 - Find the Difference
        int diff = target - node1.val;

        // Step3 - Find the difference
        // If found return true
        if (searchTree(node2, diff))
            return true;

        // Step4 - Continue Traversing the Tree until the end
        return twoSumBSTs(node1.left, node2, target) || twoSumBSTs(node1.right, node2, target);
    }

    // Step5 - Create a recursive call to check the second tree
    private static boolean searchTree(TreeNode node, int target) {

        // Step6 - Check for base step
        if (node == null)
            return false;

        // Step 7 - If target aka diff is found, we return true
        // This will then trigger a true on the
        if (node.val == target)
            return true;

        // Step8 - The true will propagate to the parent here and return true as well
        return searchTree(node.left, target) || searchTree(node.right, target);
    }

}

/**
 Solution
 - The solution is to find the difference between node and the target in the First tree.
    > Then we look for the difference in the second tree.
    > Thats it

 Ex. If Target is 7, and we run into 3 in the first tree
 > Then difference: 7 - 3 = 4
 > Next, we look for 4 in the second tree using binary Search


 Note
 - This was an easy to thing to do but tricky to come up with
 - The trick is to think of the Two Sum problem ... Could also work for Subtraction, Multiplication, Division

 */