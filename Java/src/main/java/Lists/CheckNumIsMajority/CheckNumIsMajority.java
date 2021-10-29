package Lists.CheckNumIsMajority;

public class CheckNumIsMajority {

    public static void main(String [] args) {
        int [] nums = {2,4,5,5,5,5,5,6,6};
        int target = 5;
        System.out.println("Is majority ? " + isMajorityElement(nums, target));

        int [] nums2 = {10,100,101,101};
        int target2 = 101;
        System.out.println("Is majority ? " + isMajorityElement(nums2, target2));

    }

    public static boolean isMajorityElement(int[] nums, int target) {
        int maxOccurence = 0;

        // Traverse through nums
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != target)
                continue;
            maxOccurence++;
        }

        // Check if majortity element
        if (maxOccurence > nums.length / 2)
            return true;


        return false;
    }
}
