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

        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();

        populateSet(queens, set);

        findQueenX(list, queens, king, set);
        findQueenY(list, queens, king, set);
        findQueenI(list, queens, king, set);
        findQueenD(list, queens, king, set);


        return list;
    }

    private static void populateSet(int[][] queens, Set<String> set) {
        for (int i=0; i < queens.length; i++) {
            set.add(String.valueOf(queens[i][0]) + queens[i][1]);
        }
    }


    private static void findQueenX(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {

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
