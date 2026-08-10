package Lists.SmallestIndexWithEqualValue;

public class SmallestIndexWithEqualValue {
    public static void main (String [] args) {
        int [][] input = {
                {0,1,2},
                {4,3,2,1},
                {1,2,3,4,5,6,7,8,9,0},
                {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6}
        };
        for (int [] i : input) {
            System.out.println("SmallestEqual: " + smallestEqual(i) + "\n");
        }
    }

    public static int smallestEqual(int[] nums) {
        int smallest = -1;

        for (int i=0; i<nums.length; i++) {
            int current = i % 10;
            if (current == nums[i])
                return i;
        }

        return smallest;
    }
}
