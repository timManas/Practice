package Trees.ConvertArray2BinaryTree;

public class ConvertArray2BinaryTree {
    public static void main(String [] args) {
        int nums [] = {-10,-3,0,5,9};
        printTree(sortedArrayToBST(nums));
    }

    private static void printTree(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " -> ");
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        int middle = nums[(nums.length - 1) / 2];
        TreeNode root = new TreeNode(middle);
        root.left = createBST(nums, 0, (nums.length - 1) / 2);
        root.right = createBST(nums, (nums.length + 1) / 2, nums.length);

        return root;
    }

    private static TreeNode createBST(int[] nums, int startIndex, int endIndex) {

        // If the Start and End Index are the same, We stop the loop
        if (startIndex >= endIndex)
            return null;

        // Step2 - Fetch the middle Element
        int middleIndex = (startIndex + endIndex) / 2;
        int middle = nums[middleIndex];
        System.out.println("MiddleIndex: " + middleIndex + "    MiddleElement:  " + middle);

        // Step3 - Create the node
        TreeNode newNode = new TreeNode(middle);

        // Step4 - Traverse the left and Right Subtree
        newNode.left = createBST(nums, startIndex, middleIndex);
        newNode.right = createBST(nums, middleIndex + 1, endIndex);

        return newNode;
    }
}

/**
 Solution
 Basically the idea is that
 1. We get the middle
 2. Create a node and assign value to the middle
 3. Traverse the left and assign it ot the node.left
 4. Traverse the Right and assign it to the node.right
 5. Return the root node



 */
