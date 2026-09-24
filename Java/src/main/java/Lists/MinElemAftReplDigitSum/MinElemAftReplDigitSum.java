package Lists.MinElemAftReplDigitSum;

public class MinElemAftReplDigitSum {
    public static void main(String [] args) {
        int [][] input = {{10,12,13,14}, {1,2,3,4}, {999,19,199}};
        for (int [] i : input)
            System.out.println("minElement: " + minElement(i) + "\n");
    }

    public static int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            String [] arr = String.valueOf(current).split("");

            int sum = 0;
            for (String digit : arr) {
                sum += Integer.parseInt(digit);
            }

            min = Math.min(min, sum);
        }

        return min;
    }

}
