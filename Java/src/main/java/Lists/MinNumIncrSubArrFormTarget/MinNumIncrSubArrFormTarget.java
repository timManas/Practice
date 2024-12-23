package Lists.MinNumIncrSubArrFormTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumIncrSubArrFormTarget {
    public static void main(String [] args) {

        int [] target2 = {3,1,5,4,2};
        System.out.println("Min Number: " + minNumberOperations(target2) + "\n");

        int [] target = {1,2,3,2,1};
        System.out.println("Min Number: " + minNumberOperations(target) + "\n");

        int [] target1 = {3,1,1,2};
        System.out.println("Min Number: " + minNumberOperations(target1) + "\n");


    }

    public static int minNumberOperations(int[] target) {
        List<Integer> current = new ArrayList<>();
        List<Integer> targetList = new ArrayList<>();

        // Initialize Lists
        for (int i : target) {
            current.add(0);
            targetList.add(i);
        }

        int count = 0;
        return findOperations(current, targetList, 0);
    }

    private static int findOperations(List<Integer> current, List<Integer> target, int count) {
        System.out.println("Current: " + current);


        if (current.isEmpty())
            return count;

        // Increment all in current
        current.replaceAll(integer -> integer + 1);
        count++;

        System.out.println("    Incremented Current: " + current);

        List<Integer> subList = new ArrayList<>();
        List<Integer> subTargetList = new ArrayList<>();

        for (int i=0; i<current.size(); i++) {
            System.out.println("    Current: " + current.get(i) + " | Target: " + target.get(i));

            if (current.get(i) == target.get(i)) {
                count = findOperations(subList, subTargetList, count);
                subList.clear();
                subTargetList.clear();
                System.out.println("    Count: " + count);
                continue;
            }

            subList.add(current.get(i));
            subTargetList.add(target.get(i));
        }

        if (!subList.isEmpty())
            count = findOperations(subList, subTargetList, count);



        return count;
    }
}
