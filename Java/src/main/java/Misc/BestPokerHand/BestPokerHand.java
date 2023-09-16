package Misc.BestPokerHand;

import java.util.*;

public class BestPokerHand {
    public static void main(String [] args) {
        int [] ranks = {13,2,3,1,9};
        char [] suits = {'a','a','a','a','a'};
        System.out.println("bestHand: " + bestHand(ranks, suits) + "\n");

        int [] ranks1 = {4,4,2,4,4};
        char [] suits1 = {'d','a','a','b','c'};
        System.out.println("bestHand: " + bestHand(ranks1, suits1)+ "\n");

        int [] ranks2 = {10,10,2,12,9};
        char [] suits2 = {'a','b','c','a','d'};
        System.out.println("bestHand: " + bestHand(ranks2, suits2)+ "\n");
    }

    public static String bestHand(int[] ranks, char[] suits) {
        Map<Character, List<Integer>> suitMap = new TreeMap<>();
        Map<Integer, Integer> rankMap = new TreeMap<>();


        // Populate map
        for (int i=0; i<suits.length; i++) {
            int rank = ranks[i];
            char suit = suits[i];

            // Update SuitMap
            List<Integer> list = new ArrayList<>();
            if (suitMap.containsKey(suit)) {
                list = suitMap.get(suit);
                list.add(rank);
                Collections.sort(list);
            } else {
                list.add(rank);
            }
            suitMap.put(suit, list);

            if (rankMap.containsKey(rank)) {
                rankMap.put(rank, rankMap.get(rank) + 1);
            } else {
                rankMap.put(rank,1);
            }


        }

        System.out.println("suitMap: " + suitMap);
        System.out.println("rankMap: " + rankMap);

        List<Integer> valueList = new ArrayList<>(rankMap.values());
        Collections.sort(valueList);
        Collections.reverse(valueList);

        System.out.println("valueList: " + valueList);


        // Check if map
        if (suitMap.size() == 1)
            return "Flush";

        if (valueList.get(0) >= 3)
            return "Three of a Kind";

        if (valueList.get(0) == 2)
            return "Pair";

        return "High Card";
    }


}
