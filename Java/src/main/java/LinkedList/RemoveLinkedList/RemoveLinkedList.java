package LinkedList.RemoveLinkedList;

public class RemoveLinkedList {

    public static void main(String [] args) {

        int val = 2;
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
//        ListNode l5 = new ListNode(5);
//        ListNode l6 = new ListNode(6);
//        ListNode l6a = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6a;


        ListNode removedLinkedListNode = removeElements(l1, val);
        ListNode node = removedLinkedListNode;
//        ListNode node = l1;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode removeElements(ListNode head, int target) {

        ListNode originalPointer = head;
        ListNode currentNode = head;
        ListNode prevNode = null;

        while (currentNode != null) {

            if (currentNode.val == target) {
                // Start of the List
                if (prevNode == null) {             // If MATCH is at the firstNode
                    originalPointer = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;   // If MATCH is anywhere else.
                }
                currentNode = currentNode.next;
                continue;
            }

            // Iterate
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        return originalPointer;
    }

}
