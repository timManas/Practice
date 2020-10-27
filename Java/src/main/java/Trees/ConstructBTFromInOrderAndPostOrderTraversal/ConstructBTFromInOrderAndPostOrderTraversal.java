package Trees.ConstructBTFromInOrderAndPostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class ConstructBTFromInOrderAndPostOrderTraversal {

    public static void main(String [] args) {
        int [] inorder = {9,3,15,20,7};
        int [] postorder = {9,15,7,20,3};

        TreeNode output = buildTree(inorder, postorder);
        System.out.println("Output Root: " + output.val);

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        // Step1 - Convert arrays to List for easier indexing
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        // Step2 - Populate the list
        for (int i : inorder)
            inList.add(i);
        for (int i : postorder)
            postList.add(i);

        // Step3 - Create the Tree
        return createTree(inList, postList);
    }

    private static TreeNode createTree(List<Integer> inList, List<Integer> postList) {

        // Step1 - Check if any elements present at all
        if (inList.size() <=0 || postList.size() <= 0)
            return null;

        // Step2 - Create new node if only one element exists in Node
        if (inList.size() == 1 || postList.size() == 1)
            return new TreeNode(inList.get(0));

        // Step3 - Create new Node
        TreeNode node = new TreeNode(postList.get(postList.size() - 1));
        System.out.println("Current Node: " + node.val);

        // Step4 - Find the Index of the Root Node in the InOrderList
        int inRootIndex = inList.indexOf(postList.get(postList.size() - 1));

        // Step5 - Find the Length of the Left Subtree of the inOrder List
        // Why ? Because we use this value to calculate the leftSubTree of the PostOrderList
        int lengthOfLeftSubTreeInOrderList = inList.subList(0, inRootIndex).size();

        // Step6 - Find the Left and Right SubTree
        node.left = createTree(inList.subList(0, inRootIndex), postList.subList(0, lengthOfLeftSubTreeInOrderList));
        node.right = createTree(inList.subList(inRootIndex + 1, inList.size()), postList.subList(lengthOfLeftSubTreeInOrderList, postList.size() - 1));

        return node;
    }
}


/**
 Note
 - This too was very difficult but this was my own Solution =)
 - The trick is to find the LEFT and Right Subtree for InOrder and PostOrder
 - We use inRootIndex to find the Index of the Root in InOrderList
 - We use lengthOfLeftSubTreeInOrderList to find the Length of the Subtree of the InOrderList


 Solution
 1. Change arrays to List
 2. Traverse Tree:
    a. Check if inList or postList has size bigger than zero
    b. If size is 1, then create new Node
    c. Create a new Node
    d. Find the index of the root in the InOrderList
    e. Find the LENGTH of the LEFT tree of the InOrderList
        > Why ? Because then ... we know the size of the Left SubTree of the PostOrderList
        > And if we know the size of the LEFT, we can calculate the size of the Right SubTree

 Visual Example:
 InOrder List:  [9,3,15,20,7]
 PostOrder List:[9,15,7,20,3]

 1. First Turn
 RootPostOrder: 3         IndexRootPost: 4 ... i.e post(post.size() - 1)
 RootInOrder: 3           IndexRootIn: 1   ... i.e inOrder.indexOf(post(post.size() - 1))

 Since we know 3 is the root, we know the LEFT and Right Subtree of the InOrder
 LeftSubtree: [9]       Root:[3]       RightSubtree: [15,20,7]

 !!! Since we know the LENGTH of the leftSubTree of InOrder (i.e [9].size())
 We can now calculate the Left and Right SubTree of the PostOrder Traversal
 LeftTree: [9]  ... i.e from 0 to lengthOfLeftSubTreeInOrderList
 Then that means the Right Subtree is: [15,7,20]  ... ie. from lengthOfLeftSubTreeInOrderList to postList.size() - 1
 Root: [3]

 We then do this recursively


 */
