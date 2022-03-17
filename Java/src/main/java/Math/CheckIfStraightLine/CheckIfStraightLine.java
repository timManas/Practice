package Math.CheckIfStraightLine;

import java.util.Arrays;

public class CheckIfStraightLine {
    public static void main(String [] args) {
        int [][] coordinates =  {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println("Is Straight Line: " + checkStraightLine(coordinates) + "\n");
    }

    public static boolean checkStraightLine(int[][] coordinates) {

        for (int i=0; i < coordinates.length - 1; i++) {
            int [] current = coordinates[i];
            int [] next = coordinates[i+1];
            System.out.println("Current: " + current[0] + "," + current[1] + "        Next: " + next[0] + "," + next[1] );
        }

        return true;
    }
}
