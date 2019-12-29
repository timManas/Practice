import java.util.Arrays;

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World");
        int [] nums = {3,3};
//        int [] nums = {15, 7, 2, 11};
        int target = 6;

        // Create new Array which stores it in ascending order
        int [] sortedArray =  nums.clone();
        Arrays.sort(sortedArray);

        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }

        int index1 = -1;
        int index2 = -1;

        outerloop:
        for (int x=0; x < sortedArray.length; x++) {
            for (int y=1; y < sortedArray.length; y++) {
                if (y >= target) {
                    y++;
                    continue;
                }

                if (x >= target) {
                    x++;
                    continue;
                }

                int total = sortedArray[x] + sortedArray[y];
                if (total == target) {
                    System.out.println("Target Hit: on " + x + " " + y);
                    index1 = getOriginalIndex(nums, sortedArray[x]);
                    index2 = getOriginalIndex(nums, sortedArray[y]);
                    break outerloop;
                }
            }
        }
        int [] indexArray = new int[2];
        indexArray[0] = index1;
        indexArray[1] = index2;
        Arrays.sort(indexArray);

        System.out.println("Index: " + indexArray[0] + " " + indexArray[1]);


    }

    private static int getOriginalIndex(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value)
                return i;
        }
        return -1;
    }
}

