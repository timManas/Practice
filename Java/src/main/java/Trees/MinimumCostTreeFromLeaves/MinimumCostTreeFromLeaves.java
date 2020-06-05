package Trees.MinimumCostTreeFromLeaves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumCostTreeFromLeaves {

    public static void main(String [] args) {
//        int [] arr = {6,2,4,9};
        int [] arr = {1,2,3,4};
        System.out.println("Minimum Cost Tree: " +  mctFromLeafValues(arr));
    }

    /**
     * Hold the fuck up... Currently you are Using Iteration
     * Use recursion
     */
    public static int mctFromLeafValues(int[] arr) {
        if (arr.length == 0)
            return 0;
        List<Integer> costList = new ArrayList<>();
        List<Integer> nodeList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i : arr)
            list.add(i);

        System.out.println("Max: " + createTree(list, nodeList));

        // Sort to get the smallest cost
        Collections.sort(costList);
        return 0;
    }

    private static int createTree(List<Integer> list, List<Integer> nodeList) {

        if (list.size() == 0)
            return 0;

        if (list.size() == 1)
            return list.get(0);


        int left = createTree(list.subList(0, (list.size() / 2)), nodeList);
        int right = createTree(list.subList((list.size() / 2), list.size()), nodeList);

        nodeList.add(left * right);

        return Math.max(left, right);
    }

}
