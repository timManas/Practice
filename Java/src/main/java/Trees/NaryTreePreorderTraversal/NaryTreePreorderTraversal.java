package Trees.NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {

    public static void main(String [] args) {
        Node treeNode1 = new Node(1);
        Node treeNode2 = new Node(2);
        Node treeNode3 = new Node(3);
        Node treeNode4 = new Node(4);
        Node treeNode5 = new Node(5);
        Node treeNode6 = new Node(6);

        List<Node> list3 = new ArrayList<Node>();
        list3.add(treeNode5);
        list3.add(treeNode6);
        treeNode3 = new Node(3, list3);

        List<Node> list1 = new ArrayList<Node>();
        list1.add(treeNode3);
        list1.add(treeNode2);
        list1.add(treeNode4);
        treeNode1 = new Node(1, list1);


        List<Integer> list = preorder(treeNode1);
        System.out.println("List PreOrder: " + list);
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();

        result = traverseNodes(root, result);

        return result == null ? new ArrayList<Integer>() : result;
    }

    private static List<Integer> traverseNodes(Node node, List<Integer> list) {

        // Step1 - Check id node is null
        if (node == null)
            return null;

        // Step2 - Check if child is null
        // If nul > Then leaf node, add node to list
        List<Node> nodeList = node.children;
        if (nodeList == null) {
            list.add(node.val);
            return list;
        }

        // Step3 - Add node to list
        list.add(node.val);

        // Step4 - Traverse through all the child Node
        for (Node childNode : nodeList) {
            traverseNodes(childNode, list);
        }

        return list;
    }
}


/**
 Solution
 1. PreOrder traversal requires to traverse root first, then left and right
    > Therefore, we can add the node.val first THEN traverse the child node (Step4)
 */