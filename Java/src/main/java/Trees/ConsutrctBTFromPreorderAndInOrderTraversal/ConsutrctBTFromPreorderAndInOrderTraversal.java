package Trees.ConsutrctBTFromPreorderAndInOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class ConsutrctBTFromPreorderAndInOrderTraversal {

    public static void main(String [] args) {
        int [] pre = {3,9,20,15,7};
        int [] post = {9,3,15,20,7};

//        int [] pre = {1,2};
//        int [] post = {1,2};

        TreeNode output = buildTree(pre, post);
        System.out.println("Output: " + output.val);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        // Step1 - Create and populate list
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();

        // Step2 - Populate the list
        for (int i : preorder)
            preList.add(i);

        for (int i : inorder)
            inList.add(i);

        // Step3 - Create tree using Divide and Conquer
        TreeNode node = createTree(preList, inList);

        return node;
    }

    private static TreeNode createTree(List<Integer> preList, List<Integer> inList) {

        // Step1 - Check if preList or inList size > 0
        if (preList.size() == 0 || inList.size() == 0)
            return null;

        // Step2 - Check if size is 1
        if (inList.size() == 1) {
            return new TreeNode(inList.get(0));
        }

        // Step3 - Create New Node
        TreeNode node = new TreeNode(preList.get(0));
        System.out.println("Node: " + node.val);

        // Step4 - Find the root of the InOrderList
        // Note: We know the root of the preOrder since it is preList(0)
        int inRootIndex = inList.indexOf(preList.get(0));

        // Step5 - Find the LENGTH of the rightSubtree
        // We need this to calculate the length of the left subtree of the PreOrder
        int lengthOfRightSubTreeTreeInOrderList = inList.subList(inRootIndex + 1, inList.size()).size();      // THIS IS THE WAYYYYY

        // Step6 - Find Left & Right child node recursively =)
        node.left = createTree(preList.subList(1, preList.size() - lengthOfRightSubTreeTreeInOrderList), inList.subList(0, inRootIndex));
        node.right = createTree(preList.subList(preList.size() - lengthOfRightSubTreeTreeInOrderList, preList.size()), inList.subList(inRootIndex + 1, inList.size()));

        return node;
    }
}

/**
 Note
 - OMG This was hard .. LOL
 - But this SOLUTION IS MINE =) With some help but this is my own unique solution
 - The trick is find Left and Right Subtree for PreOrder  & InOrder
 - We use inRootIndex to find the index of the root
 - We use lengthOfRightSubTreeTreeInOrderList to find the Length of the Subtree of the InOrderList

 Soltuion
 1. Change arrays to List
 2. Traverse Tree:
    a. Check if preList or inlist has size bigger than zero
    b. If size is 1, then create new TreeNode
    c. Create New Node
    d. Find the index of the root in the InOrder List
    e. Find the LENGTH of the right Tree of the Inorder Tree
        > Why ? Because then...we know the size of the Right SubTree of the PREORDER List.
        > And if we know the size of the RIGHT, we can calculate the size of the LEFT subtree of the PreOrder List

 Visual Example:
 PreOrder List: [3,9,20,15,7]
 InOrder List: [9,3,15,20,7]

 1. First Turn:
 RootPreOrder: 3    IndexRootPre: 0  .... i.e pre(0)
 RootInOrder: 3     IndexRootIn: 1   .... i.e inOrder.indexOf(pre(0))

 Since we know 3 is the root, we know the left and right subtree of InOrder
 Left Subtree: [9]      Root: [3]       RightSubTree: [15,20,7]

 !!! Since we know the LENGTH rightSubTree of InOrder (i.e [15,20,7].size())
 We can now calculate the Left and Right Subtree of the PreOrder Traversal
 RightTree: [20,15,7]   ... i.e from (size - lengthOfRightSubTreeInOrder) to the End
 Then that means that the Left Subtree is : [9]  ... i.e from 1 to (size - lengthOfRightSubTreeInOrder)
 Root: [3]

 We then do this recursively



 */
