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
    }

    public static int findJudge(int n, int[][] trust) {
        // Create Map to store who trusted persons
        // Create Set to store list persons
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Set<Integer> set = new TreeSet<>();

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

        Set<Integer> trustingPeopleSet = map.keySet();
        // Find the Union
        set.removeAll(trustingPeopleSet);

        System.out.println("Judge: " + set);
        if (set.isEmpty())
            return -1;

        List<Integer> judgeList = new ArrayList<>(set);

        return judgeList.get(0);
    }
}
