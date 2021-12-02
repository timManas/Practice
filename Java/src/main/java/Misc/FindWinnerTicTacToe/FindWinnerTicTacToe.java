package Misc.FindWinnerTicTacToe;

import java.util.*;

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

        int [][] moves5 = {{2,2},{0,2},{1,0},{0,1},{2,0},{0,0}};
        System.out.println("Winner: " + tictactoe(moves5));

    }

    public static String tictactoe(int[][] moves) {
        // Step1 - Seperate into two list: A and B
        List<List<Integer>> listA = new ArrayList<>();
        List<List<Integer>> listB = new ArrayList<>();

        // Step2 - Populate the list
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

        // Step3 - Analyze which player Won
        String movesA = checkMoves(listA, "A");
        String movesB = checkMoves(listB, "B");

        // Step4 - Return player who won or draw or pending
        if (movesA.equals("A")) {
            return "A";
        } else if (movesB.equals("B"))
            return "B";

        return listA.size() + listB.size() == 9 ? "Draw": "Pending";
    }

    private static String checkMoves(List<List<Integer>> list, String player) {

        // Step1 - Check Row from top to bottom
        Map<Integer,Integer> rowMap = new LinkedHashMap<>();
        for (int x=0; x < list.size(); x++) {
            if (rowMap.containsKey(list.get(x).get(0)))
                rowMap.put(list.get(x).get(0), rowMap.get(list.get(x).get(0)) + 1);
            else
                rowMap.put(list.get(x).get(0), 1);

            // Check if each row was filled
            if (rowMap.get(list.get(x).get(0)) == 3)
                return player;

        }


        // Step2 - Check Column
        Map<Integer,Integer> colMap = new LinkedHashMap<>();
        for (int y=0; y < list.size(); y++) {
            if (colMap.containsKey(list.get(y).get(1)))
                colMap.put(list.get(y).get(1), colMap.get(list.get(y).get(1)) + 1);
            else
                colMap.put(list.get(y).get(1), 1);

            if (colMap.get(list.get(y).get(1)) == 3)
                return player;
        }


        // Step3 - Check Diagonal TopLeft-BottomRight
        Set<Integer> setD_TLBR = new TreeSet<>();
        for (int a=0; a<list.size(); a++) {
            if (list.get(a).get(0) != list.get(a).get(1))
                continue;
            setD_TLBR.add(list.get(a).get(0));

            if (setD_TLBR.size() >= 3)
                return player;
        }


        // Step4 - Check Diagonal BottomLeft-TopRight
        Set<Integer> setD_BLTR = new TreeSet<>();
        for (int b=0; b<list.size(); b++) {
            if (list.get(b).get(0) == 0 && list.get(b).get(1) == 2) {
                setD_BLTR.add(list.get(b).get(0));
            } else if (list.get(b).get(0) == 1 && list.get(b).get(1) == 1) {
                setD_BLTR.add(list.get(b).get(0));
            } else if (list.get(b).get(0) == 2 && list.get(b).get(1) == 0) {
                setD_BLTR.add(list.get(b).get(0));
            }

            if (setD_BLTR.size() >= 3)
                return player;
        }




        return "Pending";
    }
}
