package LinkedList.Medium_AddTwoNumbers;

import java.util.Arrays;
import java.util.Collections;

public class AddTwoNumbers {
    public static void main(String [] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1a = new ListNode(4);
        ListNode l1b = new ListNode(3);

        l1.next = l1a;
        l1a.next = l1b;

        ListNode l2 = new ListNode(5);
        ListNode l2a = new ListNode(6);
        ListNode l2b = new ListNode(4);

        l2.next = l2a;
        l2a.next = l2b;

        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Step #1 - Convert Linked List to Integer
        double num1 = convert2Integer(l1);
        double num2 = convert2Integer(l2);

        // Step #2 - Add Integer
        double total = num1 + num2;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Total: " + total);

        // Step #3 - Convert Answer to LinkedList
        System.out.println(total);
        ListNode result = convert2LL(total);

        return result;
    }

    public static double convert2Integer(ListNode listNode) {
        double value = 0;
        int counter = 0;

        while (listNode != null) {
            value += listNode.val * Math.pow(10, counter);
            counter++;
            listNode = listNode.next;
        }

        return value;
    }

    // Uses Recursion
    public static ListNode convert2LL(double total) {
        char [] array = String.valueOf((int)total).toCharArray();
        char [] reverseArray = new char[array.length];

        int counter = 0;
        for (int i=array.length-1; i >= 0; i--) {
            reverseArray[counter] = array[i];
            counter++;
        }

        ListNode pointer = null;
        ListNode prevNode = null;

        // Ex Total: 1234, 4 > 3 > 2 > 1
        for (int i = 0; i < array.length; i++) {
            ListNode node = new ListNode(reverseArray[0]);
            prevNode.next = node;
        }

        System.out.println(prevNode);

        return pointer;
    }


}
