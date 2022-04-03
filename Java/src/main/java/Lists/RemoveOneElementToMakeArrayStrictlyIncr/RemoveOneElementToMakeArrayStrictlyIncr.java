package Lists.RemoveOneElementToMakeArrayStrictlyIncr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveOneElementToMakeArrayStrictlyIncr {
    public static void main(String [] args) {
        int [][] input = {{1,2,10,5,7}, {2,3,1,2}, {1,1,1}, {100,21,3},{100,21,100}};
        for (int [] i : input)
            System.out.println("can be increasing: " + canBeIncreasing(i) + "\n");
    }

    public static boolean canBeIncreasing(int[] nums) {
        if (nums.length == 1)
            return false;
        if (nums.length == 2)
            return true;


        List<Integer> numsList = new ArrayList<>();
        for (int i : nums) numsList.add(i);

        List<Integer> subList = new ArrayList<>();

        for (int i=0; i<numsList.size(); i++) {
            subList.clear();

            int current = numsList.get(i);
            int next = i == numsList.size() - 1 ? -1 : numsList.get(i + 1);
            System.out.println("current: " + current + "    next: " + next);

            if (current < next)
                continue;

            List<Integer> left = numsList.subList(0, i);
            List<Integer> right = numsList.subList(i + 1, numsList.size());
            subList.addAll(left);
            subList.addAll(right);

            // Check if subList Increasing
            int prev = subList.get(0);
            boolean isIncreasing = true;
            for (int x=1; x<subList.size(); x++) {
                if (prev >= subList.get(x)) {
                    isIncreasing = false;
                    break;
                }
            }

            if (isIncreasing)
                return true;

            System.out.println("left: " + left + "      right: " + right);

        }


        return false;
    }


}
