package Lists.MinimumPairRemoveSortArray;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemoveSortArray {
    public static void main(String [] args) {
        int [][] input = {{5,2,3,1}, {1,2,2}};
        for (int [] arr : input)
            System.out.println("min pair removal: " + minimumPairRemoval(arr) + "\n");
    }

    public static int minimumPairRemoval(int[] nums) {
        int minNumRemoval = 0;

        List<Integer> list = new ArrayList<>();
        for (int i : nums) list.add(i);


        while (!isSorted(list)) {
            System.out.println("list: " + list);
            int min = Integer.MAX_VALUE;
            int smallestIndex = 0;
            for (int i=0; i<list.size()-1; i++) {
                int current = list.get(i);
                int next = list.get(i+1);
                int sum = current + next;

                if (min > sum) {
                    min = sum;
                    smallestIndex = i;
                }
            }

            // Update the list and remove the smallest sum
            list.set(smallestIndex, min);
            list.remove(smallestIndex+1);
            ++minNumRemoval;
        }


        return minNumRemoval;
    }



    private static boolean isSorted(List<Integer> nums) {

        for (int i=0; i<nums.size()-1;i++) {
            if (nums.get(i) > nums.get(i+1))
                return false;
        }

        return true;
    }
}
