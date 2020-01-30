package Lists.ContainsDuplicates;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String [] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("ContainsDuplicates: " + containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (set.contains(i))
                return true;
            set.add(i);
        }

        return false;
    }
}
