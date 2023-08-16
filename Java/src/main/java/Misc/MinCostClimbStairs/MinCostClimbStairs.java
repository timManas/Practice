package Misc.MinCostClimbStairs;

public class MinCostClimbStairs {

    public static void main(String [] args) {
        int [][] input = {{10,15,20}, {1,100,1,1,1,100,1,1,100,1}};
//        int [][] input = {{0,2,2,1}};
//        int [][] input = {{2,2,1,0}};

        for (int [] i : input)
            System.out.println("Min Cost: " + minCostClimbingStairs(i) + "\n");
    }

    public static int minCostClimbingStairs(int[] cost) {
        int minCostDown = Math.min(costClimbStairsDown(cost, cost.length - 1), costClimbStairsDown(cost, cost.length - 2));
        int minCostUp = Math.min(costClimbStairsUp(cost, 0), costClimbStairsUp(cost, 1));
        return Math.min(minCostUp, minCostDown);
    }

    private static int costClimbStairsUp(int[] cost, int i) {
        int minCost = cost[i];
        int current;
        int n1;
        int n2;

        while (i < cost.length - 2) {
            current = cost[i];
            n1 = cost[i + 1];
            n2 = cost[i + 2];
            System.out.println("Current: " + current + "    n1:" + n1 + "      n2: " + n2);

            if (n1 < n2) {
                i = i + 1;
            } else {
                i = i + 2;
            }
            minCost += cost[i];
            System.out.println("minCost: " + minCost);

        }
        System.out.println("Current: " + cost[i] +"\n");

        return minCost;

    }


    public static int costClimbStairsDown(int [] cost, int i) {
        int minCost = cost[i];
        int current;
        int n1;
        int n2;

        while (i >= 2) {
            current = i < cost.length ? cost[i] : 0;
            n1 = cost[i-1];
            n2 = cost[i-2];
            System.out.println("Current: " + current + "    n1:" + n1 + "      n2: " + n2);

            if (n1 < n2) {
                i = i-1;
            } else {
                i = i-2;
            }
            minCost += cost[i];
            System.out.println("minCost: " + minCost);
        }
        System.out.println("Current: " + cost[i] +"\n");

        return minCost;
    }

}
