package Trees.MaxDepthNaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaxDepthNaryTree {
    public static void main(String [] args) {
        Node treeNode1 = new Node(1);
        Node treeNode2 = new Node(3);
        Node treeNode3 = new Node(2);
        Node treeNode4 = new Node(4);
        Node treeNode5 = new Node(5);
        Node treeNode6 = new Node(6);
        Node treeNode7 = new Node(7);

//        List<Node> list3 = new ArrayList<Node>();
//        list3.add(treeNode7);
//        treeNode5 = new Node(7, list3);

        List<Node> list2 = new ArrayList<Node>();
        list2.add(treeNode5);
        list2.add(treeNode6);
        treeNode2 = new Node(3, list2);

        List<Node> list1 = new ArrayList<Node>();
        list1.add(treeNode2);
        list1.add(treeNode3);
        list1.add(treeNode4);
        treeNode1 = new Node(1, list1);


        System.out.println("MaxDepth: " + maxDepth(treeNode1));
    }

    public static int maxDepth(Node root) {

        // If Node is null, there is no depth. Hence return 0
        if (root == null)
            return 0;

        // Here we know root exist so depth starts off at 1
        int depth = traverseNode(root, 0, 0);
        return depth;
    }

    private static int traverseNode(Node node, int maxDepth, int currentDepth) {


        List<Node> nodeList = node.children;
        if (nodeList == null)
            return currentDepth + 1;

        for (Node childNode : nodeList) {
            int childDepth = traverseNode(childNode, maxDepth, currentDepth + 1);
            maxDepth = Math.max(maxDepth, childDepth);
            System.out.println("Node: " + node.val + "  ChildDepth: " + childDepth + "  MaxDepth: " + maxDepth);
        }

        return maxDepth;
    }


}
