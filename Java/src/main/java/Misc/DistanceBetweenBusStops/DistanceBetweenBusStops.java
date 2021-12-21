package Misc.DistanceBetweenBusStops;

public class DistanceBetweenBusStops {
    public static void main(String [] args) {
       int [] distance = {1,2,3,4};
       int start = 0;
       int destination = 1;
       System.out.println("Distance Between Bus Stops: " + distanceBetweenBusStops(distance, start, destination) + "\n");

        int [] distance1 = {7,10,1,12,11,14,5,0};
        int start1 = 7;
        int destination1 = 2;
        System.out.println("Distance Between Bus Stops: " + distanceBetweenBusStops(distance1, start1, destination1) + "\n");

    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {

        // Step1 - Create variables to track distance moving forward and backwards
        int forwardDistance = 0;
        int backwardDistance = 0;

        // Step2 - Traverse Forward
        int i = start;
        while ( i != destination) {
            int current = distance[i];
            System.out.println("current: " + current);
            forwardDistance += current;

            ++i;
            if (i >= distance.length)
                i = 0;
        }
        System.out.println("forwardDistance: " + forwardDistance + "\n");

        // Step3 - Traverse Backward
        int x = start;
        while ( x != destination) {
            --x;
            if (x < 0)
                x = distance.length - 1;

            int current = distance[x];
            System.out.println("current: " + current);
            backwardDistance += current;


        }
        System.out.println("backwardDistance: " + backwardDistance);

        // Step4 - Find the min
        return Math.min(forwardDistance, backwardDistance);
    }
}