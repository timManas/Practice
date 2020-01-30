package LinkedList.DeleteNodeFromLinkedList;

public class DeleteNodeFromLinkedList {

    public static void main(String [] args) {

        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        deleteNode(l1);

        ListNode node = l1;
        while (node != null) {
            System.out.println("Node: " + node.val);
            node = node.next;
        }
    }

    public static  void deleteNode(ListNode node) {

        while (node != null && node.next != null) {
            node.val = node.next.val;
            node = node.next;
            System.out.println("CurrentVal: " + node.val);
//            node = node.next;
        }

        node.next = null;
    }
}
