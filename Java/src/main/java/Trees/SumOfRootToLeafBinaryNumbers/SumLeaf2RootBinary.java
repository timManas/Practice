package Trees.SumOfRootToLeafBinaryNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumLeaf2RootBinary {

    public static void main(String [] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(0);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(0);
        TreeNode node7 = new TreeNode(1);


        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;


        System.out.println("SumOfRootToLeaf: " + sumRootToLeaf(node1));
    }

    public static int sumRootToLeaf(TreeNode node) {
        // Step1 - Create sum which stores total sum
        int sum = 0;

        // Step2 - Create list and string builder to keep track of values
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Step3 - Traverse Tree while keeping track of list
        traverseTree(node, list, sb);

        // Step4 - Once list has been populated. We calculate the sum by Trarverse List
        for (String binary : list) {
            sum += Integer.parseInt(binary, 2);
        }


        return sum;
    }

    private static void traverseTree(TreeNode node, List<String> list, StringBuilder sb) {

        // Step1 - Check if node is null. Return and do nothing
        if(node == null) {
            return;
        }

        // Step2 - Append value to string builder
        sb.append(node.val);
        System.out.println("Node: " + node.val);

        // Step3 - Traverse left and right node
        traverseTree(node.left, list, sb);
        traverseTree(node.right, list, sb);

        // Step4 - If lead node, then we place in list
        if (node.left == null && node.right == null) {
            System.out.println(sb.toString());
            list.add(sb.toString());
        }

        // Step5 - Once we reach a parent node, we traverse back by removing the last element
        sb.deleteCharAt(sb.length() - 1);
    }

}
