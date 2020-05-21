package Lists.IntervalListIntersections;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

    public static void main(String [] args) {

        int [][] A = {{0,2},{5,10},{13,23},{24,25}};
        int [][] B = {{1,5},{8,12},{15,24},{25,26}};
        int [][] intersection = intervalIntersection(A, B);
        for (int i=0; i < intersection.length; i++) {
            for (int j=0; j < intersection[i].length; j++) {
                System.out.println(intersection[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<List<Integer>> list = new ArrayList<>();

        int indexA = 0;
        int indexB = 0;
        while (indexA < A.length - 1 || indexB < B.length - 1) {
            ArrayList<Integer> intervalList = fetchIntersection(A[indexA], B[indexB]);

            if (A[indexA][1] <= B[indexB][1])
                indexA++;
            else if (A[indexA][1] > B[indexB][1])
                indexB++;

            list.add(intervalList);
        }

        return convertList2Arr(list);
    }

    private static int[][] convertList2Arr(List<List<Integer>> list) {
        int [][] array = new int[list.size()][list.get(0).size()];

        return array;
    }

    private static ArrayList<Integer> fetchIntersection(int[] ints, int[] ints1) {
        ArrayList<Integer> list = new ArrayList<>();

        return list;
    }
}
