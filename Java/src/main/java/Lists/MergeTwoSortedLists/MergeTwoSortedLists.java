package Lists.MergeTwoSortedLists;

public class MergeTwoSortedLists {

    public static void main(String [] args) {

        int [] list1 = {1, 2, 4};
        int [] list2 = {1, 3, 4};
        ListNode l1 = createListNode(list1);
        ListNode l2 = createListNode(list2);

        ListNode listNode = mergeTwoLists(l1, l2);
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


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode listNode = null;
        ListNode prevNode = null;
        ListNode currentNode = null;

        ListNode index1 = l1;
        ListNode index2 = l2;


        // Scenario #1 - One of is empty
        if (l1 == null)
            listNode = l2;

        if (l2 == null)
            listNode = l1;

        // Scenario #2 - Multiple Elements in Linkedlist
        while (index1 != null || index2 != null) {

            if (index1 == null) {
                currentNode = new ListNode(index2.val);
                index2 = index2.next;

            } else if (index2 == null) {
                currentNode = new ListNode(index1.val);
                index1 = index1.next;

            } else if (index1.val == index2.val) {         // Scenario #2a - Both are equal: Chose 1st one
                currentNode = new ListNode(index1.val);
                index1 = index1.next;

            } else if (index1.val > index2.val) {                          // Scenario #2b - l1val > l2val: Add l2val, Increment index2
                currentNode = new ListNode(index2.val);
                index2 = index2.next;

            } else if (index1.val < index2.val ) {                          // Scenario #2c - l1val < l2val: Add l1val, Increment index1
                currentNode = new ListNode(index1.val);
                index1 = index1.next;

            }

            if(prevNode == null) {
                listNode = currentNode;
                prevNode = currentNode;
                continue;
            }

            prevNode.next = currentNode;
            prevNode = currentNode;

        }

        return listNode;
    }

}
