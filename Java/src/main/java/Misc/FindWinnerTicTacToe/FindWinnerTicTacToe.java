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
        List<int []> listA = new ArrayList<>();
        List<int []> listB = new ArrayList<>();

        for (int i=0; i < moves.length; i++) {
            if (i % 2 == 0)
                listA.add(moves[i]);
            else
                listB.add(moves[i]);
        }
        System.out.println("A: " + listA);
        System.out.println("B: " + listB);

        // Calculate

        return "";
    }
}
