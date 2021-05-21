package Lists.IntersectionOfArraysII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArraysII {

    public static void main(String [] args) {

//        int [] nums1 = {4,9,5};
//        int [] nums2 = {9,4,9,8,4};

//        int [] nums1 = {1,2,2,1};
//        int [] nums2 = {2,2};

//        int [] nums1 = {2,1};
//        int [] nums2 = {1,2};

//        int [] nums1 = {1,1};
//        int [] nums2 = {1,2};

//        int [] nums1 = {1,2};
//        int [] nums2 = {1,1};

//        int [] nums1 = {4,7,9,7,6,7};
//        int [] nums2 = {5,0,0,6,1,6,2,2,4};

        int [] nums1 = {93,57,18,68,93,31,36,11,27,82,3,91,58,36,21,26,72,53,15,9,56,68,89,37,54,40,87,61,82, 24 ,8,68,80,36,31,11,51,45,66,78,70,93,44,45,19,23};
        int [] nums2 = {24,30,85,26,19,82,20,92,34,31,15,43,83,40,15,0,87,60,11,2,0,26,49,14,19,18,55,21,96,68,30,50,11,59,8,89,51,59,76,16,59,28,88,3,87,94,0,36,70,80,8,65,84,88,28,91,96};


        int [] intersection = intersect(nums1, nums2);
        for (int i : intersection)
            System.out.println(i);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int [] arr;
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int [] longestArr =  nums1.length < nums2.length ? nums2 : nums1;
        int [] smallerArr =  nums1.length < nums2.length ? nums1 : nums2;

        int sIndex = 0;
        int lIndex = 0;
        while (lIndex < longestArr.length) {

            // Step 1 - Check if we have gone through ALL the elements in the smaller array
            if (sIndex >= smallerArr.length) {
                System.out.println(intersection);
                return convert2Array(intersection);
            }

            // Step 2 - If equal a. We add the value to the list, reset lIndex to start from beginning, Then move smaller index counter
            if (longestArr[lIndex] == smallerArr[sIndex]) {
                intersection.add(longestArr[lIndex]);
                longestArr[lIndex] = Integer.MAX_VALUE;
                lIndex = 0;
                sIndex++;
                continue;
            }

            // Move smaller index counter if we reach the very last element
            if (lIndex == longestArr.length - 1) {
                lIndex = 0;
                sIndex++;
                continue;
            }

            lIndex++;
        }

        System.out.println(intersection);
        return convert2Array(intersection);
    }

    private static int[] convert2Array(ArrayList<Integer> intersection) {

        int [] arr = new int[intersection.size()];
        for (int i=0; i < intersection.size(); i++) {
            arr[i] = intersection.get(i);
        }
        return arr;
    }

}
