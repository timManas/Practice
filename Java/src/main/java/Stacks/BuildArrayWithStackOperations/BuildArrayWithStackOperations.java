package Stacks.BuildArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {

    public static void main (String [] args) {
        int [] target = {1,3};
        int n = 3;

        System.out.println("Build Array: " + buildArray(target, n));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> buildList = new ArrayList<>();

        int current = 1;
        for (int targetNum : target) {

            // If not match, we add push & pop
            while (current != targetNum) {
                buildList.add("Push");
                buildList.add("Pop");
                current++;
            }

            // At this poiint it matches ... just add a push
            buildList.add("Push");
            current++;
        }


        return buildList;
    }
}
