package Trees.AverageOfLevelsInBinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageOfLevelsInBinaryTree {

    public static void main (String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;


        System.out.println("Avg of Levels: " + averageOfLevels(treeNode1));
    }

    public static List<Double> averageOfLevels(TreeNode node) {

        // Step1 - Create the list to be outputted
        List<Double> list = new ArrayList<>();

        // Step2 - Create the mainQueue and temp Queue
        // why ? Main Queue will store the parents and put the child nodes on temp Queue.
        // Then later, tempQueue will be main Queue
        Queue<TreeNode> mainQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();

        // Step3 - Add the first Element
        mainQueue.add(node);

        // Step4 - Traverse both Queues. Only stop when both queues are empty
        while (!mainQueue.isEmpty() || !tempQueue.isEmpty()) {

            // Step5 - Set the sum and size variables. Need this to calculate average to be put in list arraylist
            double sum = 0;
            int size = 0;

            // Step6 - Traverse Main Queue
            // Place child in Temp Queue
            while (!mainQueue.isEmpty()) {
                TreeNode childNode = mainQueue.remove();

                // Step7 - Take the sum of all the mainQueues values
                sum = sum + childNode.val;

                // Step8 - Place in Temp Queue
                if (childNode.left != null)
                    tempQueue.add(childNode.left);
                if (childNode.right != null)
                    tempQueue.add(childNode.right);

                ++size;
            }

            // Step 9 = Calculatet he average and place in arraylist 'list'
            list.add(sum / size);


            // Step10 - Convert tempQueue to main QUeue
            while (!tempQueue.isEmpty())  {
                mainQueue.add(tempQueue.remove());
            }
        }

        // Return list
        return list;
    }
}

/**
 Solution
 - You will need two queues. Main Queue and temp queue.
 - The main queue will place child node into temp queue
 - Once we finish the main queue, we calculate the average
 - Then we make temp queue to tbe main queue
 - We do this until we traverse every level using BFS
 */
