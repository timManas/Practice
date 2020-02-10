package Trees.DiameterOfBinaryTree;

public class DiameterBinaryTree {
    static int largestDiameter = 0;                 // Uses an external static variable to keep track
    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(9);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;



        System.out.println("Diameter: " + diameterOfBinaryTree(treeNode1));

    }
    public static int diameterOfBinaryTree(TreeNode root) {
        fetchDepth(root);
        return largestDiameter;
    }

    private static int fetchDepth(TreeNode node) {

        if (node == null)
            return 0;

        // Step 1 - Fetch Left and Right Diameter
        int leftDiameter = fetchDepth(node.left);
        int rightDiameter = fetchDepth(node.right);

        // Step2 - Fetch the Larger diameter
        int maxDiameter = Math.max(leftDiameter, rightDiameter);

        // Step3 - Set largest Diameter to the larger
        if (leftDiameter + rightDiameter > largestDiameter)
            largestDiameter = leftDiameter + rightDiameter;


        return maxDiameter + 1;     // Why do we add the +1 ? Because it includes the current Node itself
    }


}

/**
 Notes
 - We use a global variable to keep track of the count
 - Every time the max is smaller than the largestDiameter (aka global) -> We set it it to the max
 - We incremenet the maxDiameter + 1, to include the current diameter after it has finished processing the children
 */