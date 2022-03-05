package Misc.RectangleOverlap;

import java.util.Arrays;

public class RectangleOverlap {
    public static void main(String [] args) {
        int [] rect1 = {0,0,2,2};
        int [] rect2 = {1,1,3,3};
        System.out.println("IsOverlap: " + isRectangleOverlap(rect1, rect2));

        int [] rect1a = {0,0,1,1};
        int [] rect2a = {1,0,2,1};
        System.out.println("IsOverlap: " + isRectangleOverlap(rect1a, rect2a));

    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Find the X range
        int [] rec1RangeX = {rec1[0], rec1[2]};
        int [] rec1RangeY = {rec1[1], rec1[3]};

        // Find the Y range
        int [] rec2RangeX = {rec2[0], rec2[2]};
        int [] rec2RangeY = {rec2[1], rec2[3]};



        System.out.println("Rec1 X: " + Arrays.toString(rec1RangeX) + "     Y: " + Arrays.toString(rec1RangeY));
        System.out.println("Rec1 X: " + Arrays.toString(rec2RangeX) + "     Y: " + Arrays.toString(rec2RangeY));

        return true;
    }
}
