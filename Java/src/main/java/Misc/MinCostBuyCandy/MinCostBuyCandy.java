package Misc.MinCostBuyCandy;

import java.util.Arrays;

public class MinCostBuyCandy {
    public static void main(String [] args) {
        int [][] input = {{1,2,3}, {6,5,7,9,2,2}, {5,5}, {6,5,7,9,2,}, {1}};
        for (int i [] : input) {
            System.out.println("MinCost: " + minimumCost(i) + "\n");
        }
    }

    public static int minimumCost(int[] arr) {
        int min = 0;
        Arrays.sort(arr);
        System.out.println("arr: " + Arrays.toString(arr));

        for (int i=arr.length-1; i>=2; i-=3) {
            int higher = arr[i];
            int mid = arr[i-1];
            int lower = arr[i-2];
            System.out.println("higher: " + higher +  "    mid:" + mid + "      lower: " + lower);

            min += higher;
            min += mid;
        }

        if (arr.length % 3 == 2)
            min += arr[1] + arr[0];
        else if (arr.length % 3 == 1)
            min += arr[0];



        return min;
    }
}
