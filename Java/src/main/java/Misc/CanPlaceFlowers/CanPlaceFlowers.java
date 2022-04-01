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

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        List<Integer> list = new ArrayList<>();

        int start = 0;
        int prev = 0;
        for (int i=0; i < flowerbed.length; i++) {
            int current = flowerbed[i];

            if (current == 0) {
                if (prev == current) {
                    // Do nothing
                } else {
                    start = i;
                }
            } else {
                if (prev == 0){

//                    if (start == 0)
//                        start =-1;

                    list.add(i - start);
                }
            }

            prev = current;
        }
        System.out.println("list: " + list);

        int remaining = n;
        for (int numZeroes : list) {
            if (numZeroes % 2 == 0) {
                numZeroes -= 1;
            }

            int allowedOnes = numZeroes / 2;
            remaining -= allowedOnes;

            if (remaining <= 0)
                return true;


            System.out.println("numZeroes: " + numZeroes + "    allowedOnes: " + allowedOnes + "    remaining: " + remaining);
        }



        return remaining <= 0;
    }
}
