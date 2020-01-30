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

        deleteNode(l3);

        ListNode node = l1;
        while (node != null) {
            System.out.println("Node: " + node.val);
            node = node.next;
        }
    }

    public static  void deleteNode(ListNode node) {

        // Step 1 - For every value, we set the value of the next node to the current node
        while (node != null && node.next != null) {
            node.val = node.next.val;
            System.out.println("CurrentVal: " + node.val);

            // Step2 - If we reach the last node, we assign to null to avoid duplicates
            if (node.next.next == null)
                node.next = null;
            else
                node = node.next;

        }


    }
}


/**
 Note
 - We are give the node to be deleted ...NOT THE HEADNODE

 Solution:
 - Since we are given the node to be "deleted"
 - We set the current value of the "to be deleted node" to the next node
 - The last node, we set to null to avoid duplicates
 */