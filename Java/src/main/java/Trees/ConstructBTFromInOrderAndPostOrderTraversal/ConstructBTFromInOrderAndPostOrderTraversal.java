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

        
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        for (int i : inorder)
            inList.add(i);

        for (int i : postorder)
            postList.add(i);

        return createTree(inList, postList);
    }

    private static TreeNode createTree(List<Integer> inList, List<Integer> postList) {

        if (inList.size() <=0 || postList.size() <= 0)
            return null;

        if (inList.size() == 1 || postList.size() == 1)
            return new TreeNode(inList.get(0));

        TreeNode node = new TreeNode(postList.get(postList.size() - 1));
        System.out.println("Current Node: " + node.val);

        int inRootIndex = inList.indexOf(postList.get(postList.size() - 1));
        int lengthOfLeftSubTreeInOrderList = inList.subList(0, inRootIndex).size();
        int lengthOfRightSubTreeInOrderList = inList.subList(inRootIndex + 1, inList.size()).size();

        node.left = createTree(inList.subList(0, inRootIndex), postList.subList(0, lengthOfLeftSubTreeInOrderList));
        node.right = createTree(inList.subList(inRootIndex + 1, inList.size()), postList.subList(inRootIndex, postList.size() - 1));

        return node;
    }

}
