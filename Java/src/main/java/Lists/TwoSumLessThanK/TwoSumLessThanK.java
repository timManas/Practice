package Lists.TwoSumLessThanK;

import java.util.*;

public class TwoSumLessThanK {
    public static void main(String [] args) {
        int [] nums = {34,23,1,24,75,33,54,8};
        int k = 60;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums,k));

        int [] nums2 = {10,20,30};
        int k2 = 15;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums2,k2));

        int [] nums3 = {254,914,110,900,147,441,209,122,571,942,136,350,160,127,178,839,201,386,462,45,735,467,153,415,875,282,204,534,639,994,284,320,865,468,1,838,275,370,295,574,309,268,415,385,786,62,359,78,854,944};
        int k3 = 200;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums3,k3));


        int [] nums4 = {499,451,631,986,937,847,540,697,502,12,166,633,536,603,316,645,182,976,79,404,893,749,823,753,428,943,868,755,223,904,205,541,407,308,829,751,703,156,529,67,785,422,691,905,928,706,594,203,548,662};
        int k4 = 1900;
        System.out.println("Two Sum Less than K: " + twoSumLessThanK(nums4,k4));
    }

    public static int twoSumLessThanK(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();

        // Step1 - Sort the arrays
        Arrays.sort(nums);

        // Step2 - Traverse array one by one
        out:
        for (int i=0; i < nums.length - 1; i++) {
            int currentI = nums[i];

            if (currentI >= k)
                break;

            in:
            for (int j=i+1; j < nums.length; j++) {
                int total = nums[j] + currentI;

                if (nums[j] >= k || total >= k) {
                    break ;
                }
                set.add(nums[j] + currentI);
            }

        }

        System.out.println("Set:" + set);

        // Step3 - Return the last element;
        List<Integer> list = new ArrayList<>(set);
        return list.size() <= 0 ? -1 : list.get(list.size() - 1);
    }


}
