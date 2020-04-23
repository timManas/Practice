package Trees.FindElementsInContaminatedBT;

import java.util.LinkedList;
import java.util.Queue;

public class FindElements {

    TreeNode root;

    // We will use BFS to traverse the array top to bottom
    public FindElements(TreeNode root) {

        // Step 1 - Save a reference to the tree node
        this.root = root;

        // Step 2 - Create Queue for BFS
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.add(root);

        // Step3 - Traverse Three iteratively
        while (!queue.isEmpty()) {

            // Step3 - Remove the head
            TreeNode node = queue.remove();
            int x = node.val;
            System.out.println("Current Node: " + x);

            // Step4 - Add the left child node
            if (node.left != null) {

                // Step5 - We update the child node left value
                node.left.val = (2*x) + 1;
                queue.add(node.left);
            }

            // Step4 - Add the right child node
            if (node.right != null) {

                // Step5 - Update the child node right value
                node.right.val = (2*x) + 2;
                queue.add(node.right);
            }
        }
        System.out.println("Root: " + root.val);
    }



    // Traverse using BFS again
    // Why ? Because the tree created above is NOTTTT a BST. Hence we cant use DFS... ONLY BFS
    public boolean find(int target) {

        // Step1 - Create queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Traverse Tree
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            // Step3 - Check if current node equals target
            if (node.val == target)
                return true;

            // Step3 - Add left and right Node to queue
            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);

        }


        return false;
    }

}

/**
 Solution
 1. We use BFS to re-populate the Tree with the correct values
 2. We use BFS to find the values ... why ? Because the tree is NOT in a BST, hence we need to traverse from top to bottom
 3. We use a private instance of TreeNode root to access the tree for find(int target) method
    why ? How else are we suppose to fetch the instance with only argument is "target" ???
 */
