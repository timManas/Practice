package Trees.LowestCommonAncestorBinaryTree;

public class LowestCommonAncestor {
    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(0);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(9);
        TreeNode treeNode8 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode5.left = treeNode8;
        treeNode5.right = treeNode9;



        System.out.println("LCA: " + lowestCommonAncestor(treeNode1, treeNode2, treeNode9).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {

        // Step1 - Get the node values
        int nodeValue = node.val;
        int pValue =  p.val;
        int qValue = q.val;


        // Step2 - Figure out the arrangement
        if (pValue < nodeValue && qValue < nodeValue) {     // Left Subtree
            System.out.println();
            return lowestCommonAncestor(node.left, p, q);

        }  else if (pValue > nodeValue && qValue > nodeValue) { // Right Subtree
            System.out.println();
            return lowestCommonAncestor(node.right, p, q);

        } else {
            // Not Condition 1 or Condition 2
            System.out.println();
        }

        return node;
    }
}

/**
 Note:
 - The reason this works is because the structure is a binary tree
 - This allows us to determine if its gonna be on the left or right subtree
 - We assume all the values are there
 


 Algorithm
 1. Start traversing the tree from the root node.
 2. If both the nodes p and q are in the right subtree, then continue the search with right subtree starting step 1.
 3. If both the nodes p and q are in the left subtree, then continue the search with left subtree starting step 1.
 4. If both step 2 and step 3 are not true, this means we have found the node which is common to node p's and q's subtrees. and hence we return this common node as the LCA.
 */
