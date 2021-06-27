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


//        // Solution 1 - Out of memory exception but it works ONLY for small size inputs
//       int solution = solution1(position);

        // Solution2 - Count on odds and even #.
        // return the min value of odd and even
        int odd = 0;
        int even = 0;
        for (int i : position) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(odd, even);
    }

    private static int solution1(int[] position) {

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


/**
 Notes
 - Tricky little bastard

 Original solution
 Note for this solution - Only works for small arrays
 1. Create an array and populate with 0's
 2. Populate array with input array values by tallying all similar elements
 3. Traverse through array and move over +2 (since cost is 0) until we reach the end
 4. Fetch the min of the last and second last

 Trick Solution
 - Values dont matter, only matters if its odd or even
 - Create counter for odd and even #
 - Fetch min of odd vs even


 */