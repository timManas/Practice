package Trees.RangeSumBst;


public class RangeSumBST {
    static int total = 0;
    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(7);

        TreeNode treeNode6 = new TreeNode(18);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

//        treeNode3.left = treeNode6;
        treeNode3.right = treeNode6;

//        treeNode5.left = treeNode8;
//        treeNode5.right = treeNode9;

        int L = 7;
        int R = 15;

        System.out.println("RangeSumBST: " + rangeSumBST(treeNode1, L, R));
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        total = 0;
        fetchRange(root, L, R);
        return total;
    }

    private static void fetchRange(TreeNode node, int L, int R) {

        // Step1 - Backtrack if node is null
        if (node == null)
            return;

        // Step2 - Fetch the node value
        int nodeValue = node.val;

        // Step3 - Check if nodevalue is WITHIN boundaries of L and R
        if (L <= nodeValue &&  nodeValue <= R) {
            total = total + nodeValue;
        }

        // Step4 - Traverse the Left
        if (L < nodeValue) {
            fetchRange(node.left, L, R);
        }

        // Step5 - Traverse the Right
        if (R > nodeValue) {
            fetchRange(node.right, L, R);
        }

    }
}


/**

 Note
 - The important thign to understand here is two things
 1. We WILL ONLY ONLY Add to total if its between L, R
 2. We traverse Left and Right if ONLY Valid


 */
