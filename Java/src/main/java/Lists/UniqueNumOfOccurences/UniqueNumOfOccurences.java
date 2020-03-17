package Lists.UniqueNumOfOccurences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumOfOccurences {

    public static void main(String [] args) {
//        int [] arr = {1,2,2,1,1,3};
//        int [] arr = {1,2};
        int [] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println("Unique Occurences: " + uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Populate Map
        for (int i : arr) {
            int value = 1;
            if (map.containsKey(i))
                value = map.get(i) + 1;
            map.put(i, value);
        }

        // Create a set ... this will ensure that set length and map length should be the same if they are equal
        HashSet<Integer> set = new HashSet<Integer>(map.values());

        // If the set size is different from map size, then we know we have a duplicate
        if (set.size() != map.size())
            return false;

        return true;
    }

}
