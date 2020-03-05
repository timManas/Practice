package Lists.ContainsDuplicatesII;

public class ContainDuplicatesII {

    public static void main(String [] args) {

//        int [] nums = {1,2,3,1};
//        int k = 3;

        int [] nums = {1,2,3,1,2,3};
        int k = 2;


        System.out.println("ContainsDuplicates: " + containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i=0; i < nums.length; i++) {

            System.out.println("Index: " + i + " Value: " + nums[i]);

            if ((i + k) >= nums.length) {
                return false;
            }

            int currentVal = nums[i];
            int kVal = nums[i + k];

            if (currentVal == kVal)
                return true;
        }

        return false;
    }

}
