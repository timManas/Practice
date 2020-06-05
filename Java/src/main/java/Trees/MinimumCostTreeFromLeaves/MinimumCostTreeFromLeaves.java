package Trees.MinimumCostTreeFromLeaves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumCostTreeFromLeaves {

    public static void main(String [] args) {
        int [] arr = {6,2,4};
        System.out.println("Minimum Cost Tree: " +  mctFromLeafValues(arr));
    }

    public static int mctFromLeafValues(int[] arr) {
        if (arr.length == 0)
            return 0;

        List<Integer> costList = new ArrayList<>();
        List<Integer> treeNodeHolder = new ArrayList<>();

        int max = 2;                // Max # of iterations
        if (arr.length % 2 == 0)
            max = 1;

        int count = 0;
        while (count < max ) {
            int min = 0;

            for (int i=0; i<arr.length; i++) {

                

            }

        }

        // Sort to get the smallest cost
        Collections.sort(costList);
        return costList.get(0);
    }

}
