package LinkedList.RemovedDuplicatesFromLL;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromLinkedList {


    public static void main(String [] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(3);


        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;


        ListNode output = deleteDuplicates(l1);
        System.out.println("----");
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }

    }

    // Solution #2 - Remove Linkedlist nodes in place
    public static ListNode deleteDuplicates(ListNode node) {

        if (node == null)
            return node;

        ListNode head = node;
        ListNode sortedNode = node;
        ListNode currentNode = node.next;


        while (currentNode != null) {

            if (sortedNode.val == currentNode.val) {
                sortedNode.next = currentNode.next;

                // Check if the next values are indeed special
                if (sortedNode.val != currentNode.val) {
                    sortedNode = currentNode.next;
                }
            } else {
                sortedNode = currentNode;
            }



            currentNode = currentNode.next;
        }



        return head;
    }


//    // Solution #1 - Traverse through LL and add to LinkedHashSet
//    public static ListNode deleteDuplicates(ListNode node) {
//        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
//
//        // Traverse a place in set
//        while (node != null) {
//            set.add(node.val);
//            node = node.next;
//        }
//
//        // Create new LinkedList with No duplicates
//        ListNode prevNode = null;
//        ListNode startNode = null;
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            ListNode tempNode = new ListNode(number);
//            if (startNode == null) {
//                startNode = tempNode;
//            } else {
//                prevNode.next = tempNode;
//            }
//
//
//            prevNode = tempNode;
//        }
//
//
//
//        return startNode;
//    }


}
