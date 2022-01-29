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

        if (trust.length == 0) {
            if (n == 1)
                return 1;
            else
                return -1;
        }



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

        List<Integer> judgeList = null;
        List<Integer> list = new ArrayList<>(map.keySet());
        for (int i=0; i< list.size(); i++) {
            List<Integer> currentList = map.get(list.get(i));

            if (judgeList == null) {
                judgeList = currentList;
                continue;
            }

            judgeList.retainAll(currentList);
            System.out.println("judgeList:" + judgeList);

        }

        return judgeList.size() > 0 ? judgeList.get(0) : -1;
    }
}
