package Trees.ClosestBinarySearchValue;

import java.util.ArrayList;
import java.util.List;

public class ClosestBinarySearchTreeValue {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);


//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;

//        double target = 3.714286;
        double target = 2147483648.0;
        System.out.println("ClosestValue: " + closestValue(treeNode1, target));

    }

    public static int closestValue(TreeNode node, double target) {
        int closestVal = node.val;
        List<Integer> list = new ArrayList<Integer>();
        createList(node, list);
        System.out.println("List: " + list );


        for (int i=0; i < list.size(); i++) {
            int currentValue = list.get(i);

            if (Math.abs(currentValue - target) < Math.abs(closestVal - target)) {
                closestVal = currentValue;
            }
        }


        return closestVal;
    }

    private static void createList(TreeNode node, List<Integer> list) {

        if (node == null)
            return;

        createList(node.left, list);
        list.add(node.val);
        createList(node.right, list);
    }


}
