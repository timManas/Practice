package Misc.MinCostClimbStairs;

public class MinCostClimbStairs {

    public static void main(String [] args) {
//        int [][] input = {{10,15,20}, {1,100,1,1,1,100,1,1,100,1}};
        int [][] input = { {1,100,2,2,2,100,5,6,100,7}};
        for (int [] i : input)
            System.out.println("Min Cost: " + minCostClimbingStairs(i));
    }

    public static int minCostClimbingStairs(int[] cost) {
        return findMinCost(cost, 0);
    }

    private static int findMinCost(int[] cost, int currentIndex) {
        System.out.println("Element: " + cost[currentIndex]);

        if (currentIndex == cost.length-1 || currentIndex == cost.length - 2)
            return cost[currentIndex];

        int climbOneCost = cost[currentIndex+1];
        int climbTwoCost = cost[currentIndex+2];


        if (climbOneCost == climbTwoCost) {
            int one = findMinCost(cost, currentIndex + 1);
            int two = findMinCost(cost, currentIndex + 2);

            return Math.min(one, two);

        } else if (climbOneCost > climbTwoCost) {
            return findMinCost(cost, currentIndex + 2);
        } else if (climbOneCost < climbTwoCost) {
            return findMinCost(cost, currentIndex + 1);
        }


        return 0;
    }
}
