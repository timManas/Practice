package Lists.RelativeRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class RelativeRank {
    public static void main(String [] args) {
        int [][]input = {{5,4,3,2,1}, {10,3,8,9,4}};
        for (int [] i : input) {
            String [] output = findRelativeRanks(i);
            for (String x : output)
                System.out.print(x + ",");
            System.out.println();
        }
    }

    public static String[] findRelativeRanks(int[] score) {
        // Step1 - Create output
        String [] output = new String[score.length];

        // Step2 - Create TreeSet to keep track of ordering
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0; i < score.length; i++) {
            set.add(score[i]);
        }
        System.out.println("TreeSet: " + set);

        // Step3 - Create List
        List<Integer> orderList = new ArrayList<>(set);
        Collections.reverse(orderList);

        // Step4 - Traverse through output
        for (int i=0; i < output.length; i++) {
            int rank = orderList.indexOf(score[i]) + 1;

            if (rank == 1)
                output[i] = "Gold Medal";
            else if (rank == 2)
                output[i] = "Silver Medal";
            else if (rank == 3)
                output[i] = "Bronze Medal";
            else
                output[i] = String.valueOf(rank);
        }

        return output;
    }
}
