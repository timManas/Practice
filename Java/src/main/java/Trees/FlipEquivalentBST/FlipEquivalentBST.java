package Trees.FlipEquivalentBST;

import java.util.*;

public class FlipEquivalentBST {

    public static void main(String [] arg) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode8;

        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode22 = new TreeNode(3);
        TreeNode treeNode33 = new TreeNode(2);
        TreeNode treeNode44 = new TreeNode(6);
        TreeNode treeNode55 = new TreeNode(4);
        TreeNode treeNode66 = new TreeNode(5);
        TreeNode treeNode77 = new TreeNode(8);
        TreeNode treeNode88 = new TreeNode(7);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode22.right = treeNode44;
        treeNode33.left = treeNode55;
        treeNode33.right = treeNode66;
        treeNode66.left = treeNode77;
        treeNode66.right = treeNode88;

        System.out.println("Is tree Flip Equivalent ? " + flipEquiv(treeNode1, treeNode11));
    }

    public static boolean flipEquiv(TreeNode rootA, TreeNode rootB) {

        // Step1 - Make sure that rootA && rootB exists
        if (rootA == null && rootB == null)                     // if both null, return true
            return true;
        else if (rootA != null && rootB == null)
            return false;
        else if (rootA == null && rootB != null)
            return false;


        // Step2 - Create Queues for BFS Traversal
        Queue<TreeNode> mainQueueA = new LinkedList<>();
        Queue<TreeNode> tempQueueA = new LinkedList<>();
        Queue<TreeNode> mainQueueB = new LinkedList<>();
        Queue<TreeNode> tempQueueB = new LinkedList<>();

        // Step3 - Add first nodes to the queues
        mainQueueA.add(rootA);
        mainQueueB.add(rootB);

        // Step4 - Traverse both trees at the same time while keep track of their temporary queues
        // Why do we need tempQueues ? Because for every level we want to keep track of all the children
        // The tempQueues are emptied and placed into the mainQueue
        while (!mainQueueA.isEmpty() || !mainQueueB.isEmpty() || !tempQueueA.isEmpty() || !tempQueueB.isEmpty()) {

            while (!mainQueueA.isEmpty() || !mainQueueB.isEmpty()) {
                TreeNode nodeA = mainQueueA.remove();
                TreeNode nodeB = mainQueueB.remove();
                System.out.println("NodeA: " + nodeA.val + "        NodeB: " + nodeB.val);

                // Step5 - Add to respective  list
                if (nodeA.left != null)
                    tempQueueA.add(nodeA.left);

                if (nodeA.right != null)
                    tempQueueA.add(nodeA.right);

                if (nodeB.left != null)
                    tempQueueB.add(nodeB.left);

                if (nodeB.right != null)
                    tempQueueB.add(nodeB.right);
            }

            // Step6 Move TempQueue to mainQueue
            mainQueueA.addAll(tempQueueA);
            mainQueueB.addAll(tempQueueB);

            // Step7 - Compare both tempQueues
            // Here we compare the nodes and its childNodes
            if (!isMatch(tempQueueA, tempQueueB))
                return false;

            //Step8 - Clear the tempQueue incase we missed anything
            tempQueueA.clear();
            tempQueueB.clear();
        }

        // Step9 - If we reach the bottom and still no issues, everything is a match
        return true;
    }


    // Checks if two Queues are a match
    // How ? We use a list to keep track of the order  and use a set to do a comparison
    private static boolean isMatch(Queue<TreeNode> tempQueueA, Queue<TreeNode> tempQueueB) {

        // Step1 - Initialize list
        List<TreeNode> listA = new ArrayList<>();
        List<TreeNode> listB = new ArrayList<>();

        // Step2 - Populate List
        while(!tempQueueA.isEmpty()) {
            listA.add(tempQueueA.remove());
        }
        while (!tempQueueB.isEmpty()) {
            listB.add(tempQueueB.remove());
        }

        // Step3 - Sort List
        sortByNodeVal(listA);
        sortByNodeVal(listB);

        // Step4 - Check size of list match
        if (listA.size() != listB.size())
            return false;

        // Step5 - Traverse both list
        // If matched, both list should have the EXACT same val, left & right child nodes
        // We use a SET to do comparison if all three match using "containsAll"
        for (int i=0; i < listA.size(); i++) {
            TreeNode nodeA = listA.get(i);
            TreeNode nodeB = listB.get(i);

            TreeSet<Integer> setA = new TreeSet();
            TreeSet<Integer> setB = new TreeSet();

            setA.add(nodeA.val);
            if (nodeA.left != null)
                setA.add(nodeA.left.val);
            if (nodeA.right != null)
                setA.add(nodeA.right.val);

            setB.add(nodeB.val);
            if (nodeB.left != null)
                setB.add(nodeB.left.val);
            if (nodeB.right != null)
                setB.add(nodeB.right.val);

            if (!setA.containsAll(setB))
                return false;
        }

        return true;
    }

    private static void sortByNodeVal(List<TreeNode> list) {
        Collections.sort(list, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return ((Comparable)o1.val).compareTo(o2.val);
            }
        });
    }

}

/**
 Notes
 - Longest fucker everrr. Took 3 days to write
 - Solution is simple atually
 - Just use BFS to traverse both trees
    > While traversing we check each nodes value, left and right child nodes  and compare it to the other tree
 - Watch out for the two while loops.
    > First while loop only serves as a wrapper
    > The second while loop iterates through each node at each level
    > Once the iteration is done, we place all the values from the tempQueue to the mainQueue

 Solution
 1. Create 4 Queues
    > Two MainQueues
    > Two TempQueues
 2. We use the tempQueues to keep track of each child  for EVERY level
 3. Once we finish each level, we compare the queues to each other
 4. If there is a mismatch, we return false.
 5. Repeat until all 4 Queues are empty


 */
