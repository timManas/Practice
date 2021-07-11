package Lists.FindLuckyNumberInInteger;

import java.util.Map;
import java.util.TreeMap;

public class FindLuckyNumberInInteger {
    public static void main(String [] args) {
        int [][] input = {{2,2,3,4}, {1,2,2,3,3,3}, {2,2,2,3,3}, {5}, {7,7,7,7,7,7,7}};
        for (int [] arr : input)
            System.out.println("Lucky Num: " + findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        int lucky = -1;

        // Step1 - Create map which stores the occurences
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i,1);
        }

        // Step2 - Find the largest lucky number ..where key == value
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getKey() == mapEntry.getValue())
                lucky = mapEntry.getKey();
        }

        return lucky;
    }
}
