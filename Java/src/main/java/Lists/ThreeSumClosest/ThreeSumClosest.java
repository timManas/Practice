package Lists.ThreeSumClosest;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String [] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println("ThreeSum: " + threeSumClosest(nums, target) + "\n");

        int [] nums1 = {0,0,0};
        int target1 = 4;
        System.out.println("ThreeSum: " + threeSumClosest(nums1, target1) + "\n");

        int [] nums2 = {10,20,30,40,50,60,70,80,90};
        int target2 = 1;
        System.out.println("ThreeSum: " + threeSumClosest(nums2, target2) + "\n");

        int [] nums3 = {1,3,4,7,8,9};
        int target3 = 15;
        System.out.println("ThreeSum: " + threeSumClosest(nums3, target3) + "\n");

        int [] nums4 = {0, 3, 97, 102, 200};
        int target4 = 300;
        System.out.println("ThreeSum: " + threeSumClosest(nums4, target4) + "\n");
    }

    public static int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        Arrays.sort(nums);

        int lowestDiff = Integer.MAX_VALUE;
        int lowestSum = 0;

        for (int i=0; i<nums.length-2; i++) {
            int first = nums[i];
            for (int j=i+1; j < nums.length-1; j++) {
                int second = nums[j];

                for (int k=j+1; k < nums.length; k++) {
                    int third = nums[k];
                    int sum = first + second + third;
                    int diff = Math.abs(target - sum);
                    System.out.println("first: " + first + "    second: " + second + "      third: " + third  + "   sum: " + sum + "    diff: " + diff +  "     lowestDiff: " + lowestDiff);
                    if (diff == 0) {
                        System.out.println("map: " + map);
                        return sum;
                    }

                    if (diff < lowestDiff) {
                        lowestDiff = diff;
                        lowestSum = sum;
                    }

                }
            }
        }

        return lowestSum;

    }
}

/*
-4 -1 1 2  target = -2

-4-1+1 = -4

-4 1 2 = -1

-1 1 2 = 2


 */