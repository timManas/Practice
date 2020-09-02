package Trees.CloneNaryTree;

import java.util.ArrayList;

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
        Node root = new Node(node.val);

        return root;
    }

}
