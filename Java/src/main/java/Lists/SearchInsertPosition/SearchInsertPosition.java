package Lists.SearchInsertPosition;

public class SearchInsertPosition {
    public static void main(String [] args) {
        int [] nums = {1,3,5,6};
        int target = 5;
        System.out.println("search Insert: " + searchInsert(nums, target) + "\n");

        int [] nums1 = {1,3,5,6};
        int target1 = 2;
        System.out.println("search Insert: " + searchInsert(nums1, target1) + "\n");

        int [] nums2 = {1,3,5,6};
        int target2 = 7;
        System.out.println("search Insert: " + searchInsert(nums2, target2) + "\n");

        int [] nums3 = {1,3,5,6};
        int target3 = 0;
        System.out.println("search Insert: " + searchInsert(nums3, target3) + "\n");
    }

    public static int searchInsert(int[] nums, int target) {

        // Find the closet position
        int index = getPosition(nums, target, 0, nums.length - 1);
        System.out.println("resulting index: " + index);

        // Check position is valid
        if (index > 0 && target < nums[index - 1])
            return index - 1;

        return index;
    }

    private static int getPosition(int[] nums, int target, int start, int end) {

        // Stop loop if start and end no longer are valid
        if (start > end)
            return -1;

        // Step1 - Find the mid point
        int middle = (start + end) / 2;
        System.out.println("middle position: "  + middle + "    element: " + nums[middle] + "   start: " + start + "    end: " + end);

        // Step2 - Use recursion to find the closet position
        // return -1 if the start and end are no longer valid
        if (nums[middle] == target)
            return middle;
        else if (nums[middle] < target) {
            int result = getPosition(nums, target, middle + 1, end);
            return result <= -1 ? middle + 1: result;
        } else if (nums[middle] > target) {
            int result = getPosition(nums, target, start, middle - 1);
            return result <= -1 ? middle + 1: result;
        }

        return -1;
    }
}
