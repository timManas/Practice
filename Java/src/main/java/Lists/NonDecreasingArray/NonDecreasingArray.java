package Lists.NonDecreasingArray;

public class NonDecreasingArray {
    public static void main(String [] args) {
//        int [] nums = {4,2,3};
        int [] nums = {3,4,2,3};
        System.out.println("NoDecreasing: " + checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {

        boolean isSwitched = false;
        for (int i=1; i < nums.length; i++) {

            int preNum = nums[i - 1];
            int currentNum = nums[i];

            if (preNum > currentNum) {
                if (isSwitched)
                    return false;

                isSwitched = true;
                nums[i-1] = currentNum - 1;
                System.out.println();
            }


        }
        return true;
    }
}
