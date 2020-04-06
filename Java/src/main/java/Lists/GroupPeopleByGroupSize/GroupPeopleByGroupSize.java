package Lists.GroupPeopleByGroupSize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPeopleByGroupSize {

    public static void main(String [] args) {
        int [] groupSizes = {3,3,3,3,3,1,3};
        System.out.println("GroupSize: " + groupThePeople(groupSizes));
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        //Step1 - Create the list to be outputted
        List<List<Integer>> list = new ArrayList<>();

        // Step2 - Create Map to host our list
        // Everytime of the list gets full, we place them in the main list above
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step3 - Traverse through array once
        for (int i=0; i < groupSizes.length; i++) {
            int element = groupSizes[i];

            // Create List if it does not exist. Otherwise fetch from map
            List<Integer> groupList = new ArrayList<>();
            if (map.containsKey(element)) {
                groupList = map.get(element);
            }

            // Step4 - Add to map
            groupList.add(i);
            map.put(element, groupList);

            // Step5 - Check if the map Index matches the list size
            // Ex "3" and the list size is 3, we move the groupList to mainList
            if (groupList.size() == element) {
                list.add(groupList);
                map.put(element, new ArrayList<Integer>());
                System.out.println("GroupList Full ...");
            }
        }

        return list;
    }

}


/**
 Solution
 - Create a map which stores all the keys as indexes and Elements are list
 - Everytime the list in the map get full, we place them in the main List
 - Traverse through the list once

 */
