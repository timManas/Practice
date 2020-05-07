package Math.QueensAttackKings;

import java.util.*;

public class QueensAttackKings {

    static int MAXX = 8;
    static int MAXY = 8;

    public static void main(String [] args) {

//        int [][] queen = {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};
//        int [] king = {3,4};

//        int [][] queen = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
//        int [] king = {0,0};

//        int [][] queen = {{0,1},{6,4},{4,7},{0,0},{3,3},{7,7},{2,1},{1,6},{0,4},{4,3},{2,4},{3,7},{3,4},{1,1}};
//        int [] king = {7,2};

        int [][] queen = {{1,3},{0,7},{5,1},{2,5},{7,2},{1,2},{6,7},{3,3},{5,5},{1,5},{5,0},{0,4},{4,1},{1,1},{3,2},{2,3},{4,2},{1,0},{6,5},{2,7},{3,1},{4,3},{3,4}};
        int [] king = {0,2};



        System.out.println("List of Queens Available for attacking King: " + queensAttacktheKing(queen, king));
    }

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        // Step1 - Create return variable
        List<List<Integer>> list = new ArrayList<>();

        // Step2 - Create set and populate values from queen to set in String format
        Set<String> set = new LinkedHashSet<>();
        populateSet(queens, set);

        // Step3 - Traverse
        findQueenX(list, queens, king, set);        // Traverse X Axis (Column)
        findQueenY(list, queens, king, set);        // Traverse Y Axis (Rows)
        findQueenI(list, queens, king, set);        // Traverse Increasing Diagonal
        findQueenD(list, queens, king, set);        // Traverse Decreasing Diagonal


        return list;
    }

    private static void populateSet(int[][] queens, Set<String> set) {
        for (int i=0; i < queens.length; i++) {
            set.add(String.valueOf(queens[i][0]) + queens[i][1]);
        }
    }


    private static void findQueenX(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {

        // Step1 - Traverse Positive X Axis from King (Going Right of Matrix)
        for (int x = king[1]; x <= MAXX - 1; x++) {
            System.out.println("King: " + king[0] + "  " + x);
            String kingIndex = String.valueOf(king[0]) + x;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(king[0]);
                tempList.add(x);
                list.add(tempList);
                break;
            }
        }

        System.out.println();

        // Step2 - Traverse Negative X Axis from King  (Going Left of Matrix)
        for (int x = king[1]; x >=0; x--) {
            System.out.println("King: " + king[0] + "  " + x);
            String kingIndex = String.valueOf(king[0]) + x;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(king[0]);
                tempList.add(x);
                list.add(tempList);
                break;
            }
        }

    }

    private static void findQueenY(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {

        System.out.println();

        // Step3 - Traverse Positive Y Axis from king (Going Down Matrix)
        for (int y = king[0]; y <= MAXY - 1; y++) {
            System.out.println("King: " + y + "  " + king[1]);
            String kingIndex = y + String.valueOf(king[1]);
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(y);
                tempList.add(king[1]);
                list.add(tempList);
                break;
            }
        }

        System.out.println();

        // Step4 - Traverse Negative Y Axis from King (Going up on Matrix)
        for (int y = king[0]; y >= 0; y--) {
            System.out.println("King: " + y + "  " + king[1]);
            String kingIndex = y + String.valueOf(king[1]);
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(y);
                tempList.add(king[1]);
                list.add(tempList);
                break;
            }
        }
    }

    private static void findQueenI(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {

        // Step5 - Traverse Diagonal  Increase UP ... note: This leads to Upper right
        System.out.println("==== Increase ");
        int x = king[0];
        int y = king[1];
        while(x < MAXX && y < MAXY && x >= 0 && y >= 0) {
            x += 1;
            y -= 1;
            System.out.println("King: " +  x + " " + y);
            String kingIndex = String.valueOf(x) + y;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(x);
                tempList.add(y);
                list.add(tempList);
                break;
            }
        }

        // Step6 - Traverse  Digaonal Increase DOWN ... note: This leads to Bottom Left
        System.out.println();
        x = king[0];
        y = king[1];
        while(x < MAXX && y < MAXY && x > 0 && y > 0) {
            x -= 1;
            y += 1;
            System.out.println("King: " +  x + " " + y);
            String kingIndex = String.valueOf(x) + y;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(x);
                tempList.add(y);
                list.add(tempList);
                break;
            }
        }

    }

    private static void findQueenD(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {

        // Step7 - Traverse Diagonal Decrease DOWN  ...Note this leads to the Bottom Right
        System.out.println("==== Decrease");
        int x = king[0];
        int y = king[1];
        while(x < MAXX && y < MAXY && x >= 0 && y >= 0) {
            x += 1;
            y += 1;
            System.out.println("King: " +  x + " " + y);
            String kingIndex = String.valueOf(x) + y;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(x);
                tempList.add(y);
                list.add(tempList);
                break;
            }
        }

        // Step8 - Traverse Diagonal Decrease UP ... Note: this leads to Upper Left
        System.out.println();
        x = king[0];
        y = king[1];
        while(x < MAXX && y < MAXY && x > 0 && y > 0) {
            x -= 1;
            y -= 1;
            System.out.println("King: " +  x + " " + y);
            String kingIndex = String.valueOf(x) + y;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(x);
                tempList.add(y);
                list.add(tempList);
                break;
            }
        }
    }
}

/**
 Solution
 - Holeeee shit, NOT an Medium Question at all. Took 2 days of coding
 - Strategy is simple
    1. Create a Set which stores the index in String format
    2. Traverse X,Y Axis & Increasing Diagonal and Decreasing Diagonal
    3. If index is in set, we add to list
    4. Return list

 - The hardest part was figuring how the fuck the index can traverse the matrix

 */