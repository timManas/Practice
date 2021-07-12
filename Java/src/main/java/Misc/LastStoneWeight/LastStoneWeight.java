package Misc.LastStoneWeight;

import java.util.*;

public class LastStoneWeight {
    public static void main(String [] args) {
        int [] input = {2,7,4,1,8,1};
        System.out.println("Last Stone Weight: " + lastStoneWeight(input));
    }

    public static int lastStoneWeight(int[] stones) {

        // Step1 - Create list and populate
        List<Integer> list = new ArrayList<>();
        for (int i : stones) list.add(i);

        // Step2 - Loop by smashing the two heaviest rocks until 1 or none remains
        while (list.size() > 1) {

            // Step3 - Sort the list
            Collections.sort(list);

            // Get the two heaviest stones
            int y = list.remove(list.size()-1);
            int x = list.remove(list.size()-1);

            System.out.println("x: " + x + "    y: " + y);

            // We add the difference back to the list
            if (x != y) {
                list.add(y-x);
            }
        }

        if (list.isEmpty())
            return 0;

        return list.get(0);
    }
}
