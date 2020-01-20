package Lists.RotateArray;

public class RotateArray {

    public static void main(String [] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int rotate = 3;
        rotate(nums, rotate);
    }

    public static void rotate(int[] nums, int rotate) {

        System.out.println("====");

        if (rotate == 0)
            return;

        int temp = -1;
        if (nums.length == 0)
            return;

        temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {

            if (i == 0)
                nums[i] = temp;
            else
                nums[i] = nums[i - 1];

            System.out.println(nums[i]);
        }

        rotate(nums, rotate -1);


        return;
    }
}
