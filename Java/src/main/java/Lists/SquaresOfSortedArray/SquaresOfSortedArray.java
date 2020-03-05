package Lists.SquaresOfSortedArray;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String [] args) {
        int [] nums = {-4,-1,0,3,10};
        int [] sortedSq = sortedSquares(nums);
        for (int i : sortedSq)
            System.out.println(i);
    }

    public static int[] sortedSquares(int[] A) {
        int [] sorted = new int[A.length];

        for (int i=0; i < A.length; i++) {
            sorted[i] = (int) Math.pow(A[i],2);
        }

        // TODO :: Use QuickSort to sort array
        Arrays.sort(sorted);

        return sorted;
    }
}
