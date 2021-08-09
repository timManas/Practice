package Lists.MinDistanceToTargetElement;

public class MinDistanceToTargetElement {
    public static void main(String [] args) {
        int [] nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        System.out.println("Min Distance: " + getMinDistance(nums,target, start));

        int [] nums2 = {1};
        int target2 = 1;
        int start2 = 0;
        System.out.println("Min Distance: " + getMinDistance(nums2,target2, start2));

        int [] nums3 = {1,1,1,1,1,1,1,1,1,1};
        int target3 = 1;
        int start3 = 0;
        System.out.println("Min Distance: " + getMinDistance(nums3,target3, start3));

        int [] nums4 = {5,2,3,5,5};
        int target4 = 5;
        int start4 = 2;
        System.out.println("Min Distance: " + getMinDistance(nums4,target4, start4));

        int [] nums5 = {2202,9326,1034,4180,1932,8118,7365,7738,6220,3440};
        int target5 = 3440;
        int start5 = 0;
        System.out.println("Min Distance: " + getMinDistance(nums5,target5, start5));

    }

    public static int getMinDistance(int[] nums, int target, int start) {

        // Step1 - Traverse Left and find closest Target
        int closestLeft = -1;
        for (int i=start; i >= 0; i--) {
            if (nums[i] == target) {
                closestLeft = i;
                break;
            }
        }

        // Step2 - Traverse Right
        int closestRight = -1;
        for (int i=start; i < nums.length; i++) {
            if (nums[i] == target) {
                closestRight = i;
                break;
            }

        }

        // Step3 - If only one sided, return the closes Index
        if (closestLeft == -1)
            return Math.abs(closestRight - start);
        if (closestRight == -1)
            return Math.abs(closestLeft - start);

        return Math.min(Math.abs(closestLeft - start), Math.abs(closestRight - start));
    }
}
