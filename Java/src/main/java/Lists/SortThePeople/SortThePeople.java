package Lists.SortThePeople;

import java.util.*;

public class SortThePeople {

    public static void main(String [] args) {
        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        System.out.println("sortPeople: " + Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String [] output = new String[3];

        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i=0; i<names.length; i++) map.put(names[i], heights[i]);

        // Sort map by value
        map = sortByValue(map);
        System.out.println("sorted map: " + map);

        int index = 0;
        for (String name : map.keySet())
            output[index++] = name;


        return output;
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
