package Graphs.FindCentreOfStarGraph;

public class FindCentreOfStarGraph {
    public static void main(String [] args) {
        int [][] input = {{1,2},{2,3},{4,2}};
        System.out.println("Center: " + findCenter(input));
    }

    public static  int findCenter(int[][] edges) {
        int common = -1;

        // Find the first and last element arrays
        int a = edges[0][0];
        int b = edges[0][1];
        int u = edges[edges.length-1][0];
        int v = edges[edges.length-1][1];

        // Compare 1st array with last array ...thats it
        // No need to loop through
        if (a == u || a == v)
            return a;
        if (b == u || b == v)
            return b;


        return common;
    }
}
