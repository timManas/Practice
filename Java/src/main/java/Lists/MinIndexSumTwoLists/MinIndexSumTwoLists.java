package Lists.MinIndexSumTwoLists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
        List<String> outputList = new ArrayList<>();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        // Populate Sets
        for (int i=0; i< arr1.length;i++) {
            set1.add(arr1[i]);
        }
        for (int i=0; i< arr2.length;i++) {
            set2.add(arr2[i]);
        }

        // Find the intersection of set
        Set<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.print("Intersection: " + intersection);





        // Convert outputList to Array
        String [] output = new String[outputList.size()];
        for (int i=0; i<outputList.size(); i++)
            output[i] = outputList.get(i);

        return output;
    }
}
