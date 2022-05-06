package LinkedList.MaxTwinSumLinkedList;

import java.util.ArrayList;
import java.util.List;

public class MaxTwinSumLinkedList {
    public static void main(String [] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println("Pair Sum: " + pairSum(node1) + "\n");


        ListNode node1a = new ListNode(4);
        ListNode node2a = new ListNode(2);
        ListNode node3a = new ListNode(2);
        ListNode node4a = new ListNode(3);

        node1a.next = node2a;
        node2a.next = node3a;
        node3a.next = node4a;
        System.out.println("Pair Sum: " + pairSum(node1a) + "\n");
    }

    public static int pairSum(ListNode node) {
        int sum = 0;

        // Step1 - Push linkedList to list
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }


        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            sum = sum < (list.get(start) + list.get(end)) ? (list.get(start) + list.get(end)) : sum;

            start++;
            end--;
        }



        return sum;
    }
}
