package Trees.ConsutrctBTFromPreorderAndInOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class ConsutrctBTFromPreorderAndInOrderTraversal {

    public static void main(String [] args) {
        int [] pre = {3,9,20,15,7};
        int [] post = {9,3,15,20,7};

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

        if (preList.size() <= 0)
            return null;
        if (preList.size() == 1)
            return new TreeNode(preList.get(0));

        int L = inList.indexOf(inList.get(0)) + 1;

        TreeNode node = new TreeNode(preList.get(0));
        node.left = createTree(preList.subList(1, L + 1), inList.subList(0,L));
        node.right = createTree(preList.subList(L + 1, preList.size()), inList.subList(L, inList.size() -1));

        return node;
    }

}
