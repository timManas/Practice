package Lists.FindMaxDifference;

public class FindMaxDifference {
    public static void main(String [] args) {
        int [][] input = {{7,1,5,4}, {9,4,3,2}, {1,5,2,10}};
        for (int[] i : input)
            System.out.println("Max Diff: " + maximumDifference(i));
    }

    public static int maximumDifference(int[] nums) {
        int maxDiff = -1;

        for (int i=0; i<nums.length;i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] >= nums[j])
                    continue;

                maxDiff = (nums[j] - nums[i]) > maxDiff ? (nums[j] - nums[i]) : maxDiff;
            }
        }


        return maxDiff;
    }
}
