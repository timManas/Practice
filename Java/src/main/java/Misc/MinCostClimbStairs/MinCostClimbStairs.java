package Misc.MinCostClimbStairs;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;


public class MinCostClimbStairs {

    public static void main(String [] args) {
        int [][] input = {{10,15,20}, {1,100,1,1,1,100,1,1,100,1}};
//        int [][] input = {{0,2,2,1}};
//        int [][] input = {{2,2,1,0}};

        for (int [] i : input)
            System.out.println("Min Cost: " + minCostClimbingStairs(i) + "\n");
    }

    public static int minCostClimbingStairs(int[] cost) {
        int minCost = 0;
        Stack<Integer> stack = new Stack<>();

        System.out.println("traverse 0th");
        stack.push(0);
        int stairs0 = traverseStairs(cost,stack);

        System.out.println("traverse 1th");
        stack.push(1);
        int stairs1 = traverseStairs(cost,stack);

        return Math.min(stairs0, stairs1);
    }

    public static int traverseStairs(int [] cost, Stack<Integer> stack) {
        int index = stack.pop();
        int current = cost[index];
        System.out.println("index: " + index + "    current: " + current);

        if (index == cost.length - 1 || index == cost.length - 2) {
            return current;
        }

        stack.push(index+1);
        int traverse1 = traverseStairs(cost, stack);

        stack.push(index+2);
        int traverse2 = traverseStairs(cost, stack);

        return Math.min(traverse1, traverse2);
    }

}
