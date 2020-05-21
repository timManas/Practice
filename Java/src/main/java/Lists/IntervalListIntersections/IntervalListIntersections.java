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
        // Step1 - Create output variable
        List<List<Integer>> list = new ArrayList<>();

        // Step2 - Check if both A & B sizes are bigger than 0. Otherwise no match
        if (A.length == 0 || B.length == 0)
            return new int [0][0];

        // Step3 - Traverse both A & B
        int indexA = 0;
        int indexB = 0;
        ArrayList<Integer> intervalList = null;
        while (indexA < A.length && indexB < B.length) {

            // Step3a - Fetch intersection
            intervalList = fetchIntersection(A[indexA], B[indexB]);

            // Step3b - Add to main list
            System.out.println("List[" + indexA + "][" + indexB + "]: " + list);
            if (intervalList.size() > 0)
                list.add(intervalList);

            // Step3c - Update Index
            // Index which has smaller range gets updated
            // Why ? Because we want to update the smaller one. Thats it
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

        // Step4- Convert to MultiDimensional Array
        return convertList2Arr(list);
    }

    // Converts two dimensional list to two dimensional Array
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

    // Fetches the intersection between two arrays
    private static ArrayList<Integer> fetchIntersection(int[] A, int[] B) {
        ArrayList<Integer> list;
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        // Convert to Sets
        for (int i = A[0]; i <= A[1]; i++) {
            setA.add(i);
        }
        for (int i = B[0]; i <= B[1]; i++) {
            setB.add(i);
        }

        // Finds the intersection
        setA.retainAll(setB);

        list = new ArrayList<>(setA);
        return list;
    }
}


/**
 Note
 - This code only passes 76/86 Test cases


 Solution
 1. Traverse both A & B at the same time using index
 2. Find the intersection between A and B for its respective index
 3. Update indexes - Whichever has smaller range, we increment it's index
 4. Add to Arraylist
 5. Convert ArrayList to Multi-Dim Array
 */