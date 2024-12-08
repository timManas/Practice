package Math.LargestNumberAtLeastTwiceOthers;

public class LargestNumberAtLeastTwiceOthers {
    public static void main(String [] args) {
        int [][] input = {{3,6,1,0}, {1,2,3,4}};
        for (int [] i : input)
            System.out.println("Dominant Index: " + dominantIndex(i) + "\n");
    }

    public static int dominantIndex(int[] nums) {
        int index = -1;

        int highest = 0;
        for (int i=0; i<nums.length; i++) {
            if (highest < nums[i]) {
                highest = nums[i];
                index = i;
            }
        }
        System.out.println("Highest: " + highest);

        for (int i : nums) {
            System.out.println(i);
            if (i != highest && 2*i > highest)
                return -1;
        }

        return index;
    }
}
