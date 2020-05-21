package Lists.IntervalListIntersections;

import java.util.*;

public class IntervalListIntersections {

    public static void main(String [] args) {

        int [][] A = {{0,2},{5,10},{13,23},{24,25}};
        int [][] B = {{1,5},{8,12},{15,24},{25,26}};

//        int [][] A = {};
//        int [][] B = {};

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
        List<int[]> list = new ArrayList<>();

        // Step2 - Check if both A & B sizes are bigger than 0. Otherwise no match
        if (A.length == 0 || B.length == 0)
            return new int [0][0];

        // Step3 - Traverse both A & B
        int indexA = 0;
        int indexB = 0;

        int [] intervalList;
        while (indexA < A.length && indexB < B.length) {

            // Step3a - Fetch intersection
            intervalList = fetchIntersection(A[indexA], B[indexB]);

            // Step3b - Add to main list
            System.out.println("List[" + indexA + "][" + indexB + "]: " + list);
            if (intervalList.length > 0)
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



    // Fetches the intersection between two arrays
    // We create a set to fetch all valid interval values
    // 'start' index should the smallest value in set
    // 'end' index should be largest value in set
    private static int[] fetchIntersection(int[] A, int[] B) {
        int [] arr = new int[2];

        // Checks if valid
        // We have only 4 comparison since we compare the values of A and B to each other
        TreeSet<Integer> set = new TreeSet<>();
        if (A[0] <= B[0] && B[0] <= A[1])   // Check: A[0] <= B[0] <= A[1]
            set.add(B[0]);
        if (A[0] <= B[1] && B[1] <= A[1])   // Check: A[0] <= B[1] <= A[1]
            set.add(B[1]);
        if (B[0] <= A[0] && A[0] <= B[1])   // Check: B[0] <= A[0] <= B[1]
            set.add(A[0]);
        if (B[0] <= A[1] && A[1] <= B[1])   // Check: B[0] <= A[1] <= B[1]
            set.add(A[1]);

        // If no value in set, we return an empty array
        if (set.size() == 0)
            return new int[0];

        arr[0] = set.first();       // Start Index .. should be smallest valid value
        arr[1] = set.last();        // End Index   .. should be largest valid value
        return arr;
    }


    // Converts two dimensional list to two dimensional Array
    private static int[][] convertList2Arr(List<int[]> list) {
        int [][] array = new int[list.size()][list.get(0).length];

        int listIndex = 0;
        for (int i=0; i < list.size() && listIndex < list.size(); i++) {

            while(list.get(listIndex).length == 0 )
                ++listIndex;

            array[i] = list.get(i);
        }

        return array;
    }


}


/**
 Note
 - This code only passes 76/86 Test cases
 - Update - COde fully passed 100%


 Solution
 1. Traverse both A & B at the same time using index
 2. Find the intersection between A and B for its respective index
 3. Update indexes - Whichever has smaller range, we increment it's index
 4. Add to Arraylist
 5. Convert ArrayList to Multi-Dim Array
 */