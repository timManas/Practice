package Trees.ConstructBTFromPreAndPostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class ConstructBTFromPreAndPostOrder {

    public static void main(String [] args) {
        int [] pre = {1,2,4,5,3,6,7};
        int [] post = {4,5,2,6,7,3,1};

        System.out.println("Root Node: " + constructFromPrePost(pre, post).val);

    }

    public static TreeNode constructFromPrePost(int[] pre, int[] post) {

        // Step1 - Create and populate List
        List<Integer> preList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        // Step2 - Populate list
        for (int i : pre)
            preList.add(i);

        for (int i : post)
            postList.add(i);

        // Step3 - Create tree using Divide and ConQuer
        TreeNode node = createTree(preList, postList);

        return node;
    }

    private static TreeNode createTree(List<Integer> pre, List<Integer> post) {

        // Step1 - Define Base Test Cases
        if (pre.size() <= 0)
            return null;
        if (pre.size() == 1)
            return new TreeNode(pre.get(0));

        // Step2 - Find 'L' which is the length of the SubArray
        // List to me carefully, L is the lenth of the SubArray
        // Why do we add + 1 ? Because  this is Indexes ...and we need the ACTUAL length... capiche ?
        int L = post.indexOf(pre.get(1)) + 1;

        // Step3 - Create Root, Left and Right Node
        // Why do we add + 1 in .subList() ??? Because it creates a subList from 0 to L Exclusive ..so we need to add to include the last number
        // Just try removing the +1 and you get an error
        TreeNode node = new TreeNode(pre.get(0));
        node.left = createTree(pre.subList(1, L + 1), post.subList(0, L));
        node.right = createTree(pre.subList(L + 1, pre.size()), post.subList(L, post.size() - 1));

        return node;
    }
}


/**
 Notes
 - This was bloody hard ... Category 4/5
 - The hardest part to this was coming up with the EXACT Length to create a sublist
 - Which is why we use a List since we get easy access to the indexes (i.e post.indexOf)

 Solution
 1. Create Algorithm using Divide and Conquer
 2. Solve for the base case first
 3. Create Root Node
 4. Create Left and Right Child Node by recursion

 Visual Representation
 For PreOrder, We know that the first number in the list is the root
    ex. Pre = [1,2,4,5,3,6,7]   Post = [4,5,2,6,7,3,1]

 Therefore we can write Pre and post as:
 1st Round - Pre: Root = 1, Left = [2,4,5], Right = [3,6,7]         Post: Root = 1, Left=[4,5,2], Right = [6,7,3]
 2nd Round - Pre Left SubTree Root=2, Left=4, Right=5               Post Left SubTree  Root=2, Left=4, Right=5
                 Right SubTree Root=3, Left=6, Right=7                   Right SubTree Root=3, Left=6, Right=7

 NOW NOTICE BOTH LEFT AND RIGHT SUBTREE ARE THE SAME FOR BOTH



 */