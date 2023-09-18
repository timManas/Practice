package Lists.CountPairsLessThanTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsLessThanTarget {
    public static void main(String [] args) {
        int [] nums = {-1,1,2,3,1};
        int target = 2;
        List<Integer> numsList = new ArrayList<>();
        for (int i : nums) numsList.add(i);
        System.out.println("countPairs: " + countPairs(numsList, target) + "\n");


        int [] nums1 = {-6,2,5,-2,-7,-1,3};
        int target1 = -2;
        List<Integer> numsList1 = new ArrayList<>();
        for (int i : nums1) numsList1.add(i);
        System.out.println("countPairs: " + countPairs(numsList1, target1) + "\n");
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        if (nums.size() == 0) return count;

        for (int i=0; i<nums.size() - 1; i++) {
            for (int x=i+1; x<nums.size(); x++) {
                int current = nums.get(i);
                int next = nums.get(x);

                if (current + next < target) count++;
            }
        }

        return count;
    }
}
