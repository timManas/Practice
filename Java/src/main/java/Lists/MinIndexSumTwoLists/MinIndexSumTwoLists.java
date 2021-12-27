package Lists.MinIndexSumTwoLists;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class MinIndexSumTwoLists {
    public static void main(String [] args) {
        String [] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String [] output = findRestaurant(list1, list2);
        for (String i : output)
            System.out.print(i + ",");
        System.out.println();

        String [] list3 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list4 = {"KFC","Shogun","Burger King"};
        String [] output1 = findRestaurant(list3, list4);
        for (String i : output1)
            System.out.print(i + ",");
        System.out.println();
    }

    public static String[] findRestaurant(String[] arr1, String[] arr2) {

        // Step1 - Create outputList to store smallest index and sets to store unique elements
        List<String> outputList = new ArrayList<>();        // Create outputList to store smallest Sum Index
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        // Step2 - Populate Sets
        for (int i=0; i< arr1.length;i++) {
            set1.add(arr1[i]);
        }
        for (int i=0; i< arr2.length;i++) {
            set2.add(arr2[i]);
        }

        // Step3 - Find the intersection of set
        Set<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Step4 - Create map to store the sumIndex
        List<String> intersectionList = new ArrayList<>(intersection);
        List<String> list1 = new ArrayList<>(set1);
        List<String> list2 = new ArrayList<>(set2);
        Map<String, Integer> mapCount = new TreeMap<>();
        for (String word : intersectionList) {
            int index1 =  list1.indexOf(word);
            int index2 = list2.indexOf(word);
            int indexSum = index1 + index2;
            mapCount.put(word, indexSum);
        }
        System.out.println("Map: " + mapCount);

        // Step5 - Sort Map by value ascending
        mapCount = sortByValue(mapCount);
        System.out.println("Sorted By Value Map: " + mapCount);

        // Step5 - Add smallest index to output list
        int smallIndexSum = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> mapEntry : mapCount.entrySet()) {
            if (outputList.isEmpty() || mapEntry.getValue() <=   smallIndexSum ) {
                outputList.add(mapEntry.getKey());
            }
            smallIndexSum = smallIndexSum > mapEntry.getValue() ? mapEntry.getValue() : smallIndexSum;
        }

        // Step6 - Convert outputList to Array
        String [] output = new String[outputList.size()];
        for (int i=0; i<outputList.size(); i++)
            output[i] = outputList.get(i);

        return output;
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> treeMap) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry> list = new LinkedList<>(treeMap.entrySet());

        // Sort List
        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return ((Comparable)o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Place in LinkedList
        for (Map.Entry mapEntry : list) {
            sortedMap.put((String) mapEntry.getKey(), (Integer) mapEntry.getValue());
        }

        return sortedMap;
    }



}
