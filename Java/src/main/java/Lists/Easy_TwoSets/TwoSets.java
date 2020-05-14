package Lists.Easy_TwoSets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSets {

    public static void main(String [] args) {
//        int [] nums = {15, 7, 2, 11};
//        int [] nums = {2,5,5,11};
        int [] nums = {1,0,3,0};
        int target = 0;

//        int [] nums = {2,7,11,15};
//        int target = 9;

//        int [] nums = {-3,4,3,90};
//        int target = 0;

        int [] sum = twoSum(nums, target);
        Arrays.sort(sum);
        System.out.println("Index: " + sum[0] + " " + sum[1]);


    }

    // Brute Force way
    private static int[] twoSum(int[] nums, int target) {

        /**

         Solution #1
         - Take nums array for what it is and traverse by having two indexs
         - If one index is higher than the target, then ignore
         */

        // 15,6,1,2         Target 3

        outerloop:
        for (int i=0; i < nums.length; i++) {

            innerloop:
            for(int j=i+1; j < nums.length; j++) {

                int total = nums[i] + nums[j];
                if (total == target) {
                    int [] indexArray = new int[2];
                    indexArray[0] = i;
                    indexArray[1] = j;
                    return indexArray;
                }

            }
        }
        return null;
    }




}
