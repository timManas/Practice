package Lists.NextGreatestInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextGreatestInteger {

    public static void main(String [] args) {
//        int [] nums1 = {4,1,2};
//        int [] nums2 = {1,3,4,2};

//        int [] nums1 = {2,4};
//        int [] nums2 = {1,2,3,4};

        int [] nums1 = {1,3,5,2,4};
        int [] nums2 = {6,5,4,3,2,1,7};

        int [] nums3 = nextGreaterElement(nums1, nums2);

        for (int i : nums3)
            System.out.println(i);
    }

    public static int[] nextGreaterElement(int[] nums1Arr, int[] nums2Arr) {
        int [] output = new int [nums1Arr.length];
        int counter = 0;
        List<Integer> nums2List = new ArrayList<Integer>();
        for (int i : nums2Arr)
            nums2List.add(i);


        for (int i=0; i < nums1Arr.length; i++) {
            int number1 = nums1Arr[i];


            int nums2Next;
            if (nums2List.indexOf(number1) != nums2Arr.length - 1) {
                nums2Next = fetchNextGreatest(number1, nums2List);

                if (number1 < nums2Next) {
                    output[counter] = nums2Next;
                } else {
                    output[counter] = -1;
                }

            } else {
                output[counter] = -1;
            }
            counter++;


        }

        return output;
    }

    private static int fetchNextGreatest(int number, List<Integer> nums2List) {
        int greatest = number;
        int index = nums2List.indexOf(number);
        while (index < nums2List.size()) {
            if (greatest < nums2List.get(index)) {
                return nums2List.get(index);
            }
            index++;
        }

        return -1;
    }

}
