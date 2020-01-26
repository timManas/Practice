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


    // Solution #1 - Traverse through LL and add to LinkedHashSet
    public static ListNode deleteDuplicates(ListNode node) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        int index = 0;
        while (node != null) {
            set.add(node.val);
            node = node.next;
            index++;
        }

        ListNode prevNode = null;
        ListNode startNode = null;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            ListNode tempNode = new ListNode(number);
            if (startNode == null) {
                startNode = tempNode;
            } else {
                prevNode.next = tempNode;
            }


            prevNode = tempNode;
        }



        return startNode;
    }


}
