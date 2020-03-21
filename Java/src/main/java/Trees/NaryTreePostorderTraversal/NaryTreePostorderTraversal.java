package Trees.NaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {

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



        List<Integer> list = postorder(treeNode1);
        System.out.println("List PostOrder: " + list);

    }

    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();

        result = traverseNodes(root, result);

        return result == null ? new ArrayList<Integer>() : result;
    }

    private static List<Integer> traverseNodes(Node node, List<Integer> list) {

        if (node == null)
            return null;

        List<Node> nodeList = node.children;
        if (nodeList == null) {
            list.add(node.val);
            return list;
        }


        for (Node childNode : nodeList) {
            traverseNodes(childNode, list);
        }
        list.add(node.val);


        return list;
    }
}
