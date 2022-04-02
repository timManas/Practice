package Misc.CanPlaceFlowers;

import java.util.ArrayList;
import java.util.List;

public class CanPlaceFlowers {
    public static void main(String [] args) {
        int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed, n) + "\n");

        int [] flowerbed1 = {1,0,0,0,1};
        int n1 = 2;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed1, n1) + "\n");

        int [] flowerbed2 = {0,0,1,0,1};
        int n2 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed2, n2) + "\n");

        int [] flowerbed3 = {1,0,1,0,1,0,1};
        int n3 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed3, n3) + "\n");

        int [] flowerbed4 = {1,0,0,0,1,0,0};
        int n4 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed4, n4) + "\n");

        int [] flowerbed5 = {0,0,1,1,0,0};
        int n5 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed5, n5) + "\n");

        int [] flowerbed6 = {0,0,0,1,1,0,0,0};
        int n6 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed6, n6) + "\n");

        int [] flowerbed7 = {0,0,0,0,1,1,0,0,0,0};
        int n7 = 1;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed7, n7) + "\n");

        int [] flowerbed8 = {0,0,0};
        int n8 = 2;
        System.out.println("Can Place Flowers: " + canPlaceFlowers(flowerbed8, n8) + "\n");

    }


    // I fucking hate this solution but its mine
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        // Step1 - Check if the length are greater than 2.
        if (flowerbed.length == 1 && flowerbed[0] == 0)
            return true;

        // Step2 - Create a list to store flowebed
        List<Integer> list = new ArrayList<>();

        // Step3 - Traverse the flowebed and store all the zeroe occurences in list
        int start = 0;
        int prev = -1;
        for (int i=0; i < flowerbed.length; i++) {
            int current = flowerbed[i];

            // Step4 - Check if current is 0 or 1
            if (current == 0) {
                if (prev == current) {

                    // If the last element is 0. Increase count since we  an place a flower at the end
                    if (i == flowerbed.length - 1) {
                        if (start == 0) {
                            // Increase count again if the beginning is zero
                            start = -1;
                        }
                        list.add(i - start + 2);
                    }

                } else {
                    start = i;
                }
            } else {
                if (prev == 0){

                    if (start == 0) {
                        start = -1;
                    }

                    list.add(i - start);
                }
            }
            prev = current;
        }
        System.out.println("list: " + list);

        // Step4 - See if can subtract until we get to zero n
        int remaining = n;
        for (int numZeroes : list) {
            if (numZeroes % 2 == 0) {
                numZeroes -= 1;
            }

            // Step4b - Find the allowed ones using division. 3 can only store 1 flower. And 5 can store 2 flowes
            int allowedOnes = numZeroes / 2;
            remaining -= allowedOnes;

            if (remaining <= 0)
                return true;


            System.out.println("numZeroes: " + numZeroes + "    allowedOnes: " + allowedOnes + "    remaining: " + remaining);
        }

        return remaining <= 0;
    }
}
