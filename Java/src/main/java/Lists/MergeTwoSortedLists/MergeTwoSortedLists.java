package Lists.MergeTwoSortedLists;

public class MergeTwoSortedLists {

    public static void main(String [] args) {

        int [] list1 = {1, 2, 4};
        int [] list2 = {1,3,4};
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

        return null;
    }

}
