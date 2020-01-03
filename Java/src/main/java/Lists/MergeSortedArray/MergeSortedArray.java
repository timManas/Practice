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

        int [] sortedArray = new int[nums1.length];

        int counter = 0;
        for (int i=0; i < nums1.length; i++) {

            if (m >= (i+1)) {
                continue;
            }

            if (n >= (counter+1)) {
                nums1[i] = nums2[counter++];
            }

        }
        Arrays.sort(nums1);



        for (int i : nums1)
            System.out.println(i);

    }
}
