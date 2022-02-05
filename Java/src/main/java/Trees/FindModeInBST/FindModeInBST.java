package Trees.FindModeInBST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindModeInBST {

    public static void main(String [] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);


        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        System.out.println("Find Mode: " + findMode(treeNode1));
    }

    public static int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new TreeMap<>();
        traverseTree(root, map);
        System.out.println("Map: " + map);

        // Find the mode from the map
        int largestCount = 0;
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() < largestCount) {
                continue;

            } else if (mapEntry.getValue() == largestCount) {
                modeList.add(mapEntry.getKey());
            } else if (mapEntry.getValue() > largestCount) {
                modeList.clear();
                modeList.add(mapEntry.getKey());
                largestCount = mapEntry.getValue();
            }
        }
        System.out.println("ModeList: " + modeList);

        // Convert to int array
        int [] output = new int[modeList.size()];
        for (int i=0; i<modeList.size(); i++) output[i] = modeList.get(i);

        return output;
    }

    private static void traverseTree(TreeNode node, Map<Integer, Integer> map) {
        if (node == null)
            return;

        System.out.println("Node: " + node.val);
        if (map.containsKey(node.val)) {
            map.put(node.val, map.get(node.val) + 1);
        } else
            map.put(node.val, 1);

        traverseTree(node.left, map);
        traverseTree(node.right, map);
    }
}
