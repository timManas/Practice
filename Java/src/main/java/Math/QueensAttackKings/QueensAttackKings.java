package Math.QueensAttackKings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueensAttackKings {

    public static void main(String [] args) {

        int [][] queen = {{5,6},{7,7},{2,1},{0,7},{1,6},{5,1},{3,7},{0,3},{4,0},{1,2},{6,3},{5,0},{0,4},{2,2},{1,1},{6,4},{5,4},{0,0},{2,6},{4,5},{5,2},{1,4},{7,5},{2,3},{0,5},{4,2},{1,0},{2,7},{0,1},{4,6},{6,1},{0,6},{4,3},{1,7}};
        int [] king = {3,4};

        System.out.println("List of Queens Available for attacking King: " + queensAttacktheKing(queen, king));
    }

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> list = new ArrayList<>();

        // Sort Queen
        // This is how we fucking Sort a two dimensional Array
        // First, sort by Column
        // Second, Sort by Row
        Arrays.sort(queens, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        // Sort Queen
        Arrays.sort(queens, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        findQueenX(list, queens, king);
        findQueenY(list, queens, king);
        findQueenI(list, queens, king);
        findQueenD(list, queens, king);


        return list;
    }


    private static void findQueenX(List<List<Integer>> list, int[][] queens, int[] king) {
        int start = king[0];
        int end = 8;


        for (int i = start; i <= end; i++) {
            if (queens[king[0]][i] == king[0]) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(i);
                tempList.add(king[1]);
                list.add(tempList);
                break;
            }
        }

        end = 0;
        for (int i = start; i >= end; i--) {
            if (queens[i][king[1]] == king[0]) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(i);
                tempList.add(king[1]);
                list.add(tempList);
                break;
            }
        }
    }

    private static void findQueenY(List<List<Integer>> list, int[][] queens, int[] king) {
    }

    private static void findQueenI(List<List<Integer>> list, int[][] queens, int[] king) {
    }

    private static void findQueenD(List<List<Integer>> list, int[][] queens, int[] king) {
    }
}
