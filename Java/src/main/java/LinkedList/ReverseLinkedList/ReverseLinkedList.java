package LinkedList.ReverseLinkedList;

public class ReverseLinkedList {
    public static void main(String [] args) {

        int [] list1 = {1, 2, 4};
        ListNode l1 = createListNode(list1);


        ListNode listNode = reverseList(l1);
        System.out.println(listNode);

    }

    private static ListNode createListNode(int[] list) {
        ListNode listNode = null;
        ListNode prevListNode = null;
        for (int i=list.length - 1; i >= 0; i--) {
            listNode = new ListNode(list[i]);

            if (prevListNode == null) {
                prevListNode = listNode;
                continue;
            }

            listNode.next = prevListNode;
            prevListNode = listNode;
        }

        return listNode;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reversedNode = null;
        ListNode currentNode = head;
        ListNode nextNode;

        while (currentNode != null) {

            ListNode newNode = new ListNode(currentNode.val);

            if (reversedNode == null) {
                reversedNode = newNode;
                currentNode = currentNode.next;
                continue;
            }

            nextNode = currentNode.next;
            newNode.next = reversedNode;
            reversedNode = newNode;
            currentNode = nextNode;
        }

        return reversedNode;
    }
}
