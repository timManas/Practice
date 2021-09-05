package Lists.MonotonicArray;

public class MonotonicArray {
    public static void main(String [] args) {
        int [][] input = {{1,2,2,3}, {6,5,4,4}, {1,3,2}, {1,2,4,5}};
        for (int [] i : input)
            System.out.println("Is Monotonic: " + isMonotonic(i));
    }

    public static boolean isMonotonic(int[] nums) {

        for (int i=0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1])
                return false;
        }

        return true;
    }
}
