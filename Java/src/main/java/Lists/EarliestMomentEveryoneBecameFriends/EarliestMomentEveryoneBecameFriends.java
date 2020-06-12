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

//        int [][] logs = {{3,0,3},
//                        {4,1,2},
//                        {0,2,0},
//                        {2,0,2},
//                        {8,0,3},
//                        {1,0,1},
//                        {5,1,2},
//                        {7,3,1},
//                        {6,1,0},
//                        {9,3,0}};

//        int [][] logs = {
//                {0,2,0},
//                {1,0,1},
//                {2,0,2},
//                {3,0,3},
//                {4,1,2},
//                {5,1,2},
//                {6,1,0},
//                {7,3,1},
//                {8,0,3},
//                {9,3,0}};

        int [][] logs = {{7,3,1},
                {11,0,1},
                {9,1,3},
                {2,3,0},
                {5,3,2},
                {10,2,1},
                {1,0,2},
                {3,2,1},
                {8,3,2},
                {0,2,0},
                {6,0,1},
                {4,3,2}};

        int N = 4;

        System.out.println("Earliest Acquitance: " + earliestAcq(logs, N));

    }

    public static int earliestAcq(int[][] logs, int N) {

        int time = 0;

        // Step1 : Sort the logs Array
        // Why ? Because we want to make sure we get the right time when all friends meeet.
        Arrays.sort(logs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return ((Comparable)o1[0]).compareTo(o2[0]);
            }
        });



        // Step2 - Create & Initialize list
        List<Set<Integer>> list = new ArrayList<>();             // Holds the list of Sets
        for (int i=0; i < N; i++) {
            Set<Integer> set = new TreeSet<>();
            set.add(i);
            list.add(set);
        }

        // Step3 - Traverse the Logs Array
        for (int i=0; i < logs.length; i++) {

            // Step3a = Parse the logTime, idA, idB
            int logTime = logs[i][0];
            int idA = logs[i][1];
            int idB = logs[i][2];
            System.out.println("LogTime: " + logTime + "    idA: " + idA + "    idB: " + idB);


            // Step3b = Use find to fetch the indexes
            int indexSetA = find(list, idA);
            int indexSetB = find(list, idB);

            // Step3c - Fetch the sets
            Set<Integer> setA = list.get(indexSetA);
            Set<Integer> setB = list.get(indexSetB);

            // Step3c - If both set are the same value
            if (setA.containsAll(setB))
                continue;

            // Step4 - Perform the union operation
            setA.addAll(setB);
            list.set(indexSetA, setA);

            // Step5 - Delete the setB
            list.remove(indexSetB);

            // Step6 - Break early if all friends meet each other
            if (list.size() == 1) {
                time = logTime;
                break;
            }
        }

        // Step6 - If Two seperate group of friends exists
        if (list.size() != 1)
            return -1;

        return time;
    }

    // Fetches the Index of the id > Return -1 if nothing found
    private static int find(List<Set<Integer>> list, int id) {
        for (int i=0; i < list.size(); i++) {
            if (list.get(i).contains(id))
                return i;
        }

        return -1;
    }

}


/**
 Note
 - Had a fancy solution but it was buggy. KISS (Keep it simple stupid)
 - Use a Union-Find Algorithm

 Solution
 - Used a union find algorithm
 0. Create list of Sets
 1. Find both Sets
 2. "Unite" (aka Union) the two sets if they are different
    > Otherwise, do nothing
 4. Place back into original list of sets
 3. Delete the duplicate set

 */