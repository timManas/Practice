package Trees.MinimumCostTreeFromLeaves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumCostTreeFromLeaves {

    public static void main(String [] args) {
//        int [] arr = {6,2,4};
//        int [] arr = {4,11};
//        int [] arr = {1,2,3,4,5};
        int [] arr = {15,13,5,3,15};
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

        if (list.size() % 2 == 0) {
            createTree(list, nodeList);
            System.out.println("Even # List: " + nodeList);
            costList.add(total(nodeList));
        } else {

            // Forward
            int left = createTree(list.subList(0, list.size()- 1), nodeList);
            int right = list.get(list.size() - 1);
            nodeList.add(left * right);
            int total = total(nodeList);
            costList.add(total);
            System.out.println("Odd # - Forward List: " + nodeList + "      Total: " + total);

            // Clear NodeList
            nodeList.clear();

            // Backward
            Collections.reverse(list);
            left = list.get(list.size() - 1);
            right = createTree(list.subList(0, list.size()- 1), nodeList);
            nodeList.add(left * right);
            total = total(nodeList);
            costList.add(total);
            System.out.println("Odd # - Backward List: " + nodeList +  "    Total: " + total);
        }

        // Sort to get the smallest cost
        Collections.sort(costList);
        return costList.get(0);
    }

    private static Integer total(List<Integer> nodeList) {
        int total = 0;
        for (int i : nodeList)
            total += i;

        return total;
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


// solution: dp[i, j] = dp[i, k] + dp[k + 1, j] + max(A[i, k]) * max(A[k + 1, j])
