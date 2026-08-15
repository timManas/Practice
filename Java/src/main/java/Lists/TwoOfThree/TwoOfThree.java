package Lists.TwoOfThree;

import java.util.*;

public class TwoOfThree {
    public static void main(String [] args) {
        int [] nums1 = {1,1,3,2};
        int [] nums2 = {2,3};
        int [] nums3 = {3};
        System.out.println("twoOutThree: " + twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> output = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);

        int [][] nums = {nums1, nums2, nums3};
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1.length, o2.length);
            }
        });

        int [] max = nums[2];
        int [] mid = nums[1];
        int [] min = nums[0];

        maxLoop:
        for (int i=0; i<max.length; i++) {
            int maxCurrent = max[i];

            for (int j=0; j<mid.length; j++) {
                int midCurrent = mid[j];

                if (maxCurrent == midCurrent) {
                    set.add(maxCurrent);
                    continue maxLoop;
                }
            }

            for (int k=0; k<min.length; k++) {
                int minCurrent = min[k];

                if (maxCurrent == minCurrent) {
                    set.add(maxCurrent);
                    continue maxLoop;
                }
            }
        }


        for (int j=0; j<mid.length; j++) {
            int midCurrent = mid[j];

            for (int k=0; k<min.length; k++) {
                int minCurrent = min[k];

                if (midCurrent == minCurrent) {
                    set.add(midCurrent);
                    break;
                }
            }
        }






        return new ArrayList<>(set);
    }
}
