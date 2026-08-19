package Lists.MinSubSeqNonDecrOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinSubSeqNonDecrOrder {

    public static void main(String [] args) {
        int [][] input = {{4,3,10,9,8}, {4,4,7,6,7}};
        for (int [] i : input) {
            System.out.println("min SubSeq: " + minSubsequence(i) + "\n");
        }
    }

    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int listTotal = 0;
        List<Integer> list = new ArrayList<>();

        int total = 0;
        for (int i : nums)
            total += i;

        for (int i=nums.length-1; i >= 0; i--) {
            int current = nums[i];
            System.out.println("current: " + current +  "    listTotal: " + listTotal + "    total: " + total);


            if (listTotal <= total) {
                list.add(current);

                listTotal+=current;
                total -= current;
            }

        }





        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}
