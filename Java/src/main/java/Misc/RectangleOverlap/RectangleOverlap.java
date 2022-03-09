package Misc.RectangleOverlap;

import java.util.Arrays;

public class RectangleOverlap {
    public static void main(String [] args) {
//        int [] rect1 = {0,0,2,2};
//        int [] rect2 = {1,1,3,3};
//        System.out.println("IsOverlap: " + isRectangleOverlap(rect1, rect2) + "\n");
//
//        int [] rect1a = {0,0,1,1};
//        int [] rect2a = {1,0,2,1};
//        System.out.println("IsOverlap: " + isRectangleOverlap(rect1a, rect2a) + "\n");
//
//        int [] rect1b = {2,17,6,20};
//        int [] rect2b = {3,8,6,20};
//        System.out.println("IsOverlap: " + isRectangleOverlap(rect1b, rect2b) + "\n");

        int [] rect1c = {7,8,13,15};
        int [] rect2c = {10,8,12,20};
        System.out.println("IsOverlap: " + isRectangleOverlap(rect1c, rect2c) + "\n");
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        // X points TopLeft, TopRight, BottomLeft, BottomRight
        int [][] rec1Points = {{rec1[0], rec1[3]}, {rec1[2], rec1[3]}, {rec1[0], rec1[1]}, {rec1[2], rec1[1]}};
        int [][] rec2Points = {{rec2[0], rec2[3]}, {rec2[2], rec2[3]}, {rec2[0], rec2[1]}, {rec2[2], rec2[1]}};

        System.out.println("Rec1 points: " + Arrays.deepToString(rec1Points));
        System.out.println("Rec2 points: " + Arrays.deepToString(rec2Points));


        // Find the X range
        int [] rec1RangeX = {Math.min(rec1[0], rec1[2]), Math.max(rec1[0], rec1[2])};
        int [] rec1RangeY = {Math.min(rec1[1], rec1[3]), Math.max(rec1[1], rec1[3])};

        // Find the Y range
        int [] rec2RangeX = {Math.min(rec2[0], rec2[2]), Math.max(rec2[0], rec2[2])};
        int [] rec2RangeY = {Math.min(rec2[1], rec2[3]), Math.max(rec2[1], rec2[3])};

        System.out.println("Rec1 X: " + Arrays.toString(rec1RangeX) + "     Y: " + Arrays.toString(rec1RangeY));
        System.out.println("Rec1 X: " + Arrays.toString(rec2RangeX) + "     Y: " + Arrays.toString(rec2RangeY));

        // Find the points of intersection


//        // Check the X Axis
//        if (rec1RangeX[0] < rec2RangeX[0] && rec2RangeX[0] < rec1RangeX[1] && rec1RangeY[0] < rec2RangeY[0] && rec2RangeY[0] < rec1RangeY[1])
//            return true;
//        if (rec1RangeX[0] < rec2RangeX[1] && rec2RangeX[1] <= rec1RangeX[1] && rec1RangeY[0] < rec2RangeY[1] && rec2RangeY[1] <= rec1RangeY[1])
//            return true;

        for (int i=0; i < rec2Points.length; i++) {
            if (rec1RangeX[0] < rec2Points[i][0] && rec2Points[i][0] <= rec1RangeX[1] &&
                    rec1RangeY[0] < rec2Points[i][1] && rec2Points[i][1] <= rec1RangeY[1])
                return true;
        }

        return false;
    }
}
