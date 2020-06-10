package Trees.XMergeTwoBinaryTree;

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
        System.out.println("Need to debug to see the results faster: ");

    }

    public static TreeNode mergeTrees(TreeNode node1, TreeNode node2) {

        // Step1 - Check for null values
        //Check if node1 is null
        if (node1 == null)
            return node2;

        if (node2 == null)
            return node1;

        // Step2 - Set val, left and right
        // At this point, Both node1 and node2 are NOT NULL
        node1.val += node2.val;
        node1.left = mergeTrees(node1.left, node2.left);
        node1.right = mergeTrees(node1.right, node2.right);

        // Return the first node
        return node1;
    }

}

/**

 HIT LEAVES FIRST THEN WORK TO THE PARENT

 Solution:
 - Use depth first search
 Step by Step
 1. Check if node1 or node2 are null, if one is null, return the other
    Why ? Because 1. We need to return a treeNode
 2. Set the val, left and right node
 3. Return node1 or node2


 Note:
 - We can return node1 or node2 but we need to add the proper value
    > In this case, we are returning node1 since we are doing node1.val += node2.val
 - We traverse to the VERY END FIRST THEN WORK BACKWARDS FROM THERE
    > Hit the leaves first since that will the first to return
        > Dont believe me ? Set a break point in the if statements and those will be hit first



 */
