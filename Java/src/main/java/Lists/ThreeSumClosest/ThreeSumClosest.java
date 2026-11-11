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
    }

    public static int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        Arrays.sort(nums);
        System.out.println("nums: " + Arrays.toString(nums));

        for (int i=0; i<nums.length-2; i++) {
            int first = nums[i];
            for (int j=i+1; j < nums.length-1; j++) {
                int second = nums[j];
                for (int k=j+1; k < nums.length; k++) {
                    int third = nums[k];

                    int sum = first + second + third;
                    int diff = Math.abs(target - sum);
                    if (diff == 0)
                        return sum;
                    if (!map.containsKey(diff))
                        map.put(diff, sum);
                    System.out.println("first: " + first + "    second: " + second + "      third: " + third + "        sum: " + sum);
                }
            }
        }

        System.out.println("map: " + map);

        List<Integer> diffList = new ArrayList<>(map.keySet());
        return map.get(diffList.get(0));


    }
}

/*
-4 -1 1 2  target = -2

-4-1+1 = -4

-4 1 2 = -1

-1 1 2 = 2


 */