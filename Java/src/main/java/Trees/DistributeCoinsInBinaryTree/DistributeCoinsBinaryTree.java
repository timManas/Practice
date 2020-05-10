package Trees.DistributeCoinsInBinaryTree;

public class DistributeCoinsBinaryTree {

    public static void main(String [] args) {

        TreeNode treeNode1 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(3);
        TreeNode treeNode7 = new TreeNode(0);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        System.out.println("# of Moves: " + distributeCoins(treeNode1));
    }

    private static int numMoves;
    public static int distributeCoins(TreeNode root) {
        traverseTree(root);
        return numMoves;
    }

    private static int traverseTree(TreeNode node) {
        if (node == null)
            return 0;

        int left = traverseTree(node.left);
        int right = traverseTree(node.right);

        numMoves += Math.abs(left) + Math.abs(right);

        return node.val + left + right - 1;
    }

}

/**
 Note
 1. For LeetCode - Get rid of the static. Otherwise it will fail
 2. Figuring out the solution is a bit tricket
 3. We use a Depth First Search Post Order traversal to start from Bottom uP
 4. Idea wasnt ours but Implementaiton was
 5. Basically, the idea is to to start from the bottom and return the "Excess" number of coins back to the parents
 6. Meanwhile - We ALSO calculate the # of moves to Pass or Disperse the coins to other notes
    > The reason why numMoves is an Absolute value is becuase, if we pass or disperse coins, it still counts as 1 move


 Solution
 1. Start from the bottom
 2. Take Left and RIght
 3. Return the node.value + left + right - 1
    > Why -1 ? Because we need to place one coin at the node itself and return the excess back to the parent
 4. We also calculate the numMoves by using Math.abs value

 */