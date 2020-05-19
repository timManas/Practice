package Lists.IntervalListIntersections;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

    public static void main(String [] args) {

        int [][] A = {};
        int [][] B = {};
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
        
        return (int[][]) list.toArray();
    }
}
