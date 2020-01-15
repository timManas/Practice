package LinkedList.DetectLoopInLinkedList;

public class DetectLoopInLinkedList {

    public static void main(String [] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(-4);


        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l2;

        System.out.println("HasCycle: " + hasCycle(l1));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return false;

        ListNode moveSinglePointer = head;
        ListNode moveDoublePointer = head.next.next;


        while (moveSinglePointer != null && moveDoublePointer != null) {

            // If both pointers point to the exact same Node, then we have a loop
            if (moveSinglePointer.val == moveDoublePointer.val)
                return true;

            // If next or next.next is  null, we STOP and return false...NO LOOP
            if (moveDoublePointer.next == null || moveDoublePointer.next.next == null)
                return false;

            // Iterate
            moveSinglePointer = moveSinglePointer.next;
            moveDoublePointer = moveDoublePointer.next.next;
        }

        return false;
    }

}


/**

 Solution
 1. Use floyd algorithm
    > Create two pointers
    > Move one pointer by 1 ...i.e moveSinglePointer = moveSinglePointer.next;
    > Move the other pointer by 2 ... i.e moveDoublePointer = moveDoublePointer.next.next;
    > If both pointers point the exact same node, then we have a cycle

 */
