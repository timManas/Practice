package Lists.ReduceArrSizeByHalf;

import java.util.*;

public class ReduceArrSizeByHalf {


    public static void main(String [] args) {
        int [] arr = {3,3,3,3,5,5,5,2,2,7};
//        int [] arr = {7,7,7,7,7,7};
//        int [] arr = {1,3};
//        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("MinSetSize: " + minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {

        // Step1 - Create return variable
        int minSetSize = 0;

        // Step2 - Create & Populate Map
        // Need this map to see # of occurences
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            int value = 1;
            if (map.containsKey(i))
                value = map.get(i) + 1;
            map.put(i, value);
        }

        // Step3 - Sort the map by value (NOT by key)
        map = sortByValue(map);
        System.out.println(map);

        // Step4 - Calculate minSetSize
        // How ? Go through each mapEntry, add to count and check if count is finally greater than array size / 2
        int currentNumOccurences = 0 ;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            currentNumOccurences += mapEntry.getValue();
            ++minSetSize;

            // Check if currentNumOccurences is greater than array length / 2
            if (currentNumOccurences >= arr.length / 2)
                return minSetSize;
        }



        return minSetSize;
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> treeMap) {
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry> list = new LinkedList<>(treeMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (((Comparable)o1.getValue()).compareTo(o2.getValue()));
            }
        });

        Collections.reverse(list);

        for (Map.Entry mapEntry : list) {
            sortedMap.put((Integer) mapEntry.getKey(), (Integer) mapEntry.getValue());
        }


        return sortedMap;
    }
}


/**
 Note
 - I HAD this solution ...but i didnt trust it.
    > When i checked the solution, it pretty much described my solution =(
 - Idea is quite simple, quite straightforward but my over analyzing made it harder

 Solution
 1. Find # of occurences of each digit using map
 2. Sort the map by value
 3. Starting from the Top, we add onto the currentNumOccurences and check if greater than array size / 2
    > If so, we return the # of minSetSize
    > We continue adding to the currentNumOccurences


 */
