package Lists.SignOfProductOfArray;

public class SignOfProductOfArray {
    public static void main (String [] args) {
        int [][] input = {{-1,-2,-3,-4,3,2,1}, {1,5,0,2,-3}, {-1,1,-1,1,-1}};
        for (int [] nums : input)
            System.out.println("Array Sign: " + arraySign(nums));
    }

    public static int arraySign(int[] nums) {
        int sign = 1;

        // Traverse through Array
        for (int i=0; i < nums.length;i++) {

            // Check for zero. Anything divided by zero is 0
            if (nums[i] == 0)
                return 0;
            else if (nums[i] > 0)
                sign *= 1;
            else if (nums[i] < 0)
                sign *= -1;
        }

        return sign;
    }
}
