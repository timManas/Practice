package Graphs.FindIfPathExistsInGraph;

public class FindIfPathExistsInGraph {
    public static void main(String [] args) {
        int n = 3;
        int [][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;
        System.out.println("Is Valid Path: " + validPath(n, edges, source, destination));

        int n1 = 6;
        int [][] edges1 = {{0,1},{1,2},{3,5},{5,4},{4,3}};
        int source1 = 0;
        int destination1 = 5;
        System.out.println("Is Valid Path: " + validPath(n, edges, source, destination));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        return true;
    }

}
