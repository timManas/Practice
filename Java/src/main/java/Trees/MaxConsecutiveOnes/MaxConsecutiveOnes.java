package Trees.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String [] args) {
        int [][] input = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},{1,1,0,1,1,1}, {1,0,1,1,0,1}};
        for (int [] i : input)
            System.out.println("Find Max Consecutive Ones: " + findMaxConsecutiveOnes(i));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int consecutiveOnes = 0;
        traverseArray(nums, 0);

        return max;
    }

    private static void traverseArray(int[] nums, int index) {

        if (index >= nums.length)
            return;

        int leftIndex = (2*index) + 1;
        int rightIndex = (2*index) + 2;


        traverseArray(nums, leftIndex);
        System.out.println("Current: " + nums[index]);
        traverseArray(nums, rightIndex);


    }
}
