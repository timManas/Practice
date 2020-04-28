package Trees.PathZigZagLabelledBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathZigZagLabelledBinaryTree {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode10 = new TreeNode(10);

        TreeNode treeNode11 = new TreeNode(11);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode13 = new TreeNode(13);
        TreeNode treeNode14 = new TreeNode(14);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode16 = new TreeNode(16);
        TreeNode treeNode17 = new TreeNode(17);
        TreeNode treeNode18 = new TreeNode(18);
        TreeNode treeNode19 = new TreeNode(19);
        TreeNode treeNode20 = new TreeNode(20);

        TreeNode treeNode21 = new TreeNode(21);
        TreeNode treeNode22 = new TreeNode(22);
        TreeNode treeNode23 = new TreeNode(23);
        TreeNode treeNode24 = new TreeNode(24);
        TreeNode treeNode25 = new TreeNode(25);
        TreeNode treeNode26 = new TreeNode(26);
        TreeNode treeNode27 = new TreeNode(27);
        TreeNode treeNode28 = new TreeNode(28);
        TreeNode treeNode29 = new TreeNode(29);
        TreeNode treeNode30 = new TreeNode(30);
        TreeNode treeNode31 = new TreeNode(31);

        // Level 1
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        // Level 2
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        treeNode2.left = treeNode6;
        treeNode2.right = treeNode7;

        // Level3
        treeNode4.left = treeNode15;
        treeNode4.right = treeNode14;
        treeNode5.left = treeNode13;
        treeNode5.right = treeNode12;
        treeNode6.left = treeNode11;
        treeNode6.right = treeNode10;
        treeNode7.left = treeNode9;
        treeNode7.right = treeNode8;

        // Level4
        treeNode15.left = treeNode16;
        treeNode15.right = treeNode17;
        treeNode14.left = treeNode18;
        treeNode14.right = treeNode19;
        treeNode13.left = treeNode20;
        treeNode13.right = treeNode21;
        treeNode12.left = treeNode22;
        treeNode12.right = treeNode23;
        treeNode11.left = treeNode24;
        treeNode11.right = treeNode25;
        treeNode10.left = treeNode26;
        treeNode10.right = treeNode27;
        treeNode9.left = treeNode28;
        treeNode9.right = treeNode29;
        treeNode8.left = treeNode30;
        treeNode8.right = treeNode31;

        int label = 14;

        System.out.println("Path ZigZag: " + pathInZigZagTree(label));
    }

    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();

        return list;
    }
}
