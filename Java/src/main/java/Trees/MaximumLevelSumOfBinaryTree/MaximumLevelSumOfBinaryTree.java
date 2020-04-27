package Trees.MaximumLevelSumOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(-8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        System.out.println("Maximum Level Sum: " + maxLevelSum(treeNode1));
    }

    public static int maxLevelSum(TreeNode root) {

        // Step1 - Create variable to output
        int level = 0;

        // Step2 - Create list to store all the sum of each level
        ArrayList<Integer> list = new ArrayList<>();

        // Step3 - Create two queues
        // One to iterate and another one to store the values of next level
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();

        // Step4 - Add root to list and main queue
        list.add(root.val);
        queue.add(root);

        // Step5 - Traverse Main Queue and temp queue
        while (!queue.isEmpty() || !tempQueue.isEmpty()) {

            int total = 0;                          // Instantiate the total sum variable

            // Step6 - Traverse main queue
            // We also calculate the total here for each elements children in the main queue
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove();

                // Step7 - Add to temp queue
                if (node.left != null) {
                    total += node.left.val;
                    tempQueue.add(node.left);
                }

                // Step7 - Add to temp queue
                if (node.right != null) {
                    total += node.right.val;
                    tempQueue.add(node.right);
                }
            }

            // Step8 - Once main loop finishes, we have total. Add to list
            list.add(total);

            // Step9 - Move all elements from Temp Queue to Main Queue
            while (!tempQueue.isEmpty())
                queue.add(tempQueue.remove());

        }

        System.out.println("List: " + list);

        // Step10 - Find Smallest level X
        int currentLargest = Integer.MIN_VALUE;
        for (int i=0; i < list.size(); i++) {
            if (currentLargest < list.get(i)) {
                currentLargest = list.get(i);
                level = i;
            }
        }

        return level + 1;           // We add by one because index starts at 1 ...which is dumb
    }
}


/**
 Solution
 - Use BFS to traverse top down
 - Use two queues. One to iterate and another one to place child nodes to calculate the total
 - We place each child node in temp queue to calculate their total
 - Once finished, we place values in temp to main queue and repeat process
    Why ? So we can calcualte the total at each level
 - We also use a list to calculate total at each level
 */