package Graphs.FindIfPathExistsInGraph;

import java.util.*;

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
        System.out.println("Is Valid Path: " + validPath(n1, edges1, source1, destination1));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        // Create map to store the relationships of each node
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i=0; i<edges.length;i++) {
            int node = edges[i][0];
            int neighbour = edges[i][1];

            List<Integer> tempList = new ArrayList<>();
            if (map.containsKey(node)) {
                tempList = map.get(node);
                tempList.add(neighbour);
            }

            tempList.add(node);
            map.put(node,tempList);
        }
        System.out.println("Map: " + map);

        // Traverse graph starting from source
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new TreeSet<>();
        set.add(source);
        traverseGraph(map, set, stack, source, destination);

        return true;
    }

    private static void traverseGraph(Map<Integer, List<Integer>> map, Set<Integer> set, Stack<Integer> stack, int current, int destination) {
        List<Integer> neighbourList = map.get(current);
    }

}


/**
 Notes
 1. How do you traverse using an array ?
 2. What Data Structure do you store the graph?
    > Use a map to map out the neighbours to uses
 3. Should you convert input array to graph ?
    > Use a map
 */