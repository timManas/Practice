package Misc.DistanceBetweenBusStops;

public class DistanceBetweenBusStops {
    public static void main(String [] args) {
//       int [] distance = {1,2,3,4};
//       int start = 0;
//       int destination = 1;
//       System.out.println("Distance Between Bus Stops: " + distanceBetweenBusStops(distance, start, destination) + "\n");

        int [] distance1 = {7,10,1,12,11,14,5,0};
        int start1 = 7;
        int destination1 = 2;
        System.out.println("Distance Between Bus Stops: " + distanceBetweenBusStops(distance1, start1, destination1) + "\n");

    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forwardDistance = 0;
        int backwardDistance = 0;

        int i = start;
        while ( i != destination) {
            int current = distance[i];
            System.out.println("current: " + current);
            forwardDistance += current;

            ++i;
        }
        System.out.println("forwardDistance: " + forwardDistance + "\n");

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




        return Math.min(forwardDistance, backwardDistance);
    }
}