package LinkedList.DeleteNNodesAfterMNodesLinkedList;

public class DeleteNNodesAfterMNodesLinkedList {
    public static void main (String [] args) {
        int m = 2;
        int n = 3;

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(10);
        ListNode node11 = new ListNode(11);
        ListNode node12 = new ListNode(12);
        ListNode node13 = new ListNode(13);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;

        ListNode outputNodes = deleteNodes(node1, m, n);
        ListNode current = outputNodes;
        while (current != null) {
            System.out.print(current.val + ",");
            current = current.next;
        }

    }

    public static ListNode deleteNodes(ListNode head, int traverseNodesLimit, int deleteNodesLimit) {

        // Step1 - Keep track of the currentNode and the lastNodeBeforeDeletion
        ListNode current = head;
        ListNode lastNodeBeforeDeletion = null;

        int traversedCounter = 0;
        int deletedCounter = 0;

        // Step2 - Traverse linked list one by one
        while(current != null) {

            // Step3- Check if the traversedCounter is smaller than the traverseLimit (m)
            // Continue traversing
            // If Right before the deletion node, we save that value
            if (traversedCounter < traverseNodesLimit) {
                System.out.println(current.val);

                if (traversedCounter + 1 == traverseNodesLimit) {
                    lastNodeBeforeDeletion = current;
                }

                ++traversedCounter;

            }
            // Step3b - Check if the deletedCounter is smaller than the delteNodeLimit
            else if (deletedCounter < deleteNodesLimit){
                System.out.println("X:" + current.val);

                ++deletedCounter;

                // Step4 - Verify if the deleteNodeCounter == deleteNodesLimit OR last node in list
                // We point to the next value and reset the counters
                if (deletedCounter == deleteNodesLimit || current.next == null) {
                    lastNodeBeforeDeletion.next = current.next;
                    traversedCounter = 0;
                    deletedCounter = 0;
                }
            }

            // Step5 - Move onto the next
            current = current.next;
        }

        return head;
    }
}

/**
 Note
 - Add to the counter

 Solution
 - Traverse LL one by one
 - Create two counters (1 x current node, 1 for lastNodeBeforeDeletion
 - Traverse the LL by TraverseCounter first, then traverse LL by DeletionCounter
 - Once both counters have been reached, we reset the counter and set counter to the new one
 - Repeat until end
 */