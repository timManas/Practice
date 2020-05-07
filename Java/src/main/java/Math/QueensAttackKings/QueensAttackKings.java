package Math.QueensAttackKings;

import java.util.*;

public class QueensAttackKings {

    public static void main(String [] args) {

        int [][] queen = {{3,1},{3,2},{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};
        int [] king = {3,4};

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
        int end = 8;


        for (int i = king[0]; i <= end; i++) {
            System.out.println("King: " + king[0] + "  " + i);
            String kingIndex = String.valueOf(king[0]) + i;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(king[0]);
                tempList.add(i);
                list.add(tempList);
                break;
            }
        }

        System.out.println();

        for (int i = king[0]; i >=0; i--) {
            System.out.println("King: " + king[0] + "  " + i);
            String kingIndex = String.valueOf(king[0]) + i;
            if (set.contains(kingIndex)) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(king[0]);
                tempList.add(i);
                list.add(tempList);
                break;
            }
        }


    }

    private static void findQueenY(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {
    }

    private static void findQueenI(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {
    }

    private static void findQueenD(List<List<Integer>> list, int[][] queens, int[] king, Set<String> set) {
    }
}
