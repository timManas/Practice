package Lists.SortThePeople;

import java.util.*;

public class SortThePeople {

    public static void main(String [] args) {
//        String [] names = {"Mary","John","Emma"};
//        int [] heights = {180,165,170};
//        System.out.println("sortPeople: " + Arrays.toString(sortPeople(names, heights)));

        String [] names1 = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int [] heights1 = {17233,32521,14087,42738,46669,65662,43204,8224};
        System.out.println("sortPeople: " + Arrays.toString(sortPeople(names1, heights1)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String [] output = new String[names.length];

        Map<Integer, String> map = new TreeMap<Integer, String>();
        for (int i=0; i<names.length; i++) map.put(heights[i], names[i]);

        // Sort map by value
        map = sortByKey(map);
        System.out.println("sorted map: " + map);

        int index = 0;
        for (String name : map.values())
            output[index++] = name;


        return output;
    }

    public static Map<Integer, String> sortByKey(Map<Integer, String> map) {
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        Collections.reverse(list);

        Map<Integer, String> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }



}
