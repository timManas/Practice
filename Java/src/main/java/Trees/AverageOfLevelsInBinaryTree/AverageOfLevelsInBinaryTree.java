package Trees.AverageOfLevelsInBinaryTree;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AverageOfLevelsInBinaryTree {

    public static void main (String [] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        treeNode4.left = treeNode6;
        treeNode4.right = treeNode7;

        System.out.println("Avg of Levels: " + averageOfLevels(treeNode1));
    }

    public static List<Double> averageOfLevels(TreeNode node) throws InterruptedException {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> mainQueue = new Queue<>();
        Queue<TreeNode> tempQueue = new Queue<>();

        mainQueue.enqueue(node);

        while (!mainQueue.isEmpty()) {

            TreeNode childNode = mainQueue.dequeue();
            tempQueue.enqueue(childNode);
        }

        return list;
    }



}
