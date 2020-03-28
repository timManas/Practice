package Trees.CousinsInBinaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class CousinsInBinaryTree {

    public static void main(String [] args) {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        TreeNode treeNode6 = new TreeNode(6);
//
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//
//        treeNode2.left = treeNode4;
//
//        treeNode3.right = treeNode5;
//
//        treeNode5.right = treeNode6;
//
//        int x = 4;
//        int y = 6;
//        System.out.println("IsCousins: " + isCousins(treeNode1, x, y));

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(5);
        TreeNode treeNode8 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        treeNode4.right = treeNode8;

        int x = 5;
        int y = 8;
        System.out.println("IsCousins: " + isCousins(treeNode1, x, y));
    }

    public static boolean isCousins(TreeNode node, int x, int y) {

        int count = 0;
        Map<Integer, HashMap<String, Integer>> map = new HashMap<Integer, HashMap<String, Integer>>();
        traverseNode(node, x, y, count, map);

        return checkResult(map, x, y);
    }

    private static void traverseNode(TreeNode node, int x, int y, int count, Map map) {
        if (node == null)
            return;

        HashMap<String, Integer> internalMap = new HashMap<String, Integer>();
        if (node.left != null) {
            if (node.left.val == x) {
                internalMap.put("level", count + 1);
                internalMap.put("parentNode", node.val);
                map.put(x, internalMap);
            } else if (node.left.val == y) {
                internalMap.put("level", count + 1);
                internalMap.put("parentNode", node.val);
                map.put(y, internalMap);
            }
        }
        if (node.right != null) {
            if (node.right.val == x) {
                internalMap.put("level", count + 1);
                internalMap.put("parentNode", node.val);
                map.put(x, internalMap);
            } else if (node.right.val == y) {
                internalMap.put("level", count + 1);
                internalMap.put("parentNode", node.val);
                map.put(y, internalMap);
            }
        }

        traverseNode(node.left, x, y, count + 1, map);
        traverseNode(node.right, x, y, count + 1, map);
    }


    private static boolean checkResult(Map<Integer, HashMap<String, Integer>> map, int x, int y) {

        if (map.size() <= 1)
            return false;

        if (map.get(x).get("level") == map.get(y).get("level") &&
                map.get(x).get("parentNode") != map.get(y).get("parentNode")) {
            return true;
        }

        return false;
    }


}
