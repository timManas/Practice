package Trees.DeepestLeavesSum;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode6.right = treeNode8;

        System.out.println("DeepestLeavesSum: " + deepestLeavesSum(treeNode1));

    }

    public static int deepestLeavesSum(TreeNode node) {

        // Step1 - Create Varaible to return
        int sum = node.val;

        // Step2 - Create 2 Queues
        // Main Queues will be the parent and the tempqueue will the child
        Queue<TreeNode> mainQueue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();


        // Step3 - Check the node if not null and add to mainQueue
        if (node != null)
            mainQueue.add(node);


        // Step4 - Traverse through both the main queue and temp  queue
        while (!mainQueue.isEmpty() || !tempQueue.isEmpty()) {

            // Step5 - For every value in the main Queue, Add its children to the temp Queue
            while (!mainQueue.isEmpty()) {
                TreeNode childNode = mainQueue.remove();

                if (childNode.left != null)
                    tempQueue.add(childNode.left);

                if (childNode.right != null)
                    tempQueue.add(childNode.right);
            }

            // Step6 - Add a breaker
            // If this hits, means we are at the BOTTOM of the tree
            if (tempQueue.size() == 0)
                break;

            // Step7 - Dont forget to reset the value to zero
            // Remember we only wan the last value at the very bottom
            sum = 0;

            // Step8 - Calculcate the total in the tempQueue
            // Transfer all the values to the main queue ...why ? Now the temp becomes the main
            while (!tempQueue.isEmpty()) {
                TreeNode childNode = tempQueue.remove();
                mainQueue.add(childNode);
                sum += childNode.val;
            }
            System.out.println("Sum: " + sum);
        }

        return sum;
    }

}
