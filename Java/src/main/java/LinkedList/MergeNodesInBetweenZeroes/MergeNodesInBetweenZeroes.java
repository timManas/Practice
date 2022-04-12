package LinkedList.MergeNodesInBetweenZeroes;

public class MergeNodesInBetweenZeroes {
    public static void main(String [] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        printNode(mergeNodes(node1));



        ListNode node1a = new ListNode(0);
        ListNode node2a = new ListNode(1);
        ListNode node3a = new ListNode(0);
        ListNode node4a = new ListNode(3);
        ListNode node5a = new ListNode(0);
        ListNode node6a = new ListNode(2);
        ListNode node7a = new ListNode(2);
        ListNode node8a = new ListNode(0);
        node1a.next = node2a;
        node2a.next = node3a;
        node3a.next = node4a;
        node4a.next = node5a;
        node5a.next = node6a;
        node6a.next = node7a;
        node7a.next = node8a;
        printNode(mergeNodes(node1a));

    }

    private static void printNode(ListNode mergeNodes) {
    }

    public static ListNode mergeNodes(ListNode head) {

    }
}
