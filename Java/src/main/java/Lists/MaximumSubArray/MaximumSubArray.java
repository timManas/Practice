package Lists.MaximumSubArray;

public class MaximumSubArray {

    public static void main(String [] args) {

        int [] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Sub Array Sum: " + maxSubArray(input));
    }

    public static int maxSubArray(int[] nums) {
        int startIndex = 0;
        int stopIndex = 0;
        int max = 0;
        int currentTotal = 0;

        for (int i=0; i < nums.length; i++) {


            if (currentTotal <= 0 ) {
                startIndex = i;
                stopIndex = i;


            } else if (currentTotal > 0 ) {
               currentTotal = currentTotal + nums[i];
            }



        }

        return max;
    }

}
