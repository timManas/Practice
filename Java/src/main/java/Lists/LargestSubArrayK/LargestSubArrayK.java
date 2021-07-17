package Lists.LargestSubArrayK;

import java.util.*;

public class LargestSubArrayK {
    public static void main(String [] args) {
        int [] nums = {1,4,5,2,3};
        int k = 3;
        System.out.println("Largest SubArray Length k: " + largestSubarray(nums, k));

        int [] nums1 = {1,4,5,2,3};
        int k1 = 4;
        System.out.println("Largest SubArray Length k: " + largestSubarray(nums1, k1));

        int [] nums2 = {1,4,5,2,3};
        int k2 = 1;
        System.out.println("Largest SubArray Length k: " + largestSubarray(nums2, k2));

    }

    public static int[] largestSubarray(int[] nums, int k) {

        List<List<Integer>> listOfSubList = new ArrayList<>();

        // Step1 - Convert nums to list
        // Why ? Because its easier for us to find the sub Array
        List<Integer> numsList = new ArrayList<>();
        for (int i=0; i<nums.length; i++)
            numsList.add(nums[i]);

        // Step2 - Find Sub Arrays
        for (int i=0; i < numsList.size(); i++) {
            // Break out look if our end is bigger than the size of the array
            if (i+k > numsList.size())
                break;

            // Fetch the subArray and put in list of SubList
            List<Integer> subList = numsList.subList(i, i+k);
            listOfSubList.add(subList);
            System.out.println("SubList: " + subList);
        }

        // Step3 - Compare the SubList
        Collections.sort(listOfSubList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> list1, List<Integer> list2) {
                for (int i=0; i < list1.size(); i++) {
                    if (list1.get(i) == list2.get(i))
                        continue;
                    else if (list1.get(i) > list2.get(i))
                        return 1;
                    else
                        return -1;
                }
                return 0;
            }
        });
        List<Integer> largestSubArrayList = listOfSubList.get(listOfSubList.size()-1);
        System.out.println("List of SubList: " + listOfSubList + "      Largest: " + largestSubArrayList);

        // Step4 - Convert to Array
        int [] output = new int[largestSubArrayList.size()];
        for (int i=0; i<largestSubArrayList.size();i++)
            output[i] = largestSubArrayList.get(i);

        return output;
    }
}

/**
 Notes
 - Not difficult at all but just requires some thinking
 - The trick here is to use a Comparator which compares two arrays

 Solution
 1. Create list of subList
 2. Fetch all the subList
 3. Sort the sublist using a comparator
    > Compare each element:
        If equal, move onto the next one
        If list1[i] > list2[i], then return 1
        If list1[i] < list2[i], then return -1
        Else continue
    > If nothing found, return 0
 4. Fetch the last element in thew newly sorted list of Sublist
 5. Convert back to array
 */
