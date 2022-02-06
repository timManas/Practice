package Misc.NumEquivalentDominoPairs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class NumEquivalentDominoPairs {
    public static void main(String [] args) {
        int [][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        System.out.println(numEquivDominoPairs(dominoes) + "\n");

        int [][] dominoes1 = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        System.out.println(numEquivDominoPairs(dominoes1) + "\n");

        int [][] dominoes2 = {{1,1},{2,2},{1,1},{1,2},{1,2},{1,1}};
        System.out.println(numEquivDominoPairs(dominoes2) + "\n");
    }

    public static int numEquivDominoPairs(int[][] dominoes) {

        // Step1 - Create Map to store the number of occurence
        Map<String, Integer> map = new TreeMap<>();
        for (int i=0; i < dominoes.length; i++) {
            Arrays.sort(dominoes[i]);
            String strDigit = String.valueOf(dominoes[i][0]) + String.valueOf(dominoes[i][1]);
            if (map.containsKey(strDigit))
                map.put(strDigit, map.get(strDigit) + 1);
            else
                map.put(strDigit, 1);
        }
        System.out.println("Map: " + map);

        // Step2 - Find the largest number of Pairs
        int count = 0;
        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            // Find the combination - Formula (n * n-1) / 2
            int combinations = (mapEntry.getValue() * (mapEntry.getValue() - 1)) / 2;
            count += combinations;
        }
        System.out.println("largest: " + count);


        return count;
    }
}
