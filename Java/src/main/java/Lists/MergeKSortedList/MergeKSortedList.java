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

        // Step1 - Create Root node to return. Also create currentNode to keep track of current
        ListNode root = null;
        ListNode currentNode = null;

        // Step2 - Traverse all ListNode and find min value
        while (!traversedAllList(lists)) {

            // Step2b - Fetch Smallest Node
            ListNode minNode = fetchSmallestNode(lists);

            // Step3 - Add smallestNode to currentNode
            if (root == null) {
                root = minNode;
                currentNode = root;
            } else {
                currentNode.next = minNode;
                currentNode = currentNode.next;
            }

            System.out.println("MinNode: " + minNode.val);
        }

        return root;
    }

    // Check if each ListNode in the list have been traversed
    // Return False if havent
    // Return True is all listNode is null
    private static boolean traversedAllList(ListNode[] lists) {
        for (int i=0; i < lists.length; i++) {
            if (lists[i] != null)
                return false;
        }
        return true;
    }

    // Fetch the smallestNode
    private static ListNode fetchSmallestNode(ListNode[] lists) {
        int minNodeIndex = -1;

        // Step1 - Traverse each ListNode in the list and check for smallest value
        for (int i=0; i < lists.length; i++) {

            // If current ListNode is null, means we reached the end of the list
            if (lists[i] == null)
                continue;
            else if (lists[i] != null && minNodeIndex == -1)    // Find the first NON null value in the list and assign it to minNodeIndex
                minNodeIndex = i;

            // Check if the current node is smaller than the minNodeIndex
            if (lists[minNodeIndex].val > lists[i].val)
                minNodeIndex = i;
        }

        // Fetch Node and update its pointer to the next one
        ListNode minNode = lists[minNodeIndex];
        lists[minNodeIndex] = minNode.next != null ? lists[minNodeIndex].next : null;


        return minNode;
    }


}


/**
 Notes
 - Abit tricky but too bad

 Solution
 - Traverse the list in parallel
 - Compare each pointer in the ListNode array and find the smallest
 - Add the smallest to the root


 */