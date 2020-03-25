package LinkedList.MiddleOfLinkedList;

public class MiddleOfLinkedList {

    public static void main(String [] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node4.next = node5;
        node5.next = node6;


        ListNode node = middleNode(node1);
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode middleNode(ListNode node) {
        int count = 0;

        // Step1 - If only one node. Return Node
        if (node.next == null)
            return node;

        // Setp2 - Create pointers to keep track of positions
        ListNode pointer1 = node;
        ListNode pointer2 = node.next.next;

        // Step3 - Traverse through node
        while (pointer1 != null) {


            // Step4 - Check if pointer2 and next is null. Break if they are
            if (pointer2 == null || pointer2.next == null)
                break;


            System.out.println("Count: " + count + "    Pointer1: " + pointer1.val + "      Pointer2: " + pointer2.val);

            // Update the positions.
            // p1 should move by 1
            // p2 should move by 2
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;

            // Increase count by 2. Because we want to know the total size
            // If size of 5 ...then 5 % 2 = 1, hence we leave middle element
            // If size of 6  ... then 6 % 2 = 0, hence we take the middle.next node
            count = count + 2;

        }



        return count % 2 == 1 ? pointer1 : pointer1.next;
    }
}
