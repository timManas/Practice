package Lists.MergeKSortedList;

public class MergeKSortedList {

    public static void main(String [] args) {

        // Create Array of ListNode
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode l31 = new ListNode(2);
        ListNode l32 = new ListNode(6);
        l31.next = l32;


        // Combine all ListNode into array
        ListNode[] list = new ListNode[3];
        list[0] = l11;
        list[1] = l21;
        list[2] = l31;

        // Merge K sorted list
        ListNode root = mergeKLists(list);

       // Print output
        while(root != null) {
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode root = null;

        while (!traversedAllList(lists)) {
            ListNode minNode = fetchSmallestNode(lists);

            if (root == null) {
                root = minNode;
            } else {
                root.next = minNode;
            }

            System.out.println("MinNode: " + minNode.val);
            root = minNode;
            root.next = null;
        }

        return root;
    }

    private static boolean traversedAllList(ListNode[] lists) {
        for (int i=0; i < lists.length; i++) {
            if (lists[i] != null)
                return false;
        }
        return true;
    }

    private static ListNode fetchSmallestNode(ListNode[] lists) {
        int minNodeIndex = 0;
        for (int i=0; i < lists.length; i++) {
            if (lists[minNodeIndex].val > lists[i].val)
                minNodeIndex = i;
        }

        // Fetch Node
        ListNode minNode = lists[minNodeIndex];
        lists[minNodeIndex] = lists[minNodeIndex].next;


        return minNode;
    }


}
