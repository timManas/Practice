package Lists.CountSpecialQuadruplets;

public class CountSpecialQuadruplets {
    public static void main(String [] args) {
//        int [][] inputs = {{1,2,3,6}, {3,3,6,4,5}, {1,1,1,3,5}, {1,2,3,4,5,6,7,8,9,10}};
//        int [][] inputs = {{1,2,3,4,5,6,7,8,9,10}};
        int [][] inputs = {{25,69,18,24,60,7,49}};
        for (int [] i : inputs)
            System.out.println("Num Quadruplets: " + countQuadruplets(i));
    }

    public static int countQuadruplets(int[] nums) {
        int count = 0;

        if (nums.length <= 3)
            return count;

        for (int i=3; i<nums.length; i++) {
            int indexA = 0;
            int indexB = 1;
            int indexC = 2;
            int target = i;

            while (indexA != nums.length - 3 && indexB != nums.length - 2 && indexC != nums.length - 1) {
                System.out.println("indexA: " + nums[indexA] + "    indexB: " + nums[indexB] + "    indexC: " + nums[indexC] + "    target: " + nums[target]);

                if (nums[indexA] + nums[indexB] + nums[indexC] == nums[target]) {
//                    System.out.println("Quadruplet Found");
                    count++;
                }

                if (indexC == target - 1) {

                    if (indexB == target - 2) {

                        if (indexA == target-3) {
                            break;
                        } else {
                            indexA++;
                        }

                    } else {
                        indexB++;
                    }

                } else {
                    indexC++;
                }
            }

            System.out.println();

        }

        return count;
    }
}
