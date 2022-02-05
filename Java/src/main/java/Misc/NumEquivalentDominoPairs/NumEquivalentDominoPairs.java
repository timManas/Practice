package Misc.NumEquivalentDominoPairs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class NumEquivalentDominoPairs {
    public static void main(String [] args) {
        int [][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        System.out.println(numEquivDominoPairs(dominoes));

        int [][] dominoes1 = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        System.out.println(numEquivDominoPairs(dominoes1));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
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

        // Find the largest number of Pairs
        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            count = mapEntry.getValue() > count ? mapEntry.getValue() : count;
        }
        System.out.println("largest: " + count);

        if (count <= 2)
            return 1;

        return count;
    }
}
