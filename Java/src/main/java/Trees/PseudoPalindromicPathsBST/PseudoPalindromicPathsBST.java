package Trees.PseudoPalindromicPathsBST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PseudoPalindromicPathsBST {

    public static void main(String [] args) {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        System.out.println("NumPalindromePaths: " + pseudoPalindromicPaths(node1));
    }

    public static int pseudoPalindromicPaths (TreeNode root) {

        // Step1 - Create variable to return
        AtomicInteger numPaths = new AtomicInteger(0);

        // Step2 - Create map to store values
        Map<Integer, Integer> map = new LinkedHashMap<>();

        // Step3 - Traverse Tree
        traverseTree(root, map, numPaths);

        return numPaths.get();
    }

    private static void traverseTree(TreeNode node, Map<Integer, Integer> map, AtomicInteger numPaths) {

        if (node == null)
            return;

        System.out.println("CurrentNode: " + node.val);

        // Update the map
        int value = 1;
        if (map.containsKey(node.val))
            value = map.get(node.val) + 1;
        map.put(node.val, value);

        traverseTree(node.left, map, numPaths);
        traverseTree(node.right, map, numPaths);

        // Check if Leaf
        if (node.left == null && node.right == null) {
            System.out.println(map);
            if (isPalindromic(map))
                numPaths.getAndIncrement();
        }

        // Remove Element
        if (map.containsKey(node.val)) {
            if (map.get(node.val) == 1) {
                map.remove(node.val);
            } else {
                map.put(node.val, map.get(node.val) - 1);
            }
        }
    }

    private static boolean isPalindromic(Map<Integer, Integer> map) {
        ArrayList<Integer> list = getPalindromicRatio(map);

        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int numOccurence = mapEntry.getValue();

            if (!list.contains(numOccurence))
                return false;

            list.remove(list.indexOf(numOccurence));
        }


        return true;
    }

    private static ArrayList<Integer> getPalindromicRatio(Map<Integer, Integer> map) {
        int total = 0;
        for (int i : map.values())
            total += i;

        int maxCap = total / map.size();

        int [] arr = new int[map.size()];
        int index = 0;
        int balance = 0;
        while (total > 0) {
            total = total - maxCap;
            arr[index] = total;
            index++;
            if (index >= arr.length)
                index = 0;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr)
            list.add(i);

        System.out.println("ListRatio: " + list);

        return list;
    }

}
