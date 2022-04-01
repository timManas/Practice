package Misc.XDeckOfCards;

import java.util.*;

public class XDeckOfCards {
    public static void main(String [] args) {
        int [][] input = {{1,1,1,1,2,2,2,2,2,2},{1,1,2,2,2,2},{1,1},{1,2,3,4,4,3,2,1}, {1,1,1,2,2,2,3,3}};
        for (int [] i : input)
            System.out.println("Has Group Size X: " + hasGroupsSizeX(i) + "\n");
    }

    public static boolean hasGroupsSizeX(int[] deck) {

        // Step1 - Create map to store the occurence of each number
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : deck) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        System.out.println("Map:" + map);

        // Step2 - Calculate the GCD
        int gcd = getGCD(map);
        if (gcd == 1)
            return false;


        // Step3 - Check if value can be divided eventually
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet())     {
            if (mapEntry.getValue() % gcd != 0)
                return false;
        }


        return true;
    }

    // Traverse from 2 to largest value in map values. If a GCD is found, return it. otherwise return 1
    private static int getGCD(Map<Integer, Integer> map) {
        int gcd = 1;

        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);

        outLoop:
        for (int i=2; i <= values.get(values.size() - 1); i++) {
            System.out.println("Current: " + i);

            inLoop:
            for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
                if (mapEntry.getValue() % i != 0)
                    continue outLoop;
            }

            gcd = i;
            break;
        }

        System.out.println("gcd: " + gcd);

        return gcd;
    }
}
