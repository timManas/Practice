package Misc.FloodFill;

public class FloodFill {
    public static void main(String [] args) {
//        int [] [] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int [] [] image = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sr = 2;
        int sc = 2;
        int newColor = 2;
        int [][] output = floodFill(image, sr, sc, newColor);

        for (int [] i : output) {
            for (int  j : i)
                System.out.print(j + ",");
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        // Find the coordinates
        int top =  (sr <= 0) ? -1 : image[sr-1][sc] ;
        int bottom = (sr >= image.length-1) ? -1 : image[sr+1][sc];
        int left = (sc <= 0) ? -1 : image[sr][sc-1];
        int right = (sc >= image[sr].length-1) ? -1 : image[sr][sc+1];

        System.out.println("  left: " + left + "     top:" + top + "      right: " + right + "  bottom: " + bottom);


        return image;
    }
}
