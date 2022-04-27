package Trees.MaximumBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MaximumBinaryTree {
    public static void main(String [] args) {
        int [] nums = {3,2,1,6,0,5};
        TreeNode node = constructMaximumBinaryTree(nums);
        System.out.println();
    }

    private static void printNode(TreeNode constructMaximumBinaryTree) {

    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);

        TreeNode node = createTree(list);
        return node;
    }

    private static TreeNode createTree(List<Integer> nums) {

        if (nums == null || nums.isEmpty())
            return null;

        int max = findMax(nums);
        int index = nums.indexOf(max);
        System.out.println("max: " + max + "    index: " + index);

        List<Integer> leftList = null;
        if (max != 0) {
           leftList = nums.subList(0, index);
        }

        List<Integer> rightList = null;
        if (max != nums.size() - 1) {
            rightList = nums.subList(index + 1, nums.size());
        }

        if (leftList == null && rightList == null)
            return null;

        System.out.println("leftSub: " + leftList +  "      right Sub: " + rightList);

        TreeNode node = new TreeNode(max);
        // Find the largest
        node.left = createTree(leftList);

        // Get the Left
        node.right = createTree(rightList);

        return node;
    }

    private static int findMax(List<Integer> nums) {
        int max = -1;
        int start = 0;
        int end = nums.size() - 1;
        while (start <= end) {
            max = max < nums.get(start) ? nums.get(start) : max;
            max = max < nums.get(end) ? nums.get(end) : max;

            start++;
            end--;
        }

        return max;
    }
}
