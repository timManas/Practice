package Misc.FloodFill;

public class FloodFill {
    public static void main(String [] args) {
        int [] [] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int [][] output = floodFill(image, sr, sc, newColor);

        for (int [] i : output) {
            for (int  j : i)
                System.out.print(j + ",");
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {


        return image;
    }
}
