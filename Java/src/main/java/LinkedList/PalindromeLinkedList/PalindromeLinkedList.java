package LinkedList.PalindromeLinkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {

    public static void main(String [] args) {


        ListNode l1 = new ListNode(-129);
        ListNode l2 = new ListNode(-129);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(1);
//        ListNode l5 = new ListNode();

        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;

        System.out.println("IsPalindorme: " + isPalindrome(l1));
        ListNode node = l1;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode currentNode = head;
        while(currentNode != null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int forwardIndex = 0;
        int backwardIndex = list.size() - 1;
        while (forwardIndex < backwardIndex) {
            int left = list.get(forwardIndex);
            int right = list.get(backwardIndex);
            if ( left != right)
                return false;

            forwardIndex++;
            backwardIndex--;
        }

        return true;
    }


}

/**

 Solutions
 1. Convert LinkedList into Array
 2. Split in Half
    > Store values in list in order
    > Once get to the middle,
    > Traverse Backwards the list while matching the current LinkedList



 */
