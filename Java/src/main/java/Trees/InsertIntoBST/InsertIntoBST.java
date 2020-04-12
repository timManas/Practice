package Trees.InsertIntoBST;

public class InsertIntoBST {

    enum Type {
        Left,
        Right
    }

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        int val = 5;

        TreeNode insertNode = insertIntoBST(treeNode1, val);
        System.out.println(insertNode.val);
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        traverseTree(root, val);
        return root;
    }

    private static void traverseTree(TreeNode node, int val) {

        if (node == null) {     // Step1 - Check if Node is null  > Return if it is
            return;

        } else if (node.val == val) {       // Step2 - Check if value already exists ? Dont do anyhting if it does
            System.out.println("Found Value");
            return;

        } else if (val < node.val) {        // Step3 - Check if value is smaller than current node val
            traverseTree(node.left, val);

            // Step3b - If We are at the Node before it be comes null ...
            // We create a new Node
            if (node.left == null)
                insertNode(node, val, Type.Left);


        } else if (val > node.val) {        // Step4 - Check if value is smaller than current node val
            traverseTree(node.right, val);

            // Step4b - If We are at the Node before it be comes null ...
            // We create a new Node
            if (node.right == null)
                insertNode(node, val, Type.Right);
        }

    }

    // Add a new Node
    private static void insertNode(TreeNode node, int val, Type type) {
        TreeNode newNode = new TreeNode(val);
        if (type == Type.Left)
            node.left = newNode;
        else if (type == Type.Right)
            node.right = newNode;
    }
}


/**
 Solution
 1. Perform binary search on Tree
    > HOW  ?
        - Check if target is smaller than node .. traverse Left
        - Check if target is larger than node ... traverse Right
 2. Find right before it becomes null .. @ParentNode
    > Then add a new node there. Thats it =)
 */
