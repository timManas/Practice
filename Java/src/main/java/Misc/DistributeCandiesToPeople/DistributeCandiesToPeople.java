package Misc.DistributeCandiesToPeople;

import java.util.ArrayList;
import java.util.List;

public class DistributeCandiesToPeople {
    public static void main(String [] args) {
        int candies = 7;
        int num_people = 4;
        int [] output = distributeCandies(candies, num_people);
        for (int i : output)
            System.out.print(i +", ");

        System.out.println();

        candies = 10;
        num_people = 3;
        output = distributeCandies(candies, num_people);
        for (int i : output)
            System.out.print(i +", ");
    }

    public static int[] distributeCandies(int candies, int num_people) {

        int [] output = new int[num_people];

        // Step1 - Create the index trackers
        int index = 0;      // Goes from 0,1,2,3 ... num_people-1
        int candyToGive = 1;            // Num of candies to give, Each round it increases by 1
        int candyRemaining = candies - 1;   // Num of candies remaining
        int totalCandiesGiven = 0;          // Total candies Given

        // Step2 - Continue giving candies until we dont have enough
        while (candyToGive < candyRemaining) {
            System.out.println("candyToGive: " + candyToGive + "    candyRemaining: " + candyRemaining);

            // Step3 - Increment the perons candies by the number of candies to give
            output[index] += candyToGive;

            // Step4 - Update the indexes
            totalCandiesGiven += candyToGive;
            candyRemaining = candies - totalCandiesGiven;
            candyToGive ++;
            index = index >= num_people - 1 ? 0 : index + 1;
        }

        // Step3 - At the very last Element, when we dont have enough. We just give the remaining candies
        output[index] += candyRemaining;

        return output;
    }
}

/**
 Note:
 - Nothing fancy
 - Just takes some understanding
 - The key is to keep a good track of the candies given out vs the candies remaining
    > Once the candies to be given is higher than the candies remaining, we just give the remaining

 */