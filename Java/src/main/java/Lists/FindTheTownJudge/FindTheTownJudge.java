package Lists.FindTheTownJudge;

import java.util.*;

public class FindTheTownJudge {
    public static void main(String [] args) {
        int n = 2;
        int [][] trust = {{1,2}};
        System.out.println("Find Judge: " + findJudge(n, trust) + "\n");

        int n1 = 3;
        int [][] trust1 = {{1,3}, {2,3}};
        System.out.println("Find Judge: " + findJudge(n1, trust1) + "\n");

        int n2 = 3;
        int [][] trust2 = {{1,3}, {2,3}, {3,1}};
        System.out.println("Find Judge: " + findJudge(n2, trust2) + "\n");

        int n3 = 3;
        int [][] trust3 = {{1,2}, {2,3}};
        System.out.println("Find Judge: " + findJudge(n3, trust3) + "\n");

        int n4 = 4;
        int [][] trust4 = {{1,3}, {1,4}, {2,3}};
        System.out.println("Find Judge: " + findJudge(n4, trust4) + "\n");
    }

    public static int findJudge(int n, int[][] trust) {

        // Step1 - Check if the sizes are  proper
        if (trust.length == 0) {
            if (n == 1)         // If only one element exists, thats the judge
                return 1;
            else
                return -1;      // Otherwise, condition 1 is not satisified. Return -1
        }

        // Step1 - Create Map to store who trusted persons
        // Create Set to store list persons
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Set<Integer> set = new TreeSet<>();

        // Step2 - Traverse input Array and populate Map and Set
        for (int i=0; i<trust.length; i++) {
            int personA = trust[i][0];
            int personB = trust[i][1];

            // Add both people to set
            set.add(personA);
            set.add(personB);

            List<Integer> tempList = new ArrayList<>();
            if (map.containsKey(personA)) {
                tempList = map.get(personA);
            }
            tempList.add(personB);
            map.put(personA, tempList);
        }
        System.out.println("Map: " + map);
        System.out.println("Set: " + set);

        // Step3 - Populate the maps values
        // Find the Intersect of the list. That  remaining value is the judge
        List<Integer> judgeList = null;
        List<Integer> list = new ArrayList<>(map.keySet());
        for (int i=0; i< list.size(); i++) {
            List<Integer> currentList = map.get(list.get(i));

            // If first element, we move on
            if (judgeList == null) {
                judgeList = currentList;
                continue;
            }

            judgeList.retainAll(currentList);
            System.out.println("judgeList:" + judgeList);
        }

        // Step4 - Check if the number of people are n-1, since only the judge likes himself
        if (map.keySet().size() != n - 1)
            return -1;

        return judgeList.size() > 0 ? judgeList.get(0) : -1;
    }
}
