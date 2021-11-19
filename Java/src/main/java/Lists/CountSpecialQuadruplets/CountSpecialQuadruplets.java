package Lists.CountSpecialQuadruplets;

public class CountSpecialQuadruplets {
    public static void main(String [] args) {
//        int [][] inputs = {{1,2,3,6}, {3,3,6,4,5}, {1,1,1,3,5}, {28,8,49,85,37,90,20,8}};
//        int [][] inputs = {{1,2,3,4,5,6,7,8,9,10}};
        int [][] inputs = {{28,8,49,85,37,90,20,8}};
        for (int [] i : inputs)
            System.out.println("Num Quadruplets: " + countQuadruplets(i));
    }

    public static int countQuadruplets(int[] nums) {
        int count = 0;

        // Step1 - Check the size of the input array
        if (nums.length <= 3)
            return count;

        // Step2 - Traverse the array one by one
        for (int x=0; x < nums.length; x++) {
            for (int y= x+1; y < nums.length; y++) {
                for (int z=y+1; z < nums.length; z++) {
                    for (int target=z+1; target < nums.length; target++) {

                        // Step3 - Check if elements equal to the target. Increase count
                        if (nums[x] + nums[y] + nums[z] == nums[target]) {
                            System.out.println("x: " + nums[x] + "  y: " + nums[y] + "  z: " + nums[z] + "  targer: " + nums[target]);

                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}
