package Math.SortIntegersByPowerValue;

import java.util.*;

public class SortIntegersByPowerValue {

    public static void main(String [] args) {
//        int lo = 12;
//        int hi = 15;
//        int k = 2;

//        int lo = 7;
//        int hi = 11;
//        int k = 4;

        int lo = 144;
        int hi = 163;
        int k = 5;

//        int lo = 1;
//        int hi = 1000;
//        int k = 777;

//        int lo = 10;
//        int hi = 20;
//        int k = 5;

        System.out.println("Kth value: " + getKth(lo, hi, k));
    }

    public static int getKth(int lo, int hi, int k) {

        // Step1 - Create Map to store the # and power
        Map<Integer, Integer> map = new TreeMap<>();

        // Step2 - Traverse from lo to hi
        while (lo <= hi) {

            // Step3 - Find the # of steps to get to zero
            // Place x and numSteps into map
            int numSteps = getNumSteps(lo);
            map.put(lo, numSteps);

            // Step4 - Incremenet lo
            ++lo;
        }

        // Step5 - Sort the Map by VALUE !!!! WATCH OUT FOR THISSSSS ...
        // Why ? We also want the keys sorted in the order they come in ..hence we use a TreeMap initally
        map = sortByValues(map);
        System.out.println("Map: " + map);

        // Step6 - Find the 'k' value of the newly sorted HashMap and return back
        int count = 0;
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            if (count == k-1)
                return mapEntry.getKey();

            count++;
        }

        return 0;
    }

    // The idea here is that we want to repetitivly find the number of steps depending if odd or even
    // Even: x = x/2
    // Odd: x = 3x + 1;
    private static int getNumSteps(int x) {
        int count = 0;
        while (x > 1) {
            if (x % 2 == 0)
                x = x / 2;
            else
                x = 3 * x + 1;

            count++;
        }

        return count;
    }

    // Sort an Map by Value
    // Note: We need to have a TREEMAP as input since this will sort the keys in order as well
    private static HashMap sortByValues(Map map) {

        // Step1 - Create List to store order
        // Note: This is a list of MapEntries
        List list = new LinkedList(map.entrySet());

        // Step2 - Define Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {

                // Here we use the .compareTo by comparing the getValue of both o1 and o2
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Step3 - Create a LinkedHashMap to preverse the insertion order
        // Remember that list is list of MapEntries
        HashMap sortedHashMap = new LinkedHashMap();

        // Step3b - Iterate through list
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }


}


/**
 Solution
 - Wow this is not an easy question
 You gotta do the following:
 1. Create map which list all the values between lo to hi and using the # of steps as values
 2. Sort the map based on the value
    > This is the tricky part since we have to sort an map based on value
    > YO !!! The input needs to be a TREEMAP since we also want the keys already sorted and now just sorting based on values
 3. Fetch the k element from sorted Map

 */