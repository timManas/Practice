package Trees.DeepestNodeAndReturnForest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DeepestNodeAndReturnForest {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//
//        treeNode3.right = treeNode6;
//        treeNode3.left = treeNode7;

        treeNode3.right = treeNode4;


        int [] to_delete = {2,1};

        System.out.println("Forest: " + delNodes(treeNode1, to_delete));
    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        // Step1 - Create output variable
        List<TreeNode> list = new ArrayList<>();

        // Step2 - Fetch Set in order
        // Why ? Easier checking if node value is to be deleted
        Set<Integer> set = new TreeSet<>();
        for (int i : to_delete)
            set.add(i);

        // Step3 - Traverse tree while updating list
        traverseTree(root, set, list);

        // Step4 - Check the root node if in list to be deleted
        if (set.contains(root.val))
            addChildNodeToList(root, list);     // Add its children to the list
        else
            list.add(root);                     // Add root to list

        return list;
    }

    // Use a Post Order Traversal
    private static void traverseTree(TreeNode node, Set<Integer> set, List<TreeNode> list) {

        // Step1 - Check if node is null
        if (node == null)
            return;

        // Step2 - Traverse left and right node until we each the bottom
        traverseTree(node.left, set, list);
        traverseTree(node.right, set, list);

        // Step3 - Check the child nodes and see if they are to be deleted
        // If so, add grand child nodes to list and delete child node
        if (node.left != null && set.contains(node.left.val)) {
            addChildNodeToList(node.left, list);         // Add the left and right grandchild nodes to list
            node.left = null;
        }

        if (node.right != null && set.contains(node.right.val)) {
            addChildNodeToList(node.right, list);         // Add the left and right grandchild nodes to list
            node.right = null;
        }
    }

    // Add the Grandchild nodes to the list
    private static void addChildNodeToList(TreeNode tempNode, List<TreeNode> list) {
        if (tempNode.left != null)
            list.add(tempNode.left);
        if (tempNode.right != null)
            list.add(tempNode.right);
    }
}

/**
 Notes
 - Quite simple actually
 - nothing crazy hard about this problem

 Solution
 1. Use set instead of array to check if node.value is present
 2. Traverse the tree using Post order
    why ? We want to start from the bottom and work our way up
 3. If we hit a child node which we have to delete
    > Add the grand child nodes to the list
    > Delete the reference to the child node
    > Hence we use Post order traversal
 4. Once we finish, we check the root node
    > If root node is also in the list to be deleted
    > We add the child nodes to the list
    > Otherwise, we add the entire root to the list
 */
