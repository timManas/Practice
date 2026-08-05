package Lists.FourSum;

import java.util.*;

public class FourSum {
    public static void main(String [] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println("4Sum: " + fourSum(nums, target) + "\n");

        int [] nums1 = {2,2,2,2,2};
        int target1 = 8;
        System.out.println("4Sum: " + fourSum(nums1, target1) + "\n");

        int [] nums2 = {1,2,3,4};
        int target2 = 8;
        System.out.println("4Sum: " + fourSum(nums2, target2) + "\n");

        int [] nums3 = {0,0,0,0};
        int target3 = 0;
        System.out.println("4Sum: " + fourSum(nums3, target3) + "\n");

        int [] nums4 = {1,-2,-5,-4,-3,3,3,5};
        int target4 = -11;
        System.out.println("4Sum: " + fourSum(nums4, target4) + "\n");

        int [] nums5 = {1000000000,1000000000,1000000000,1000000000};
        int target5 = -294967296;
        System.out.println("4Sum: " + fourSum(nums5, target5) + "\n");
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Set<String> set = new TreeSet<>();

        Arrays.sort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));

        iLoop:
        for (int i=0; i<nums.length-3; i++) {
            jLoop:
            for (int j=i+1; j<nums.length-2; j++) {
                kLoop:
                for (int k=j+1; k < nums.length-1; k++) {
                    long first = nums[i];
                    long second = nums[j];
                    long third = nums[k];
                    long remaining = target - first - second - third;
                    String str = String.valueOf(first) + String.valueOf(second)  + String.valueOf(third) + String.valueOf(remaining);
                    System.out.println("Values: " + first + " " + second + " " + third  + "  remaining: " + remaining );

                    if (remaining < Integer.MIN_VALUE || remaining > Integer.MAX_VALUE) {
                        continue;
                    }

                    if (Arrays.binarySearch(nums, k+1, nums.length, (int) remaining) >= 0) {
                        System.out.println("Found");
                        List<Integer> temp = new ArrayList<>();
                        temp.add((int) first);
                        temp.add((int) second);
                        temp.add((int) third);
                        temp.add((int) remaining);
                        if (!set.contains(str)) {
                            output.add(temp);
                            set.add(str);
                        }
                    }


                }
            }
        }

        return output;
    }
}
