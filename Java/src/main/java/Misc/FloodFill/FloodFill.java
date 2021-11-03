package Misc.FloodFill;

public class FloodFill {
    public static void main(String [] args) {
//        int [] [] image = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int [] [] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int [] [] image = {{0,0,0}, {1,1,1}};

        int sr = 1;
        int sc = 1;
        int newColor = 1;
        int [][] output = floodFill(image, sr, sc, newColor);

        for (int [] i : output) {
            for (int  j : i)
                System.out.print(j + ",");
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return performFloodFill(image, sr, sc, newColor, image[sr][sc]);
    }

    private static int[][] performFloodFill(int[][] image, int sr, int sc, int newColor, int oldColour) {

        // Step1 - Find the coordinates top, bottom, left, right
        int top =  (sr <= 0) ? -1 : image[sr-1][sc] ;
        int bottom = (sr >= image.length-1) ? -1 : image[sr+1][sc];
        int left = (sc <= 0) ? -1 : image[sr][sc-1];
        int right = (sc >= image[sr].length-1) ? -1 : image[sr][sc+1];

        System.out.println("  left: " + left + "     top:" + top + "      right: " + right + "  bottom: " + bottom);

        // Step2 - Set the midColor to the newColor
        image[sr][sc] = newColor;

        // Step3 - Check the top, right, bottom, left colors
        // If they are already the newcolor, we ignore it (to prevent infinite loop)
        if (top == oldColour && top != newColor) {
            image[sr - 1][sc] = newColor;
            performFloodFill(image, sr-1, sc, newColor, oldColour);
        }

        if (right == oldColour && right != newColor) {
            image[sr][sc + 1] = newColor;
            performFloodFill(image, sr, sc+1, newColor, oldColour);
        }

        if (bottom == oldColour && bottom != newColor) {
            image[sr + 1][sc] = newColor;
            performFloodFill(image, sr+1, sc, newColor, oldColour);
        }

        if (left == oldColour && left != newColor) {
            image[sr][sc - 1] = newColor;
            performFloodFill(image, sr, sc-1, newColor, oldColour);
        }


        return image;
    }


}
