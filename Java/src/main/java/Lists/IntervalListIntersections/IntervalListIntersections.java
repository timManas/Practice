package Lists.IntervalListIntersections;

import java.util.*;

public class IntervalListIntersections {

    public static void main(String [] args) {

//        int [][] A = {{0,2},{5,10},{13,23},{24,25}};
//        int [][] B = {{1,5},{8,12},{15,24},{25,26}};

        int [][] A = {};
        int [][] B = {};

        int [][] intersection = intervalIntersection(A, B);
        for (int i=0; i < intersection.length; i++) {
            for (int j=0; j < intersection[i].length; j++) {
                System.out.print(intersection[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<List<Integer>> list = new ArrayList<>();

        if (A.length == 0 || B.length == 0)
            return new int [0][0];

        int indexA = 0;
        int indexB = 0;
        ArrayList<Integer> intervalList = null;
        while (indexA < A.length && indexB < B.length) {

            // Fetch intersection
            intervalList = fetchIntersection(A[indexA], B[indexB]);

            // Add to main list
            System.out.println("List[" + indexA + "][" + indexB + "]: " + list);
            if (intervalList.size() > 0)
                list.add(intervalList);

            // Update Index
            if (A[indexA][1] < B[indexB][1]) {
                indexA++;
            } else if (A[indexA][1] > B[indexB][1]) {
                indexB++;
            } else {
                if (indexA < indexB)
                    indexA++;
                else
                    indexB++;
            }
        }
        System.out.println("List[" + indexA + "][" + indexB + "]: " + list);

        // Convert to MultiDimensional Array
        return convertList2Arr(list);
    }

    private static int[][] convertList2Arr(List<List<Integer>> list) {
        int [][] array = new int[list.size()][list.get(0).size()];

        int listIndex = 0;
        for (int i=0; i < list.size() && listIndex < list.size(); i++) {

            while (list.get(listIndex).size() == 0)
                ++listIndex;

            int [] tempArr = new int[2];
            tempArr[0] = list.get(listIndex).get(0);
            tempArr[1] = list.get(listIndex).get(list.get(listIndex).size() - 1);
            array[i] = tempArr;

            listIndex++;
        }


        return array;
    }

    private static ArrayList<Integer> fetchIntersection(int[] A, int[] B) {
        ArrayList<Integer> list;
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for (int i = A[0]; i <= A[1]; i++) {
            setA.add(i);
        }
        for (int i = B[0]; i <= B[1]; i++) {
            setB.add(i);
        }

        setA.retainAll(setB);

        list = new ArrayList<>(setA);
        return list;
    }
}
