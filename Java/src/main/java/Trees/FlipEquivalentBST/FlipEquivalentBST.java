package Trees.FlipEquivalentBST;

import java.util.LinkedList;
import java.util.Queue;

public class FlipEquivalentBST {

    public static void main(String [] arg) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode5.left = treeNode7;
        treeNode5.right = treeNode8;

        TreeNode treeNode11 = new TreeNode(1);
        TreeNode treeNode22 = new TreeNode(3);
        TreeNode treeNode33 = new TreeNode(2);
        TreeNode treeNode44 = new TreeNode(6);
        TreeNode treeNode55 = new TreeNode(4);
        TreeNode treeNode66 = new TreeNode(5);
        TreeNode treeNode77 = new TreeNode(8);
        TreeNode treeNode88 = new TreeNode(7);

        treeNode11.left = treeNode22;
        treeNode11.right = treeNode33;
        treeNode22.right = treeNode44;
        treeNode33.left = treeNode55;
        treeNode33.right = treeNode66;
        treeNode66.left = treeNode77;
        treeNode66.right = treeNode88;

        System.out.println("Is tree Flip Equivalent ? " + flipEquiv(treeNode1, treeNode11));
    }

    public static boolean flipEquiv(TreeNode rootA, TreeNode rootB) {

        Queue<TreeNode> mainQueueA = new LinkedList<>();
        Queue<TreeNode> tempQueueA = new LinkedList<>();

        Queue<TreeNode> mainQueueB = new LinkedList<>();
        Queue<TreeNode> tempQueueB = new LinkedList<>();

        mainQueueA.add(rootA);
        mainQueueB.add(rootB);

        while (!mainQueueA.isEmpty() && !mainQueueB.isEmpty() ) {

            TreeNode nodeA = mainQueueA.remove();
            TreeNode nodeB = mainQueueB.remove();

            System.out.println("NodeA: " + nodeA.val + "        NodeB: " + nodeB.val);


            if (nodeA.left != null)
                mainQueueA.add(nodeA.left);

            if (nodeA.right != null)
                mainQueueA.add(nodeA.right);

            if (nodeB.left != null)
                mainQueueB.add(nodeB.left);

            if (nodeB.right != null)
                mainQueueB.add(nodeB.right);


        }

        return true;
    }

}
