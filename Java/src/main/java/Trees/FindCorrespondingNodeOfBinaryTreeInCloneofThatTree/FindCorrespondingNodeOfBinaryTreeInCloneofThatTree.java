package Trees.FindCorrespondingNodeOfBinaryTreeInCloneofThatTree;

import java.util.ArrayList;
import java.util.List;

public class FindCorrespondingNodeOfBinaryTreeInCloneofThatTree {


    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(19);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        TreeNode treeNode11 = new TreeNode(77);
        TreeNode treeNode22 = new TreeNode(44);
        TreeNode treeNode33 = new TreeNode(33);
        TreeNode treeNode44 = new TreeNode(66);
        TreeNode treeNode55 = new TreeNode(199);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode33.left = treeNode44;
        treeNode33.right = treeNode55;

        TreeNode target = treeNode3;
        System.out.println("TargetCopy: " + getTargetCopy(treeNode1, treeNode11, treeNode3).val);

    }

    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        // Step1 - Check if original is null
        if (original == null)
            return null;

        // Step2 - Check if original hits the target
        // Once it his this, loops stops
        if (original == target)
            return cloned;

        // Step3 - Check the Left Node
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null)
            return left;

        // Step4 - Check Right Node
        TreeNode right = getTargetCopy(original.right, cloned.right, target);
        if (right != null)
            return right;


        // Step5 - Return Null if Element not found
        return null;
    }
}

/**
 Note
 - We are using Preorder traversal here
 - We stop the loop once it hits the target.
    > If it doesent, it hits the null value

 Steps
 1. Check the left node
 2. Check the Right node
 3. if the both node are null ... means we DID NOT  find the target.
    -> Hence we return null
 4. If Target is found, we return the node. This should be only value which is NOT null
    -> Meaning what ? Meaning that if Left side did not contain the target, it will return null
                      While the right side which had the target should NOT be null and returned to the parent funciton



 */
