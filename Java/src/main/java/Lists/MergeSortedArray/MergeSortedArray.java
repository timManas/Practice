package Lists.MergeSortedArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

    public static void main(String [] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {


        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[i - n];
            }
        }
        Arrays.sort(nums1);
        System.out.println();

    }
}
