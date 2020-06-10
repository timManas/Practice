package Lists.EarliestMomentEveryoneBecameFriends;

import java.util.*;

public class EarliestMomentEveryoneBecameFriends {

    public static void main(String [] args) {
//        int [][] logs = {{20190101,0,1},
//                        {20190104,3,4},
//                        {20190107,2,3},
//                        {20190211,1,5},
//                        {20190224,2,4},
//                        {20190301,0,3},
//                        {20190312,1,2},
//                        {20190322,4,5}};

        int [][] logs = {{3,0,3},
                        {4,1,2},
                        {0,2,0},
                        {2,0,2},
                        {8,0,3},
                        {1,0,1},
                        {5,1,2},
                        {7,3,1},
                        {6,1,0},
                        {9,3,0}};

        int N = 4;

        System.out.println("Earliest Acquitance: " + earliestAcq(logs, N));

    }

    public static int earliestAcq(int[][] logs, int N) {
        int time = 0;

        // Create & Initialize
        List<Integer> positionList = new ArrayList<>();             // Holds the position on which Set the # belongs too
        Map<Integer, Set<Integer>> map = new HashMap<>();               // Holds the list of Sets
        for (int i=0; i < N; i++) {
            Set<Integer> set = new TreeSet<>();
            set.add(i);
            map.put(i, set);
            positionList.add(i);
        }

        for (int i=0; i < logs.length; i++) {

            int logTime = logs[i][0];
            int idA = logs[i][1];
            int idB = logs[i][2];
            System.out.println("LogTime: " + logTime + "    idA: " + idA + "    idB: " + idB);

            // Fetch the set
            Set<Integer> setA = map.get(positionList.get(idA));
            Set<Integer> setB = map.get(positionList.get(idB));

            if (setA == null || setB == null )
                continue;

            // Place setB into setA
            setA.addAll(setB);

            // Set positionB to be null
//            setB.clear();
            map.remove(positionList.get(idB));

            // Update position Mapping
            positionList.set(idB, positionList.get(idA));

            if (map.size() == 1)
                time = logTime;
        }

        // If Two seperate group of friends exists
        if (map.size() != 1)
            return -1;

        return time;
    }

}
