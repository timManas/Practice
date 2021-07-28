package Lists.SumEvenNumAfterQueries;

public class SumEvenNumAfterQueries {
    public static void main(String [] args) {
       int [] nums = {1,2,3,4};
       int [][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
       int [] output = sumEvenAfterQueries(nums, queries);
       for (int i : output) {
           System.out.print(i + ",");
       }
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] output = new int[nums.length];

        return output;
    }
}
