package Lists.HeightChecker;

import java.util.Arrays;

public class HeightChecker {
    public static void main (String [] args) {
        int [][] input = {{1,1,4,2,1,3}, {5,1,2,3,4}, {1,2,3,4,5}};
        for (int [] heights : input)
            System.out.println("Height Checker: " + heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int incorrectHeightsNum = 0;

        int [] original = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);

        for (int i=0; i < heights.length; i++) {
            if (original[i] != heights[i])
                incorrectHeightsNum++;
        }

        return incorrectHeightsNum;
    }
}
