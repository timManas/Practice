package LinkedList.IntersectionLinkedList;

public class IntersectionLinkedList {

    public static void main(String [] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode nodeA = new ListNode(5);
        ListNode nodeB = new ListNode(0);
        ListNode nodeC = new ListNode(1);
        ListNode nodeX = new ListNode(8);
        ListNode nodeY = new ListNode(4);
        ListNode nodeZ = new ListNode(5);

        node1.next = node2;
        node2.next = nodeX;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeX;
        nodeX.next = nodeY;
        nodeY.next = nodeZ;

        System.out.println("Intersection Node: " + getIntersectionNode(node1, nodeA).val);
    }



    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Step 1 - Find the difference
        int lengthA = fetchLength(headA);
        int lengthB = fetchLength(headB);
        ListNode longListNode = null;
        ListNode shortListNode = null;
        int difference = 0;

        if (lengthA <= lengthB) {
            longListNode = headB;
            shortListNode = headA;
            difference = lengthB - lengthA;
        } else {
            longListNode = headA;
            shortListNode = headB;
            difference = lengthA - lengthB;
        }
        System.out.println("LengthA: " + lengthA + "    LengthB: " + lengthB + "    Difference: " + difference);

        // Step 2 - Traverse Long Tree until difference is Zero
        while(difference > 0) {
            longListNode = longListNode.next;
            difference--;
        }

        // At this point, the longListNode and smallListNode should be in the exact same length
        System.out.println("Same Length");
        // Step 3 - If nodeA.next = nodeX.next then they are pointing to the same value
        while (longListNode != null && shortListNode != null) {
            System.out.println("Long: " + longListNode.val + "      Short: " + shortListNode.val);

            // If both are pointing to the exact same ADDRESS !!!!
            if (longListNode == shortListNode && longListNode.val == shortListNode.val)
                return longListNode;

            longListNode = longListNode.next;
            shortListNode = shortListNode.next;
        }

        return null;
    }

    private static int fetchLength(ListNode node) {
        int length = 0;
        ListNode tempHeadA = node;
        while (tempHeadA != null) {
            length++;
            tempHeadA = tempHeadA.next;
        }
        return length;
    }

}

/**
 Solution
 Step1 - Find the difference between two linkedlist
 Step2 - Traverse the longer LL until difference is zero
 Step3 - Traverse both long and short LL until null
    > while traversing, if Longer LL Node == Short LL Node and values match, then we have the exact same address
 


 */
