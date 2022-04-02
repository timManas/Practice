package Lists.RemoveOneElementToMakeArrayStrictlyIncr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveOneElementToMakeArrayStrictlyIncr {
    public static void main(String [] args) {
        int [][] input = {{1,2,10,5,7}, {2,3,1,2}, {1,1,1}, {100,21,3}};
        for (int [] i : input)
            System.out.println("can be increasing: " + canBeIncreasing(i) + "\n");
    }

    public static boolean canBeIncreasing(int[] nums) {

        if (nums.length == 1)
            return false;
        if (nums.length == 2)
            return true;

        // Step1 - Create set to see if all unique elements. Also sort them
        Set<Integer> set = new TreeSet<>();
        for (int i : nums) {
            if (set.contains(i))
                return false;
            set.add(i);
        }
        System.out.println("Set: " + set);

        // Step2 - Count numDiff
        int numDiff = 0;
        int index = 0;
        List<Integer> sortedList = new ArrayList<>(set);
        for (int i=0; i < set.size();i++) {
            int num = nums[i];
            int sortedNum = sortedList.get(index);

            if (num != sortedNum) {
                numDiff++;
                continue;
            }

            index++;
        }
        System.out.println("Count Diff: " + numDiff);

        return numDiff == 1;
    }
}
