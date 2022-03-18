package Math.CheckIfStraightLine;

import java.util.Arrays;

public class CheckIfStraightLine {
    public static void main(String [] args) {
        int [][] coordinates =  {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println("Is Straight Line: " + checkStraightLine(coordinates) + "\n");
        
        int [][] coordinates1 =  {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println("Is Straight Line: " + checkStraightLine(coordinates1) + "\n");

        int [][] coordinates2 = {{0,0},{0,1},{0,-1}};
        System.out.println("Is Straight Line: " + checkStraightLine(coordinates2) + "\n");

        int [][] coordinates3 = {{1,-8},{2,-3},{1,2}};
        System.out.println("Is Straight Line: " + checkStraightLine(coordinates3) + "\n");
    }

    public static boolean checkStraightLine(int[][] coordinates) {

        double increase = -1;

        for (int i=0; i < coordinates.length - 1; i++) {
            int [] current = coordinates[i];
            int [] next = coordinates[i+1];
            System.out.println("Current: " + current[0] + "," + current[1] + "        Next: " + next[0] + "," + next[1] );

            double adjacent = Math.abs(next[0] - current[0]);
            double opposite = Math.abs(next[1] - current[1]);
            double angle = Math.atan(opposite / adjacent);

            System.out.println("Opposite: " + opposite + "      Adjacent: " + adjacent  + "     angle: " + angle);


            if (increase == -1)
                increase = angle;
            if (increase != angle)
                return false;


            if (i + 1 == coordinates.length) {
                adjacent = Math.abs(next[0] - coordinates[0][0]);
                opposite = Math.abs(next[1] - coordinates[0][1]);
                angle = Math.atan(opposite / adjacent);

                System.out.println("Final Opposite: " + opposite + "      Adjacent: " + adjacent  + "     angle: " + angle);

                if (increase == -1)
                    increase = angle;
                if (increase != angle)
                    return false;
            }

        }



        return true;
    }
}
