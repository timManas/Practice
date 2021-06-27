package Lists.MinimumCostMoveChipsSamePosition;

import java.util.*;

public class MinimumCostMoveChipsSamePosition {

    public static void main (String [] args) {
        int [][] input = {{1,2,3}, {2,2,2,3,3}, {1,1000000000}, {6,4,7,8,2,10,2,7,9,7}};
//        int [][] input = {{6,4,7,8,2,10,2,7,9,7}};
        for (int [] position : input)
            System.out.println("Min Cost to move chips: " + minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {

        int minCost = 0;

        if (position.length <= 1)
            return 0;

        // Populate the map to store the positions
        int max = Arrays.stream(position).max().getAsInt();
        int min = Arrays.stream(position).min().getAsInt();
        Integer [] data = new Integer[max + 1];
        Arrays.fill(data,  0);
        List<Integer> list = Arrays.asList(data);

        for (int i : position) {
            if (list.get(i) == 0) {
                list.set(i, 1);
            } else {
                list.set(i, list.get(i) + 1);
            }
        }



        for (int i=0; i < list.size(); i++) {
            int numCoins = list.get(i);

            // If no coins, move on
            if (numCoins == 0)
                continue;

            // If we cannot move forward ..we stop until the end
            if (i+2 > list.size() - 1)
                continue;

            list.set(i+2, list.get(i+2) + numCoins);
            list.set(i, 0);
        }

        minCost = Math.min(list.get(list.size() - 1), list.get(list.size() - 2));

        return minCost;
    }
}
