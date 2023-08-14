package Misc.MinCostClimbStairs;

public class MinCostClimbStairs {

    public static void main(String [] args) {
//        int [][] input = {{10,15,20}, {1,100,1,1,1,100,1,1,100,1}};
        int [][] input = {{0,2,2,1}};

        for (int [] i : input)
            System.out.println("Min Cost: " + minCostClimbingStairs(i) + "\n");
    }

    public static int minCostClimbingStairs(int[] cost) {
        int minCost = 0;

        int i = cost.length;
        int current = -1;
        int n1 = cost[i-1];
        int n2 = cost[i-2];

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

        }

        System.out.println("Current: " + cost[i]);


        return minCost;
    }
}
