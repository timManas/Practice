package Lists.SingleNumber;

import java.util.*;

public class SingleNumber {

    public static void main(String [] args) {
        int [] input = {4,1,2,1,2};
        System.out.println("SingleNum: " + singleNumber(input));

    }

    public static int singleNumber(int[] nums) {
        int singleNum = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i : nums ) {
            if (treeMap.containsKey(i))
                treeMap.put(i, treeMap.get(i) + 1);
            else
                treeMap.put(i, 1);
        }

        for (Map.Entry<Integer, Integer> mapEntry : treeMap.entrySet()) {
            Integer key = mapEntry.getKey();
            int value = mapEntry.getValue();

            if (value == 1)
                return key;
        }



        return -1;
    }
}
