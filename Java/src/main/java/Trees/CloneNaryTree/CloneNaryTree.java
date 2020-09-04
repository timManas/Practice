package Trees.CloneNaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneNaryTree {

    public static void main(String [] args) {
        Node treeNode1 = new Node(1);
        Node treeNode2 = new Node(3);
        Node treeNode3 = new Node(2);
        Node treeNode4 = new Node(4);
        Node treeNode5 = new Node(5);
        Node treeNode6 = new Node(6);


        ArrayList<Node> list1 = new ArrayList<>();
        list1.add(treeNode2);
        list1.add(treeNode3);
        list1.add(treeNode4);
        treeNode1.children = list1;

        ArrayList<Node> list2 = new ArrayList<>();
        list2.add(treeNode5);
        list2.add(treeNode6);
        treeNode2.children = list2;

        Node cloneTree = cloneTree(treeNode1);
        System.out.println("ClonedTree: " + cloneTree.val);

    }

    public static Node cloneTree(Node node) {

        // Step1 - Return nothing if node is null
        if (node == null)
            return null;

        // Step2 - Create a new node
        Node root = new Node(node.val);

        // Step3 - Create Queues for traversal
        Queue<Node> mainQueue = new LinkedList<>();
        Queue<Node> clonedQueue = new LinkedList<>();
        mainQueue.add(node);
        clonedQueue.add(root);

        // Step4 - Traverse Tree
        traverseTree(mainQueue, clonedQueue);
        return root;
    }

    private static void traverseTree(Queue<Node> mainQueue, Queue<Node> clonedQueue) {
        // Use Breath first Traversal
        while (!mainQueue.isEmpty() && !clonedQueue.isEmpty()) {

            // Step1 - Fetch current nodes in the Queues
            Node currentNode = mainQueue.remove();
            Node clonedCurrentNode = clonedQueue.remove();

            // Step2 - Find the children
            List<Node> childNodeList = currentNode.children;
            List<Node> clonedChildNodeList = new ArrayList<>();

            // Step3 - Create clonedNode for each child Node in the original
            for (Node childNode : childNodeList) {
                Node clonedChildNode = new Node(childNode.val);

                // Step4 - Add to Queues
                mainQueue.add(childNode);
                clonedQueue.add(clonedChildNode);

                // Step5 - Add to ArrayLis
                clonedChildNodeList.add(clonedChildNode);
            }
            // Step5 - Add to list ... Need this so curent Node knows all the children
            clonedCurrentNode.children = clonedChildNodeList;
        }
    }
}

/**
 Notes
 - Not as difficult as it seems but just tedious
 - Uses breadth first traversal

 Solution
 1. Use two queues to traverse from top to bottom
 2. For each node, find the child Nodes
 3. For each childNode, create a new one and add it to cloned ArrayList
 4. Continue until both Queues are empty
 */
