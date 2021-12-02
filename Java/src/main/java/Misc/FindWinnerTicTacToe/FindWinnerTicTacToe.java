package Misc.FindWinnerTicTacToe;

import java.util.ArrayList;
import java.util.List;

public class FindWinnerTicTacToe {
    public static void main(String [] args) {
        int [][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        System.out.println("Winner: " + tictactoe(moves));

        int [][] moves2 = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        System.out.println("Winner: " + tictactoe(moves2));

        int [][] moves3 = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println("Winner: " + tictactoe(moves3));

        int [][] moves4 = {{0,0},{1,1}};
        System.out.println("Winner: " + tictactoe(moves4));

    }

    public static String tictactoe(int[][] moves) {
        // Seperate into two A and B
        List<List> listA = new ArrayList<>();
        List<List> listB = new ArrayList<>();

        for (int i=0; i < moves.length; i++) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(moves[i][0]);
            tempList.add(moves[i][1]);
            if (i % 2 == 0)
                listA.add(tempList);
            else
                listB.add(tempList);
        }
        System.out.println("A: " + listA);
        System.out.println("B: " + listB);



        String movesA = checkMoves(listA);
        String movesB = checkMoves(listB);

        // Check Row
        for (int i=0; i)

        // Check Column

        return "";
    }

    private static String checkMoves(List<List> list) {

        // Check Row
        for (int x=0; x < list.size(); x++) {
            for (int y=0; y < list.get(x).size(); y++) {

            }
        }

        // Check Column
        for (int y=0; y < list)

        // Check Diagonal TopLeft-BottomRight

        // Check Diagonal BottomLeft-TopRight

        return "Pending";
    }
}
