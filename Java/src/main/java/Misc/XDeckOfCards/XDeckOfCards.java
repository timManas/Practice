package Misc.XDeckOfCards;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class XDeckOfCards {
    public static void main(String [] args) {
        int [][] input = {{1,1,2,2,2,2},{1,1},{1,2,3,4,4,3,2,1}, {1,1,1,2,2,2,3,3}};
        for (int [] i : input)
            System.out.println("Has Group Size X: " + hasGroupsSizeX(i) + "\n");
    }

    public static boolean hasGroupsSizeX(int[] deck) {

        int lowestValue = Integer.MAX_VALUE;
        int lowestKey = Integer.MAX_VALUE;

        if (deck.length <= 1)
            return false;

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : deck) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        System.out.println("Map:" + map);


        // Check values are all the same
        int prev = -1;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (value < lowestValue) {
                lowestKey = key;
                lowestValue = value;
            }
        }
        System.out.println("lowest key:" + lowestKey + "    value: " + lowestValue);

        // Check if value can be divided eventually
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            int key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (value % lowestValue != 0)
                return false;
        }


        return true;
    }
}
