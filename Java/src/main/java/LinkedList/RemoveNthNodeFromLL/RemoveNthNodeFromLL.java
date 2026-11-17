package LinkedList.RemoveNthNodeFromLL;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromLL {
    public static void main(String [] args) {

        int n = 2;
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println("Remove Nth From End: " + removeNthFromEnd(l1, n) + "\n");


        int m = 1;
        ListNode m1 = new ListNode(1);
        System.out.println("Remove Nth From End: " + removeNthFromEnd(m1, m) + "\n");


        int b = 1;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        b1.next = b2;
        System.out.println("Remove Nth From End: " + removeNthFromEnd(b1, b) + "\n");

        int c = 2;
        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        c1.next = c2;
        System.out.println("Remove Nth From End: " + removeNthFromEnd(c1, c) + "\n");

    }

    public static ListNode removeNthFromEnd(ListNode node, int n) {
        List<ListNode> list = new ArrayList<>();

        ListNode start = node;

        while (node != null) {
            System.out.println("Node: " + node.val);
            list.add(node);
            node = node.next;
        }


        ListNode nthNode = list.get(list.size() - n);
        System.out.println("nthNode: " + nthNode.val);


        ListNode prevNode = null;
        try {
            prevNode = list.get(list.size() - n - 1);
        } catch(Exception e) {}


        ListNode nextNode = null;
        try {
            nextNode = list.get(list.size() - n + 1);
        } catch(Exception e) {}

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else if (prevNode == null && nextNode == null){
            return null;
        } else if (prevNode == null) {
            start = nextNode;
        }


        //Print New Node
        node = start;
        while (node != null) {
            System.out.println("val: " + node.val);
            node = node.next;
        }


        return start;
    }
}
