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
    }

    public static int searchInsert(int[] nums, int target) {
        return getPosition(nums, target, 0, nums.length - 1);
    }

    private static int getPosition(int[] nums, int target, int start, int end) {

        int middle = (start + end) / 2;
        System.out.println("middle position: "  + middle + "    element: " + nums[middle] + "   start: " + start + "    end: " + end);


        if (nums[middle] == target)
            return middle;
        else if (nums[middle] < target) {

            if (start >= middle)
                return middle;

            return getPosition(nums, target, start, middle - 1);
        } else if (nums[middle] > target) {
            if (start <= middle)
                return middle;

            return getPosition(nums, target, middle + 1, end);
        }

        return -1;
    }
}
