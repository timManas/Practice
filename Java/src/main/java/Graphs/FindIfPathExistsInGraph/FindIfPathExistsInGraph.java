package Graphs.FindIfPathExistsInGraph;

import java.util.*;

public class FindIfPathExistsInGraph {
    public static void main(String [] args) {
        int n = 3;
        int [][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;
        System.out.println("Is Valid Path: " + validPath(n, edges, source, destination) + "\n");

        int n1 = 6;
        int [][] edges1 = {{0,1},{1,2},{3,5},{5,4},{4,3}};
        int source1 = 0;
        int destination1 = 5;
        System.out.println("Is Valid Path: " + validPath(n1, edges1, source1, destination1) + "\n");
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        // Step1 - If input array empty, then return if source and destination are the same
        if (edges.length == 0) {
            return source == destination;
        }

        // Step2 - Create map to store the relationships of each node
        Map<Integer, Set<Integer>> map = new TreeMap<>();

        // Step3 - Populate the map with a set of the neighbours
        // Since this is a bidirectional graph, we need to check both ways
        for (int i=0; i<edges.length;i++) {
            int node = edges[i][0];
            int neighbour = edges[i][1];

            // Add node to neighbour set
            Set<Integer> set1 = new TreeSet<>();
            if (map.containsKey(node)) {
                set1 = map.get(node);
                set1.add(neighbour);
            }
            set1.add(neighbour);
            map.put(node,set1);


            // Add neighbour to node set
            Set<Integer> set2 = new TreeSet<>();
            if (map.containsKey(neighbour)) {
                set2 = map.get(neighbour);
                set2.add(node);
            }
            set2.add(node);
            map.put(neighbour, set2);

        }
        System.out.println("Map: " + map);

        // Step4- Traverse graph starting from source
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set = new TreeSet<>();
        set.add(source);
        traverseGraph(map, set, stack, source, destination);

        // Check if the set contains the destination
        return set.contains(destination);
    }

    // Traverse using Stacks for Depth First Search
    private static void traverseGraph(Map<Integer, Set<Integer>> map, Set<Integer> set, Stack<Integer> stack, int current, int destination) {

        // Traverse the nodes neighbour set
        List<Integer> neighbourList = new ArrayList<>(map.get(current));
        for (int i=0; i<neighbourList.size();i++) {
            int neighbour = neighbourList.get(i);

            // If neightbour already visted, we continue to the next
            if (set.contains(neighbour))
                continue;

            System.out.println("Current: " + current + "    Neighbour: " + neighbour);
            set.add(neighbour);
            traverseGraph(map, set, stack, neighbour, destination);
        }
    }

}


/**
 Notes
 1. How do you traverse using an array ?
 2. What Data Structure do you store the graph?
    > Use a map to map out the neighbours to uses
 3. Should you convert input array to graph ?
    > Use a map


 Holy cow, this was tricky but was able to answer myself
 */