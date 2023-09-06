package Trees.AllPossibleBinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleBinaryTrees {
    public static void main(String [] args) {
        int [] input = {7,3};
        for (int i : input)
            System.out.println("All Possible Binary Trees:" + allPossibleFBT(i));
    }

    public static List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> list = new ArrayList<>();


        // Traverse Node using

        return list;
    }
}


/**
 Perform DFS
 - Pre Order Traversal

 Solution
 1. Brute Force it ?
    - Create all different possible combination. How ?

 2. Algorithmically create it
    - Start from head
    - For each node, create two subNodes
    - Continue doing so until we run out of all nodes


    - Take from node which child nodes are blank. Start from left side most
    - Mark node as visited
    - Place child Nodes on next unvisited node
    - Continue until we visited all nodes




 */