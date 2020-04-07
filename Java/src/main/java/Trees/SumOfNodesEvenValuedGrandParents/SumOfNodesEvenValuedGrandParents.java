package Trees.SumOfNodesEvenValuedGrandParents;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodesEvenValuedGrandParents {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(9);
        TreeNode treeNode9 = new TreeNode(1);
        TreeNode treeNode10 = new TreeNode(4);
        TreeNode treeNode11 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.left = treeNode8;

        treeNode5.left = treeNode9;
        treeNode5.right = treeNode10;

        treeNode7.right = treeNode11;

        System.out.println("Sum GrandParents: " + sumEvenGrandparent(treeNode1));
    }

    public static int sumEvenGrandparent(TreeNode root) {

        // Step1 - Create variable to return
        int sum = 0;

        // Step2 - Create queue and add node to queue for bfs
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Step3 - Traverse the queue using BFS
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            // Step4 - Add the child Nodes to the Queue
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);


            // Step5 - Check if node val Odd
            // We move on to the next
            if (node.val % 2 == 1) {
                continue;
            }

            // Step 6 - Check the left Child Node
            if (node.left != null) {

                // Step6b - Check Left GrandChild Node
                if (node.left.left != null)
                    sum += node.left.left.val;


                // Step6c - Check Right ChildChild Node
                if (node.left.right != null)
                    sum += node.left.right.val;

            }

            // Step 7 - Check the Right Child Node
            if (node.right != null) {

                // Step7b - Check Left GrandChild Node
                if (node.right.left != null)
                    sum += node.right.left.val;

                // Step7 - Check Right GrandChild Node
                if (node.right.right != null)
                    sum += node.right.right.val;

            }
        }


        return sum;
    }

}
