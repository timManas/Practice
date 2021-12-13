package Trees.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String [] args) {
        int [][] input = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},{1,1,0,1,1,1}, {1,0,1,1,0,1}};
        for (int [] i : input)
            System.out.println("Find Max Consecutive Ones: " + findMaxConsecutiveOnes(i));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i=0; i < nums.length; i++) {
            int left = -1;
            int right = -1;

            int leftIndex = (2*i) + 1;
            int rightIndex = (2*i) + 2;


            if (leftIndex < nums.length)
                left = nums[leftIndex];
            if (rightIndex < nums.length)
                right = nums[rightIndex];

            System.out.println("i: " + i + "    current: " + nums[i] + "    left: " + left + "    right: " + right);
        }

        return max;
    }
}
